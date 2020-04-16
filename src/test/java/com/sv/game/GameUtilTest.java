package com.sv.game;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class GameUtilTest {

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void testGamePositiveCase(){
        try {
            Assert.assertEquals(9 , GameUtil.findWinner(10,7));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testInvalidChosenNumber() throws Exception{
        exceptionRule.expect(Exception.class);
        exceptionRule.expectMessage("Invalid number chosen");
        GameUtil.findWinner(10,-3);
    }

    @Test
    public void testBiggerChosenNumber() throws Exception{
        exceptionRule.expect(Exception.class);
        exceptionRule.expectMessage("chosen number cannot be greater than the number of players");
        GameUtil.findWinner(10,13);
    }

    @Test
    public void testNegativeNumberOfPlayers() throws Exception{
        exceptionRule.expect(Exception.class);
        exceptionRule.expectMessage("Invalid number of players");
        GameUtil.findWinner(-2,7);
    }

    @Test
    public void testNegativeChosenNumber() throws Exception{
        exceptionRule.expect(Exception.class);
        exceptionRule.expectMessage("Invalid number chosen");
        GameUtil.findWinner(7,-1);
    }

    @Test
    public void testTooManyPlayers() throws Exception{
        exceptionRule.expect(Exception.class);
        exceptionRule.expectMessage("Invalid number of players");
        GameUtil.findWinner(2000,5);
    }
}
