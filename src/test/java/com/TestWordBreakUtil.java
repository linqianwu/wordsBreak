package com;

import com.util.WordBreakUtil;
import org.junit.Assert;
import org.junit.Test;

public class TestWordBreakUtil {
    @Test
    public void testWordBreak() {
        String word1 = "ilikesamsungmobile";
        String word2 = "ilikeicecreamandmango";

        WordBreakUtil.wordBreak(word1);
        WordBreakUtil.wordBreak(word2);

    }
}
