import java.util.Scanner;
class TestClass {
    public static int[] tree = new int[1048577];
    public static int res = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        tree[1] = sc.nextInt();

        for(int i=1 ; i < n ; i++){
            String code = sc.next();
            int index = getIndex(code);
            if(index <= 1048576){
                tree[index] = sc.nextInt();
            }else{
                System.out.println("ERROR : index == " + index);
            }
        }
        res = maxDia(1);
        System.out.println(res);
    }

    private static int maxDia(int root) {
        if(tree[root] == 0){
            return 0;
        }
        int ml = getHeight(2*root);
        int mr = getHeight(2*root+1);
        int ldia = maxDia(2*root);
        int rdia = maxDia(2*root + 1);
        
        return Math.max( (ml + mr + 1),  Math.max(ldia,rdia) );
    }

    private static int getHeight(int i) {
        if(tree[i] == 0){
            return 0;
        }

        int lh = getHeight(2*i);
        int rh = getHeight(2*i + 1);

        if(lh > rh){
            return lh+1;
        }else{
            return rh +1;
        }
    }

    private static int getIndex(String i) {
        int index = 1;
        for(Character c : i.toCharArray()){
            if(c.equals('L')){
                index = index*2;
            }else{
                index = index*2+1;
            }
        }
        return index;
    }
}












// // Recursive optimized Java program to find the diameter of a 
// // Binary Tree 

// /* Class containing left and right child of current 
// node and key value*/
// class Node 
// { 
// 	int data; 
// 	Node left, right; 

// 	public Node(int item) 
// 	{ 
// 		data = item; 
// 		left = right = null; 
// 	} 
// } 

// /* Class to print the Diameter */
// class BinaryTree 
// { 
// 	Node root; 

// 	/* Method to calculate the diameter and return it to main */
// 	int diameter(Node root) 
// 	{ 
// 		/* base case if tree is empty */
// 		if (root == null) 
// 			return 0; 

// 		/* get the height of left and right sub trees */
// 		int lheight = height(root.left); 
// 		int rheight = height(root.right); 

// 		/* get the diameter of left and right subtrees */
// 		int ldiameter = diameter(root.left); 
// 		int rdiameter = diameter(root.right); 

// 		/* Return max of following three 
// 		1) Diameter of left subtree 
// 		2) Diameter of right subtree 
// 		3) Height of left subtree + height of right subtree + 1 */
// 		return Math.max(lheight + rheight + 1, 
// 						Math.max(ldiameter, rdiameter)); 

// 	} 

// 	/* A wrapper over diameter(Node root) */
// 	int diameter() 
// 	{ 
// 		return diameter(root); 
// 	} 

// 	/*The function Compute the "height" of a tree. Height is the 
// 	number f nodes along the longest path from the root node 
// 	down to the farthest leaf node.*/
// 	static int height(Node node) 
// 	{ 
// 		/* base case tree is empty */
// 		if (node == null) 
// 			return 0; 

// 		/* If tree is not empty then height = 1 + max of left 
// 		height and right heights */
// 		return (1 + Math.max(height(node.left), height(node.right))); 
// 	} 

// 	public static void main(String args[]) 
// 	{ 
// 		/* creating a binary tree and entering the nodes */
// 		BinaryTree tree = new BinaryTree(); 
// 		tree.root = new Node(1); 
// 		tree.root.left = new Node(2); 
// 		tree.root.right = new Node(3); 
// 		tree.root.left.left = new Node(4); 
// 		tree.root.left.right = new Node(5); 

// 		System.out.println("The diameter of given binary tree is : "
// 						+ tree.diameter()); 
// 	} 
// } 

