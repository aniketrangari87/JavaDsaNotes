import java.util.LinkedList;
import java.util.Queue;

class tree {


    public static class Treeinfo{

        int ht ;
        int diam;

        Treeinfo(int ht , int diam){
            this.ht=ht;
            this.diam=diam;
        }
    }

    public static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static class binaryTree {

        static int ind = -1;

        public static Node buildTree(int nodes[]) {
            ind++;
            if (nodes[ind] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[ind]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

    }

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void postOrder(Node root) {
        if (root == null) {
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public static void levelOrder(Node root) {// BFS TRAVERSAL

        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();

        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node currNode = q.remove();

            if (currNode == null) {

                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }

            } else {
                System.out.print("[" + currNode.data + "]" + " ");
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }

            }
        }

    }

    public static int count(Node root){
        if(root == null)return 0; // base case 
        int ans = 1 + count(root.left)+ count(root.right);// self works and recursive cal
  return ans;
        
    }
    public static boolean serarch(Node root , int val){
        
    }

    public static Treeinfo diameter2(Node root){
        if(root == null ){
            return new Treeinfo(0, 0);
        }
        Treeinfo left = diameter2(root.left);
        Treeinfo right = diameter2(root.right);

        int myHeight = Math.max(left.ht ,right.ht)+1;

        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.ht+right.ht+1;

        int mydiam = Math.max(diam1,Math.max(diam2, diam3) );
            Treeinfo myinfo = new Treeinfo(myHeight,mydiam);
       return myinfo;

    }

    public static void main(String[] args) {
        int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        binaryTree n = new binaryTree();
        Node root = n.buildTree(nodes);
        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
        levelOrder(root);
        System.out.println();
        System.out.println(count(root));

    }
}