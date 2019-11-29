package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void balancedTestIsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Hello]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("Hello[World]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]HelloWorld"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch Code] [Launch Code]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch Code [Launch]][]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch Code [Launch] [Code]]"));
    }

    @Test
    public void balancedTestReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("['a'"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
        assertFalse(BalancedBrackets.hasBalancedBrackets("[HelloWorld"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("Hello]World["));
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Hello World] [Hello "));
    }
}
