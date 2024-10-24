package com.chrisvega;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DemoLexerTest {
    @Test
    public void matchID() throws IOException {
        String testString = "id1";
        Reader StringReader = new StringReader(testString);
        DemoLexer lexer = new DemoLexer(StringReader);
        Token token = lexer.yylex();
        assertEquals(TokenConstant.ID, token.getTokenType());
    }

    @Test
    public void matchNum() throws IOException {
        String testString = "314458";
        Reader StringReader = new StringReader(testString);
        DemoLexer lexer = new DemoLexer(StringReader);
        Token token = lexer.yylex();
        assertEquals(TokenConstant.ID, token.getTokenType());
    }
}
