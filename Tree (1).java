public class Tree {
    Node root;

    public Tree() {
        root = null;
    }

    public void insert(int key, Trust data) {
        root = insertNode(root, key, data);
    }

    private Node insertNode(Node node, int key, Trust data) {
        if (node == null) {
            return new Node(key, data);
        }

        if (key > node.key) {
            node.right = insertNode(node.right, key, data);
        } else {
            node.left = insertNode(node.left, key, data);
        }

        return node;
    }

    public void inorder() {
        inorder(root);
    }

    private void inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.println(node.key + ":" + node.data);
            inorder(node.right);
        }
    }

    public Node search(int key) {
        return search(key, root);
    }

    private Node search(int key, Node node) {

        if (node == null)
            return null;

        if (node.key == key) {
            return node;
        }

        if (node.key > key) {
            return search(key, node.left);
        } else {
            return search(key, node.right);
        }
    }
}
