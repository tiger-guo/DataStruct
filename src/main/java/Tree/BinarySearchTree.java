package Tree;

/*
 * @author: LiuGuohu
 * @company: XGLAB
 * @description: 二叉搜索树
 * @date: 2019/11/2
 */
public class BinarySearchTree {

    private Node tree;

    private static class Node {
        private int data;
        private Node left;
        private Node right;

        public Node(int data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }

    public Node find(int data) {
        Node p = tree;

        while (p != null) {
            if (p.data > data) {
                p = p.left;
            } else if (p.data < data) {
                p = p.right;
            } else {
                return p;
            }
        }
        return null;
    }

    public void insert(int data) {
        if (tree == null) {
            tree = new Node(data);
            return;
        }
        Node p = tree;
        while (p != null) {
            if (p.data > data) {
                if (p.left == null) {
                    p.left = new Node(data);
                    return;
                }
                p = p.left;
            } else {
                if (p.right == null) {
                    p.right = new Node(data);
                    return;
                }
                p = p.right;
            }
        }
    }

    public void delete(int data) {
        Node p = tree; // p指向要删除的节点，初始化为根节点
        Node pp = null;// pp指向的是p的父节点

        while (p != null && p.data != data) {
            pp = p;
            if (p.data > data) {
                p = p.left;
            } else {
                p = p.right;
            }
        }
        // 没有找到
        if (p == null)
            return;

        if (p.left != null && p.right != null) {
            Node minP = p.right;
            Node minPP = p;
            while (minP.left != null) {
                minPP = minP;
                minP = minP.left;
            }
            p.data = minP.data;   // 将删除节点右子树的最小节点数据替换到删除节点上
            p = minP;               // 将指向删除节点的指针指向最小节点
            pp = minPP;
        }

        //  下面是删除节点的代码
        Node child;
        if (p.left != null)
            child = p.left;
        else if (p.right != null)
            child = p.right;
        else
            child = null;

        if (pp == null)
            tree = child;
        else if (pp.left == p)
            pp.left = child;
        else
            pp.right = child;
    }

    // 查找最大节点
    public Node findMax() {
        Node p = tree;

        while (p.right != null) {
            p = p.right;
        }
        return p;
    }

    // 查找最小节点
    public Node findMin() {
        Node p = tree;
        while (p.left != null)
            p = p.left;
        return p;
    }

    // 获取中序遍历结果
    public void getInOrderTraversal(){
        inOrderTraversal(tree);
    }

    // 中序遍历
    public void inOrderTraversal(Node p){
        if(p==null)
            return;
        inOrderTraversal(p.left);
        System.out.print(p.data + "\t");
        inOrderTraversal(p.right);
    }
}
