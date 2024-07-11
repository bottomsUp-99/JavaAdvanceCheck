package tree;

public class BinaryTreeEx {

  public static void main(String[] args) {
    NodeMgmt myTree = new NodeMgmt();
    myTree.insertNode(2);
    myTree.insertNode(3);
    myTree.insertNode(4);
    myTree.insertNode(5);
    System.out.println("HEAD : " + myTree.head.value);
    System.out.println("HEAD RIGHT : " + myTree.head.right.value);
    System.out.println("HEAD RIGHT RIGHT : " + myTree.head.right.right.value);
    System.out.println("HEAD RIGHT RIGHT RIGHT : " + myTree.head.right.right.right.value);
  }
}
