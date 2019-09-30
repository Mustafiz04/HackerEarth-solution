 class Node 
{ 
	int data; 
	Node left, right, nextRight; 

	Node(int item) 
	{ 
		data = item; 
		left = right = nextRight = null; 
	} 
} 

class BinaryTree 
{ 
	Node root; 
	void connect(Node p) { 
		p.nextRight = null; 
		connectRecur(p); 
	} 

	void connectRecur(Node p) { 
		if (p == null) 
			return; 

		if (p.left != null) 
			p.left.nextRight = p.right; 

		if (p.right != null) 
			p.right.nextRight = (p.nextRight != null) ? p.nextRight.left : null; 
 
		connectRecur(p.left); 
		connectRecur(p.right); 
	} 

	public static void main(String args[]) 
	{ 
		BinaryTree tree = new BinaryTree(); 

		tree.root = new Node(10); 
		tree.root.left = new Node(8); 
		tree.root.right = new Node(2); 
		tree.root.left.left = new Node(3); 

		tree.connect(tree.root); 
 
		System.out.println("Following are populated nextRight pointers in "
				+ "the tree" + "(-1 is printed if there is no nextRight)"); 
		int a = tree.root.nextRight != null ? tree.root.nextRight.data : -1; 
		System.out.println("nextRight of " + tree.root.data + " is "
				+ a); 
		int b = tree.root.left.nextRight != null ? 
									tree.root.left.nextRight.data : -1; 
		System.out.println("nextRight of " + tree.root.left.data + " is "
				+ b); 
		int c = tree.root.right.nextRight != null ? 
								tree.root.right.nextRight.data : -1; 
		System.out.println("nextRight of " + tree.root.right.data + " is "
				+ c); 
		int d = tree.root.left.left.nextRight != null ? 
							tree.root.left.left.nextRight.data : -1; 
		System.out.println("nextRight of " + tree.root.left.left.data + " is "
				+ d); 
	} 
} 

