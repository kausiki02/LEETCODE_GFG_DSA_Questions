// { Driver Code Starts
import java.util.Scanner;
import java.util.Stack;
class SortedStack{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			Stack<Integer> s=new Stack<>();
			int n=sc.nextInt();
			while(n-->0)
			s.push(sc.nextInt());
			GfG g=new GfG();
			Stack<Integer> a=g.sort(s);
			while(!a.empty()){
				System.out.print(a.peek()+" ");
				a.pop();
			}
			System.out.println();
		}
	}
}// } Driver Code Ends


/*Complete the function below*/
class GfG{
	public Stack<Integer> sort(Stack<Integer> s)
	{
		//add code here.
		Stack<Integer> s1 = new Stack<>();
		while(s.isEmpty()==false){
		    if(s1.isEmpty()==true){
		        s1.push(s.pop());
		    }
		    else if(s1.peek()>s.peek()){
		        int t = s.pop();
		        while(s1.isEmpty()==false && s1.peek()>t){
		            s.push(s1.pop());
		        }
		        s1.push(t);
		    }
		    
		    else if(s.peek()>=s1.peek()){
		        s1.push(s.pop());
		    }
		}
		return s1;
	}
}