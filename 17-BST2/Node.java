public class Node{
    private int data;
    private Node left,right;
    public Node(int data){
        this.data = data;
    }
    public void setLeft(Node left){
        this.left = left;
    }
    public void setRight(Node right){
        this.right = right;
    }
    public Node getLeft(){
        return left;
    }
    public Node getRight(){
        return right;
    }
    public void setData(int data){
        this.data = data;
    }
    public int getData(){
        return data;
    }
}
