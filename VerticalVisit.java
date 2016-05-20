import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


public class VerticalVisit {
	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		public TreeNode(int val,
		TreeNode left,
		TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
		public TreeNode(int val) {
			this.val = val;
		}		
	}
//    1
// /    \
//2      3
/// \    / \
//4   5  6   7
//       \   \
//        8   9 
//		  
//The output of print this tree vertically will be:
//4
//2
//1 5 6
//3 8
//7
//9 

	public static void main(String[] args) {
		TreeNode a1 = new TreeNode(1);
		TreeNode a2 = new TreeNode(2);
		TreeNode a3 = new TreeNode(3);
		TreeNode a4 = new TreeNode(4);
		TreeNode a5 = new TreeNode(5);
		TreeNode a6 = new TreeNode(6);
		TreeNode a7 = new TreeNode(7);
		TreeNode a8 = new TreeNode(8);
		TreeNode a9 = new TreeNode(9);
		a1.left = a2; a1.right = a3; a2.left = a4; a2.right = a5;
		a3.left = a6; a3.right = a7; a6.right = a8; a7.right = a9;
		System.out.println(verticalOrder(a1));
	}
	public static List<List<Integer>> verticalOrder(TreeNode root) {
		List<List<Integer>> res = new ArrayList<>();
		if (root == null) {
			return res;
		}
		Map<Integer, List<Integer>> map = new TreeMap<>();
		visit(root, 0, map);
//		for (Entry<Integer, List<Integer>> m : map.entrySet()) {
//			
//		}
		for (List<Integer> v : map.values()) {
			res.add(v);
		}
		return res;
	}
	private static void visit(TreeNode root, int i, Map<Integer, List<Integer>> map) {
		if (root != null) {
			if (!map.containsKey(i)) {
				map.put(i, new ArrayList<>());
			}
			map.get(i).add(root.val);
			visit(root.left, i - 1, map);
			visit(root.right, i + 1, map);
		}
	}
}
