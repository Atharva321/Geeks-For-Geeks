// Time  : O(n)
// Space : O(n)

class Solution {
    public int maxLevelSum(Node root) {
        // add code here.
        if (root == null) {
            return 0;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int maxLevelSum = Integer.MIN_VALUE;

        while (!q.isEmpty()) {
            int levelSum = 0;
            int levelSize = q.size();

            for (int i = 0; i < levelSize; i++) {
                Node node = q.remove();
                levelSum += node.data;

                if (node.left != null) {
                    q.add(node.left);
                }

                if (node.right != null) {
                    q.add(node.right);
                }
            }
            maxLevelSum = Math.max(maxLevelSum, levelSum);
        }
        return maxLevelSum;
    }
}
