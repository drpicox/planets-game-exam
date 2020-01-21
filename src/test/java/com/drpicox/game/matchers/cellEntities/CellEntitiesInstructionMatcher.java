package com.drpicox.game.matchers.cellEntities;

import com.drpicox.game.matchers.InstructionMatcher;

public abstract class CellEntitiesInstructionMatcher extends InstructionMatcher {
    public CellEntitiesInstructionMatcher(String regExp) {
        super(regExp);
        andRequires("game", "cellEntities");
    }
}
