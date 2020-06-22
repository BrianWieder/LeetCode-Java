package DIStringMatch;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DIStringMatchTest {
    DIStringMatch sol;

    @BeforeEach
    void setUp() {
        sol = new DIStringMatch();
    }

    @Test
    void diStringMatch() {
        assertTrue(diStringMatchHelper("IDID"));
        assertTrue(diStringMatchHelper("III"));
        assertTrue(diStringMatchHelper("DDI"));
    }

    boolean diStringMatchHelper(String s) {
        int[] nums = sol.diStringMatch(s);
        for(int i = 1; i <= s.length(); i++) {
            if(s.charAt(i-1) == 'I' && nums[i - 1] > nums[i]) {
                return false;
            } else if (s.charAt(i-1) == 'D' && nums[i - 1] < nums[i]) {
                return false;
            }
        }
        return true;
    }
}