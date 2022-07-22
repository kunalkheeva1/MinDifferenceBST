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
        //return -1 if the root is null
        if(root== null) return -1;

        int ans = Integer.MAX_VALUE;
        Node current = root;
        // until the current becomes null
        while(current != null){
            //diffrence is the data of the node - target
            int difference = current.val - target;
            ans = Math.min(ans, Math.abs(difference));
            //keep updating the answer by checking the differences
            // if difference is more then move to left side to find the smaller elements
            // else move accordingly and update the answer
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
