public class Node {
    int key;
    Trust data;

    Node left, right;

    public Node(int key, Trust data) {
        this.data = data;
        this.key = key;
        left = right = null;
    }
}