package academy.learnprogramming.binarysearchtrees;

public class Main {

    public static void main(String[] args) {
	   Tree intTree = new Tree();
	   intTree.insert(25);
	   intTree.insert(20);
	   intTree.insert(15);
	   intTree.insert(27);
	   intTree.insert(30);
	   intTree.insert(29);
	   intTree.insert(26);
	   intTree.insert(22);
	   intTree.insert(32);

		System.out.print("InOrder Traversel : ");
	   intTree.traverseInOrder();
		System.out.println();
		System.out.print("PreOrder Traversel : ");
	   intTree.traversePreOrder();
		System.out.println();
		System.out.print("PostOrder Traversel : ");
	   intTree.traversePostOrder();
		System.out.println();
	    System.out.println(intTree.get(27));
		System.out.println(intTree.get(15));
		System.out.println(intTree.get(888));
		System.out.print("Minimum value in tree is : ");
		System.out.println(intTree.min());
		System.out.print("Maximum value in tree is : ");
		System.out.println(intTree.max());



    }
}
