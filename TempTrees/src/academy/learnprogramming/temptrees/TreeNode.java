package academy.learnprogramming.temptrees;

public class TreeNode {
    private int data;
    private TreeNode leftchild;
    private TreeNode rightchild;

    public void insert(int value){
        if(value == data){
            return;
        }
        if(value<data){
            if(leftchild == null){
                leftchild = new TreeNode(value);
            }
            else{
                leftchild.insert(value);
            }
        }
        else{
            if(rightchild == null){
                rightchild = new TreeNode(value);
            }
            else{
                rightchild.insert(value);
            }
        }
    }
    public TreeNode get(int value){
        if(value == data){
            return this;
        }
        if(value<data){
            if(leftchild != null){
                return leftchild.get(value);
            }
        }
        else{
            if(rightchild != null){
                return rightchild.get(value);
            }
        }
        return null;
    }

    public void traverseInOrder(){
        if(leftchild!= null){
            leftchild.traverseInOrder();
        }
        System.out.print(data+ ",");
        if(rightchild!=null){
            rightchild.traverseInOrder();
        }
    }

    public TreeNode (int data){
        this.data = data;
    }
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeftchild() {
        return leftchild;
    }

    public void setLeftchild(TreeNode leftchild) {
        this.leftchild = leftchild;
    }

    public TreeNode getRightchild() {
        return rightchild;
    }

    public void setRightchild(TreeNode rightchild) {
        this.rightchild = rightchild;
    }
    public String toString() {

        return  "data=" + data ;

    }
}


