package Tree;

import java.util.Stack;

public class LevelOrderInSpiral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Node root = new Node(1);
		  root.left = new Node(2);
		  root.right = new Node(3);
		  root.left.left = new Node(4);
		  root.left.right = new Node(5);
		  root.left.right.left = new Node(6);
		  root.left.right.right = new Node(7);
		  root.right.right = new Node(8);
	        
	      printLevelOrderInSpiral(root);

	}

	private static void printLevelOrderInSpiral(Node node) {
		if(node == null) return;					
		Stack<Node> s1 = new Stack<Node>();
		Stack<Node> s2 = new Stack<Node>();
		
		s1.push(node);
		
		while(!s1.isEmpty() || !s2.isEmpty()) {
			while(!s1.isEmpty()) {
				Node temp = s1.peek();
				s1.pop();
				System.out.print(temp.data+" ");
				
				if(temp.right != null) {
					s2.push(temp.right);
				}
				if(temp.left != null) {
					s2.push(temp.left);
				}
			}
			
			while(!s2.isEmpty()) {
				Node temp = s2.peek();
				s2.pop();
				System.out.print(temp.data+" ");
				
				if(temp.left != null) {
					s1.push(temp.left);
				}
				if(temp.right != null) {
					s1.push(temp.right	);
				}
				
			}
		}
	}

}
