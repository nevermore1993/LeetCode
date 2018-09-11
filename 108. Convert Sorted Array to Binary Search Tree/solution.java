// simple recursive solution, like divide and conqure, the mid element of subarray is the root of subtree
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0)
            return null;
        return buildTree(nums, 0, nums.length - 1);
    }
    
    public TreeNode buildTree(int[] nums, int start, int end) {
        if (start > end)
            return null;
        int mid = (start + end) / 2;
        
        TreeNode root = new TreeNode(nums[mid]);
        
        root.left = buildTree(nums, start, mid - 1);
        root.right = buildTree(nums, mid + 1, end);
        
        return root;
    }
}
