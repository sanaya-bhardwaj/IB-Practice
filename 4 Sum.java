import java.util.*;

public class Solution {
    public int[][] fourSum(int[] A, int B) {
        List<int[]> result = new ArrayList<>();
        int n = A.length;

        if (n < 4) return new int[0][0];

        Arrays.sort(A);

        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && A[i] == A[i - 1]) continue;

            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && A[j] == A[j - 1]) continue;

                int l = j + 1, r = n - 1;

                while (l < r) {
                    long sum = (long) A[i] + A[j] + A[l] + A[r];

                    if (sum == B) {
                        result.add(new int[]{A[i], A[j], A[l], A[r]});

                        l++;
                        r--;

                        while (l < r && A[l] == A[l - 1]) l++;
                        while (l < r && A[r] == A[r + 1]) r--;

                    } else if (sum < B) {
                        l++;
                    } else {
                        r--;
                    }
                }
            }
        }

        return result.toArray(new int[result.size()][]);
    }
}
