public class BST{
    private Node root;
    public BST(){
	root = null;
    }
    public Node delete(int x){
	Node temp = root;
	while(temp.getData() != x && temp != null){
	    if(x < temp.getData())
		temp = temp.getLeft();
	    else 
		temp = temp.getRight();
	}
	if(temp.getData() != x){
	    deleteN(temp);
	    return temp;
	}
	return null;
    }
    public void deleteN(Node toD){
	Node temp = toD;
	if(temp.getLeft() != null){
	    temp = temp.getLeft();
	    while(temp.getRight() != null)
		temp = temp.getRight();
	    toD.setData(temp.getData());
	    deleteN(temp);
	} else if (temp.getRight() != null){
	    temp = temp.getRight();
	    while(temp.getLeft() != null)
		temp = temp.getLeft();
	    toD.setData(temp.getData());
	    deleteN(temp);
	} else {
	    temp = null;
	}
	    
    }
    public void setRoot(Node root){
	this.root = root;
    }
    public void insert(int data){
	rInsert(data, root);
    }
    private void rInsert(int data, Node n){
	if(data < n.getData()){
	    if(n.getLeft() == null){
		n.setLeft(new Node(data));
	    } else {
		rInsert(data, n.getLeft());
	    }
	} else if(n.getRight() == null){
	    n.setRight(new Node(data));
	} else {
	    rInsert(data, n.getRight());
	}
    }
    public Node search(int x){
	Node current = root;
	while(current.getData() != x){
	    if(x < current.getData()){
		if(current.getLeft() == null){
		    return null;
		}else{
		    current = current.getLeft();
		}
	    } else {
		if(current.getRight() == null){
		    return null;
		}else{
		    current = current.getRight();
		}
	    }
	}
	return current;
    }
    public Node search2(Node c, int x){
	Node current = root;
	if(current == null)
	    return null;
	if(x<current.getData())
	    return search2(current.getLeft(), x);
	if(x>current.getData())
	    return search2(current.getLeft(), x);
	return c;
    }
    
    public static void main(String[]args){
	BST tree = new BST();
	tree.setRoot(new Node(5));
	tree.insert(4);
	tree.insert(10);
	tree.insert(1);
	tree.insert(3);
	tree.insert(9);
    }
}