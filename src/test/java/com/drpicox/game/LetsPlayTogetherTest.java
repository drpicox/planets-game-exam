package com.drpicox.game;

import com.drpicox.game.interpreter.PostTestFactory;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

@ActiveProfiles("test")
@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
public class LetsPlayTogetherTest {

    @Autowired private PostTestFactory postTestFactory;

    @TestFactory
    List<DynamicTest> makeTests() throws Exception {
        return postTestFactory.createTests("2019-12-08_lets_play_together");
    }
}
