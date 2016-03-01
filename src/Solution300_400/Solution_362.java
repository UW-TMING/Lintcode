//package Solution300_400;
//
//import java.util.ArrayList;
//import java.util.LinkedList;
//
//class Node {
//	public int i;
//	public int val;
//	public Node (int i, int val) {
//		this.i = i;
//		this.val = val;
//	}
//}
//
//public class Solution_362 {
//	public static void main (String[] args) {
//		int[] nums = {1, 2, 7, 7, 2};
//		Solution_362 test = new Solution_362();
//		int k = 3;
//		ArrayList<Integer> ans = test.maxSlidingWindow(nums, k);
//		for (int temp : ans) {
//			System.out.print (temp + " ");
//		}
//		System.out.println();
//	}
//	public ArrayList<Integer> maxSlidingWindow(int[] nums, int k) {
//        ArrayList<Integer> ans = new ArrayList<Integer> ();
//        LinkedList<Node> deque = new LinkedList<Node>();
//        deque.add(new Node(0, nums[0]));
//        int i = 1;
//        while (i < k) {
//        		Node last = deque.getLast();
//        		while (nums[i] >= last.val) {
//        			if (!deque.isEmpty()) {
//        				deque.removeLast();
//	    			}
//        			if (!deque.isEmpty()) {
//        				last = deque.getLast();
//        			} else {
//        				break;
//        			}
//        		}
//        		deque.add(new Node(i, nums[i ++]));
//        }
//        ans.add(deque.getFirst().val);
//        while (i < nums.length) {
//        		Node last = deque.getLast();
//	    		while (nums[i] >= last.val) {
//	    			if (!deque.isEmpty()) {
//        				deque.removeLast();
//	    			}
//        			if (!deque.isEmpty()) {
//        				last = deque.getLast();
//        			} else {
//        				break;
//        			}
//	    		}
//	    		deque.add(new Node(i, nums[i]));
//	    		int start = i - k + 1;
//	    		i ++;
//	    		Node first = deque.getFirst();
//	    		while (first.i < start) {
//	    			if (!deque.isEmpty()) {
//	    				deque.removeFirst();
//	    			}
//	    			if (!deque.isEmpty()) {
//	    				first = deque.getFirst();
//	    			} else {
//	    				break;
//	    			}
//	    			
//	    		}
//	    		ans.add(first.val);
//        }
//        return ans;
//    }
//}
