public class Solution {
    public int canCompleteCircuit(final int[] A, final int[] B) {
        int total = 0;
        int curr = 0;
        int start = 0;

        for (int i = 0; i < A.length; i++) {
            int diff = A[i] - B[i];
            total += diff;
            curr += diff;

            if (curr < 0) {
                start = i + 1;
                curr = 0;
            }
        }

        if (total >= 0) {
            return start;
        } else {
            return -1;
        }
    }
}
