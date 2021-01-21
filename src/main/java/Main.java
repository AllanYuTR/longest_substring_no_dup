import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.HashMap;
import java.util.Map;

public class Main {
    private final static Logger LOGGER = LoggerFactory.getLogger("Main");

    public static void main(String[] args) {
        String stringToTest = args[0];
        LOGGER.info("The string to test is: " + stringToTest);
        int answer = lengthOfLongestSubstringNoRepChar(stringToTest);
        LOGGER.info("The length of the longest substring without repeating character is: " + answer);
    }

    public static int lengthOfLongestSubstringNoRepChar(String string) {
        int answer = 0;
        Map<Character, Integer> charPositionMap = new HashMap<>(); // unique chars' positions
        int start = 0;
        int end = 0;
        int totalLength = string.length();
        while (end < totalLength) {
            Character currentChar = string.charAt(end);
            if (charPositionMap.containsKey(currentChar)) { // if the currentChar is already in the map
                int previousPosition = charPositionMap.get(currentChar);
                if (previousPosition >= start) { // and its position is NOT LEFT to the start pointer
                    start = previousPosition + 1; // move the start pointer one right to its position
                }
            }
            answer = Math.max(answer, end-start+1);
            charPositionMap.put(currentChar, end); // update the map
            end++;
        }
        return answer;
    }
}