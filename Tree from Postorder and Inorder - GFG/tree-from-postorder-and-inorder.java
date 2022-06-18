// { Driver Code Starts
import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    Node(int value) {
        data = value;
        left = null;
        right = null;
    }
}

class InorderPostorderToTree {
    public void preOrder(Node root) {
        if (root == null) return;

        System.out.print(root.data + " ");
        preOrder(root.left);

        preOrder(root.right);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        InorderPostorderToTree ip = new InorderPostorderToTree();
        int T = sc.nextInt();
        while (T > 0) {
            int n = sc.nextInt();
            int inorder[] = new int[n];
            int postorder[] = new int[n];
            for (int i = 0; i < n; i++) inorder[i] = sc.nextInt();
            for (int i = 0; i < n; i++) postorder[i] = sc.nextInt();
            GfG g = new GfG();
            Node root = g.buildTree(inorder, postorder, n);
            ip.preOrder(root);
            System.out.println();

            T--;
        }
    }
}
// } Driver Code Ends


/* Tree node structure
class Node
{
    int data;
    Node left;
    Node right;

        Node(int value)
    {
        data = value;
        left = null;
        right = null;
    }
}*/


class GfG
{
    //Function to return a tree created from postorder and inoreder traversals.
    Node buildTree(int in[], int post[], int n) {
        if(in==null || post == null || in.length!=post.length) return null;
        
        Map<Integer,Integer> hm = new HashMap<Integer,Integer>();
        
        for(int i=0; i<in.length; i++){
            hm.put(in[i],i);
        }
        
        Node root = buildTreeHelp(in,0,n-1,post,0,n-1,hm);
        return root;
    }
    
    Node buildTreeHelp(int in[],int inStart, int inEnd, 
                int post[], int postStart, 
                int postEnd, Map<Integer,Integer> hm)
    {
            if(postStart>postEnd || inStart>inEnd) return null;
            
            Node root = new Node(post[postEnd]);
            
            int inRoot = hm.get(post[postEnd]); //to get the root in inorder 
            int numsLeft = inRoot - inStart;
            
            root.left = buildTreeHelp(in,inStart,inRoot-1,post,postStart,
                                        postStart+numsLeft-1,hm);
                                        
            root.right = buildTreeHelp(in,inRoot+1,inEnd, 
            post,postStart+numsLeft,postEnd-1,hm);
                
            return root;
                
    }
}
