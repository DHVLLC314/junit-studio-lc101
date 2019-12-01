package test;

import main.BalancedBrackets;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {
    //TODO: add tests here
    BalancedBrackets test_Class;

    @Before
    public void createBracketObject() {
        test_Class = new BalancedBrackets();
    }
    @Test
    public void balancedBracketsReturnsTrue(){
        assertTrue(test_Class.hasBalancedBrackets("[]"));
        assertTrue(test_Class.hasBalancedBrackets("Launch[Code]"));
        assertTrue(test_Class.hasBalancedBrackets(""));
        assertTrue(test_Class.hasBalancedBrackets("[Stephanie][Code]"));
        assertTrue(test_Class.hasBalancedBrackets("[]Paulson"));
        assertTrue(test_Class.hasBalancedBrackets("[Stephanie [Paulson] Code]"));
        assertTrue(test_Class.hasBalancedBrackets("[]"));
        assertTrue(test_Class.hasBalancedBrackets(""));
        assertTrue(test_Class.hasBalancedBrackets("[][]"));
        assertTrue(test_Class.hasBalancedBrackets("[Launch Code] [Launch Code]"));
        assertTrue(test_Class.hasBalancedBrackets("[Launch Code [Launch]][]"));
        assertTrue(test_Class.hasBalancedBrackets("[Launch Code [Launch] [Code]]"));
    }
    @Test
    public void balancedBracketsReturnFalse() {
        assertFalse(test_Class.hasBalancedBrackets("['a'"));
        assertFalse(test_Class.hasBalancedBrackets("[Stephanie's Code] [Paulson"));
        assertFalse(test_Class.hasBalancedBrackets("['a'"));
        assertFalse(test_Class.hasBalancedBrackets("]["));
        assertFalse(test_Class.hasBalancedBrackets("[HelloWorld"));
        assertFalse(test_Class.hasBalancedBrackets("Hello]World["));
        assertFalse(test_Class.hasBalancedBrackets("["));
        assertFalse(test_Class.hasBalancedBrackets("]"));
        assertFalse(test_Class.hasBalancedBrackets("[[]"));
        assertFalse(test_Class.hasBalancedBrackets("[Hello World] [Hello "));

    }
}
