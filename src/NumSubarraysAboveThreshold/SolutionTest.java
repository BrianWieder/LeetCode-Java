package NumSubarraysAboveThreshold;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution sol;


    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        sol = new Solution();
    }

    @org.junit.jupiter.api.Test
    void numOfSubarrays() {
        assertEquals(3,sol.numOfSubarrays(new int[]{2,2,2,2,5,5,5,8}, 3, 4));
        assertEquals(5,sol.numOfSubarrays(new int[]{1,1,1,1,1}, 1, 0));
        assertEquals(6,sol.numOfSubarrays(new int[]{11,13,17,23,29,31,7,5,2,3}, 3, 5));
        assertEquals(1,sol.numOfSubarrays(new int[]{7,7,7,7,7,7,7}, 7, 7));
        assertEquals(1,sol.numOfSubarrays(new int[]{4,4,4,4}, 4, 1));
    }
}