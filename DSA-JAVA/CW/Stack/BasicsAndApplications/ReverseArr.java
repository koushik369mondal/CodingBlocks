package CW.Stack.BasicsAndApplications;
import java.util.Scanner;
import java.util.Stack;

public class ReverseArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> st = new Stack<>();

        for(int i=0; i<n; i++){
            // int data = sc.nextInt();
            st.push(sc.nextInt());
        }
        while(!st.isEmpty()){
            System.out.print(st.pop()+ " ");
        }
        sc.close();
    }
}
