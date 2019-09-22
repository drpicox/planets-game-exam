package com.drpicox.game.matchers.map;

import com.drpicox.game.interpreter.Context;
import com.drpicox.game.interpreter.Instruction;
import com.drpicox.game.tools.Json;
import org.springframework.stereotype.Component;

import java.util.regex.MatchResult;

import static com.drpicox.game.tools.JsonSubject.assertThat;

@Component
public class There_is_no_message_telling_X extends MapInstructionMatcher {
    public There_is_no_message_telling_X() {
        super("There is no message telling _([^_]+)_");
    }

    @Override
    public void interpretMatch(MatchResult match, Instruction instruction, Context context) {
        if (context.has("cellEntities")) return;

        var game = context.wantJson("game");
        var expected = new Json("{}");
        expected.set("text", match.group(1));



        assertThat(game).at("messages").notContainsMatch(expected);
    }
}
