package DIStringMatch;

import java.util.Arrays;

public class DIStringMatch {
    public int[] diStringMatch(String S) {
        int max = 0;
        int min = 0;
        int[] nums = new int[S.length() + 1];
        for(int i = 1; i <= S.length(); i++) {
            if(S.charAt(i - 1) == 'I') {
                nums[i] = ++max;
            } else {
                nums[i] = --min;
            }
        }

        for(int i = 0; i < nums.length; i++) {
            nums[i] -= min;
        }

        return nums;
    }
}
