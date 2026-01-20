
public class main {

	public static void main(String[] args) {
		System.out.println("running");
		//your test code here
		RedBlackTree tree = new RedBlackTree();
        
        // Create a BST with height 4
        tree.insert(50); 
		tree.insert(30);
		tree.insert(70);
		tree.insert(20);
		tree.insert(40);
		tree.insert(60);
		tree.insert(80);
		tree.insert(10);
		tree.insert(25);
		tree.insert(35);
		tree.insert(45);
        
        tree.printTree();
	}
}
