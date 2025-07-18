package Modelo;

public class TreeAVL {
    private NodeAVL root;



    // metodos para la altura y el balanceo


    private int height(NodeAVL node) {
        return node == null ? 0 : node.height;
    }

    private int updateHeight(NodeAVL node) {
        return node.height = Math.max(height(node.left), height(node.right)) + 1;
    }

    private int balanceFactor(NodeAVL node) {
        return node == null? 0 : height(node.left) - height(node.right);
    }


    private NodeAVL rotateRight(NodeAVL node) {
        NodeAVL x = node.left;
        NodeAVL T2 = x.right;

        x.right = node;
        node.left = T2;

        updateHeight(node);
        updateHeight(x);

        return x;
    }

    private NodeAVL rotateLeft(NodeAVL node) {
        NodeAVL x = node.right;
        NodeAVL T2 = x.left;

        x.left = node;
        node.right = T2;

        updateHeight(node);
        updateHeight(x);

        return x;
    }

    private NodeAVL balance(NodeAVL node) {
        int bf = balanceFactor(node);

        if (bf > 1) {
            if (balanceFactor(node.left) < 0)
                node.left = rotateLeft(node);
            return rotateRight(node);
        }
        if (bf < -1) {
            if (balanceFactor(node.right) > 0)
                node.right = rotateRight(node);
            return rotateLeft(node);
        }

        return node;
    }
}
