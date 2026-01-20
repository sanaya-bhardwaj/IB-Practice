import java.util.Stack;

public class Solution {
    public int maximalRectangle(int[][] A) {
        if (A.length == 0) return 0;

        int rows = A.length, cols = A[0].length;
        int[] height = new int[cols];
        int maxArea = 0;

        for (int i = 0; i < rows; i++) {
            // Build histogram
            for (int j = 0; j < cols; j++) {
                height[j] = (A[i][j] == 1) ? height[j] + 1 : 0;
            }
            maxArea = Math.max(maxArea, largestRectangle(height));
        }
        return maxArea;
    }

    private int largestRectangle(int[] h) {
        Stack<Integer> stack = new Stack<>();
        int max = 0, i = 0;

        while (i < h.length) {
            if (stack.isEmpty() || h[i] >= h[stack.peek()]) {
                stack.push(i++);
            } else {
                int top = stack.pop();
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                max = Math.max(max, h[top] * width);
            }
        }

        while (!stack.isEmpty()) {
            int top = stack.pop();
            int width = stack.isEmpty() ? i : i - stack.peek() - 1;
            max = Math.max(max, h[top] * width);
        }

        return max;
    }
}
