public class MinDifferenceBST {
//node
    class Node{
        int val;
        Node left;
        Node right;
        Node(int val, Node left, Node right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
//method for min difference
    static int minDifferenceBST(Node root, int target){
        if(root== null) return -1;
        int ans = Integer.MAX_VALUE;
        Node current = root;
        while(current != null){
            int difference = current.val - target;
            ans = Math.min(ans, Math.abs(difference));

            if(difference> 0){
                current = current.left;
            }else if(difference <0){
                current = current.right;
            }else if(difference == 0){
                return 0;
            }



        }return ans;


    }




    public static void main(String[] args) {

    }
}
