import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    public void testLengthOfLongestSubstringNoRepChar(){
        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew"; // Given examples
        String s4 = ""; // empty string
        String s5 = "abbccddccbba"; // previous occurrence is to the left of the start pointer (c)
        String s6 = "abcdefcghdijka"; // previous occurrence's position equals the current start pointer's position (d)
        String s7 = "  a  "; // leading and trailing spaces
        String s8 = " a bc e"; // multiple spaces
        String s9 = "什么？ 什she 什么纔事￥?"; // 汉字
        String s10 = "!@#$%^&*($)"; // special characters
        String s11 = "\r\n a"; // Line Feed character count as 1 char
        String s12 = "aaaAcAa"; // case sensitivity
        String s13 = "\"\\n"; // escape characters
        String s14 = "¡¿ÇçŒœßØaøÅåÆæÞþÐð«a»ŠšŽž"; // Accented characters
        String s15 = "適当に選んだ日本語文字文"; // 日文
        String s16 = "빠져123나가다abc상대져방"; // 谚文
        String s17 = "التى معينة، تستغيث يفهم"; // Arabic
        String s18 = "Кирилли́ческий алфави́т"; // Cyrillic

        assertEquals(3, Main.lengthOfLongestSubstringNoRepChar(s1));
        assertEquals(1, Main.lengthOfLongestSubstringNoRepChar(s2));
        assertEquals(3, Main.lengthOfLongestSubstringNoRepChar(s3));
        assertEquals(0, Main.lengthOfLongestSubstringNoRepChar(s4));
        assertEquals(2, Main.lengthOfLongestSubstringNoRepChar(s5));
        assertEquals(10, Main.lengthOfLongestSubstringNoRepChar(s6));
        assertEquals(2, Main.lengthOfLongestSubstringNoRepChar(s7));
        assertEquals(4, Main.lengthOfLongestSubstringNoRepChar(s8));
        assertEquals(10, Main.lengthOfLongestSubstringNoRepChar(s9));
        assertEquals(9, Main.lengthOfLongestSubstringNoRepChar(s10));
        assertEquals(4, Main.lengthOfLongestSubstringNoRepChar(s11));
        assertEquals(3, Main.lengthOfLongestSubstringNoRepChar(s12));
        assertEquals(3, Main.lengthOfLongestSubstringNoRepChar(s13));
        assertEquals(19, Main.lengthOfLongestSubstringNoRepChar(s14));
        assertEquals(11, Main.lengthOfLongestSubstringNoRepChar(s15));
        assertEquals(13, Main.lengthOfLongestSubstringNoRepChar(s16));
        assertEquals(11, Main.lengthOfLongestSubstringNoRepChar(s17));
        assertEquals(11, Main.lengthOfLongestSubstringNoRepChar(s18));
    }
}