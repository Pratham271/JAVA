package academy.learnprogramming.temptrees;

public class Tree {
    private TreeNode root;
    public void insert(int value){
        if(root == null){
            root = new TreeNode(value);
        }
        else{
            root.insert(value);
        }
    }
    public TreeNode get(int value){
        if(root != null){
            return root.get(value);
        }
        return null;
    }
    public void traverseInOrder(){
        if(root!=null){
            root.traverseInOrder();
        }
    }

}
