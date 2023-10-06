/* Copyright (c) 2007-2016 MIT 6.005 course staff, all rights reserved.
 * Redistribution of original or derived work requires permission of course staff.
 */
package rules;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * JUnit tests for RulesOf6005.
 */
public class RulesOf6005Test {

    @Test
    public void testMayUseCodeInAssignment1() {
        // Test case: Self-written code that is available to others and properly cited
        assertTrue("Expected true: self-written code available to others and properly cited",
                RulesOf6005.mayUseCodeInAssignment(true, true, true, true, false));
    }

    @Test
    public void testMayUseCodeInAssignment2() {
        // Test case: Code not written by yourself, but required for implementation
        // and available to others and properly cited
        assertTrue("Expected true: non-self-written code required for implementation and properly cited",
                RulesOf6005.mayUseCodeInAssignment(false, true, true, true, true));
    }

    @Test
    public void testMayUseCodeInAssignment3() {
        // Test case: Code not written by yourself, but required for implementation
        // and not available to others, but properly cited
        assertTrue("Expected true: non-self-written code required for implementation but not available to others",
                RulesOf6005.mayUseCodeInAssignment(false, false, true, true, true));
    }

    @Test
    public void testMayUseCodeInAssignment4() {
        // Test case: Code not written as coursework, not available to others,
        // and not properly cited
        assertFalse("Expected False: non-self-written code not written as coursework, not available to others, and not properly cited",
                RulesOf6005.mayUseCodeInAssignment(false, false, false, false, false));
    }

    @Test
    public void testMayUseCodeInAssignment5() {
        // Test case: Self-written code not required for implementation
        // and not properly cited
        assertTrue("Expected true: self-written code not required for implementation and not properly cited",
                RulesOf6005.mayUseCodeInAssignment(true, false, true, false, false));
    }
}