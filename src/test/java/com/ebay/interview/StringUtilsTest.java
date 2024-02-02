package com.ebay.interview;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {
    @Test
    public void testShiftPositiveTimes() {
        assertEquals(StringUtils.shiftString("abcdefghijklmnopqrstuvwxyz", 2), "yzabcdefghijklmnopqrstuvwx");
    }

    @Test
    public void testShiftNegativeTimes() {
        assertEquals(StringUtils.shiftString("abcdefghijklmnopqrstuvwxyz", -2), "cdefghijklmnopqrstuvwxyzab");
    }

    @Test
    public void testShiftZeroTimes() {
        assertEquals(StringUtils.shiftString("abcdefghijklmnopqrstuvwxyz", 0), "abcdefghijklmnopqrstuvwxyz");
    }
}