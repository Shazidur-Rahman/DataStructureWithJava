    package Tree;

    public class Main {
        public static void main(String[] args) {

            TreeNode drinks = new TreeNode("drinks");
            TreeNode hot = new TreeNode("hot");
            TreeNode cold = new TreeNode("cold");
            TreeNode tea = new TreeNode("tea");
            TreeNode coffee = new TreeNode("coffee");
            TreeNode wine = new TreeNode("wine");
            TreeNode beer = new TreeNode("beer");

            hot.addChild(tea);
            hot.addChild(coffee);

            cold.addChild(wine);
            cold.addChild(beer);


            drinks.addChild(hot);
            drinks.addChild(cold);

            System.out.println(drinks.print(0));
            System.out.println();
            System.out.println("");
            System.out.println("----------------------------------------------BinaryTreeLL----------------------------------------------");
            System.out.println();

            BinaryTreeLL binaryTree = new BinaryTreeLL();

            BinaryNode N1 = new BinaryNode();
            N1.value = "N1";

            BinaryNode N2 = new BinaryNode();
            N2.value = "N2";

            BinaryNode N3 = new BinaryNode();
            N3.value = "N3";

            BinaryNode N4 = new BinaryNode();
            N4.value = "N4";

            BinaryNode N5 = new BinaryNode();
            N5.value = "N5";

            BinaryNode N6 = new BinaryNode();
            N6.value = "N6";

            BinaryNode N7 = new BinaryNode();
            N7.value = "N7";

            BinaryNode N8 = new BinaryNode();
            N8.value = "N8";

            BinaryNode N9 = new BinaryNode();
            N9.value = "N9";

            N1.left = N2;
            N1.right = N3;
            N2.left = N4;
            N2.right = N5;
            N3.left = N6;
            N3.right = N7;
            N4.left = N8;
            N4.right = N9;

            binaryTree.root = N1;
            System.out.println("----------------------------------------------preOrder----------------------------------------------");
            binaryTree.preOrder(binaryTree.root);
            System.out.println();

            System.out.println("----------------------------------------------inOrder----------------------------------------------");
            binaryTree.inOrder(binaryTree.root);
            System.out.println();

            System.out.println("----------------------------------------------postOrder----------------------------------------------");
            binaryTree.postOrder(binaryTree.root);
            System.out.println();

            System.out.println("----------------------------------------------BFS----------------------------------------------");
            binaryTree.levelOrder();
            System.out.println();

            System.out.println("----------------------------------------------search----------------------------------------------");
            binaryTree.search("N5");
            System.out.println();

            System.out.println("----------------------------------------------Insert----------------------------------------------");
            binaryTree.insert("N10");
            binaryTree.insert("N11");
            binaryTree.levelOrder();
            System.out.println();

            System.out.println("----------------------------------------------DeepestNode----------------------------------------------");
            System.out.println(binaryTree.getDeepestNode().value);
            System.out.println();

            System.out.println("----------------------------------------------deleteDeepestNode----------------------------------------------");
            binaryTree.deleteDeepestNode();
            binaryTree.levelOrder();
            System.out.println();

            System.out.println("----------------------------------------------DeleteGivenNode----------------------------------------------");
            binaryTree.deleteNode("N3");
            System.out.println();
            binaryTree.levelOrder();
            System.out.println();


        }


    }
