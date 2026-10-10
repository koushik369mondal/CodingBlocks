package CW.Stack.BasicsAndApplications;
import java.util.Scanner;
import java.util.Stack;

public class checkPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> st = new Stack<>(); 
        String word = sc.nextLine();

        for(int i=0; i<word.length(); i++){
            char ch = word.charAt(i);
            st.push(ch);
        }
        boolean isPalindrome = true;
        for(int i=0; i<word.length(); i++){
            char ch = word.charAt(i);
            if(ch != st.pop()){
                isPalindrome = false;
            }
        }
        if(isPalindrome == true){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
        sc.close();
    }
}
