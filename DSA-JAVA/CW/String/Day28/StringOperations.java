package CW.String.Day28;
import java.util.Arrays;
import java.util.Scanner;

public class StringOperations {
    // reverse a string using recursion

    // frequancy of a String

    // test1
    public static void test1() {
        char[] ch = {'a', 'b', 'c', 'd', 'e'};
        for(int ele : ch) {
            System.out.print(ele + " ");
        }
        System.out.println();
        for (char ele : ch) {
            System.out.print(ele + " ");
        }
    }

    // test3
    public static void test2() {
        String s = "Hello I am Kaushik Mandal";
        System.out.println(s);
    }

    // test3
    public static void test3() {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        System.out.println(s1);
        sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println(s2);
        sc.close();
    }

    // count the number of vowels in a string
    public static void countVowels() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(); // read a line of input from the user
        int count = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i); // get the character at index i
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                count++;
            }
        }
        System.out.println("Number of vowels: " + count);
        sc.close();
    }

    // Palindrome String - Two Pointer Approach
    public static void isPalindrome() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int left = 0;
        int right = s.length() - 1;
        boolean isPalindrome = true;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        if (isPalindrome) {
            System.out.println("Palindrome.");
        } else {
            System.out.println("Not a palindrome.");
        }
        sc.close();
    }

    // built in methods
    public static void builtInMethods(){
        String s1 = "Kaushik Mandal";
        String s2 = "Hello Guys";
        // System.out.println(s1.indexOf('k'));
        // System.out.println(s1.length());
        // System.out.println(s1.charAt(0));
        // System.out.println(s1.substring(0, 3));
        // System.out.println(s1.toLowerCase());
        // System.out.println(s1.toUpperCase());
        // System.out.println(s1.equals(s2));
        // System.out.println(s1.compareTo(s2)); //K-H = 3
        // System.out.println(s1.contains("Mandal"));
        // System.out.println(s1.startsWith("Kaushik"));
        System.out.println(s1.concat(s2));
    }

    public static int compareTo(String s1, String s2){
        System.out.println(s1 + ", " + s2);
        return -1;
    }

    public static void plus() {
        String s1 = "Kaushik";
        String s2 = "Mandal";
        String s3 = s1 + s2;
        s3 += 10;
        s3 += "\n"; // do nothinng
        s3 += "n in next line";
        System.out.println(s3);
        System.out.println(10 + 20 + " Kaushik ");
        System.out.println(10 + " Kaushik " + 20);
    }

    public static void intToString() {
        int n = 123;
        String s = Integer.toString(n);
        System.out.println(s);
    }

    public static void countDigits() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = "" + n;
        System.out.println(s.length());
        sc.close();
    }

    public static void stringToCharArray() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] ch = s.toCharArray();
        for (char i=0; i<ch.length; i++) {
            System.out.print(ch[i] + " ");
        }
        sc.close();
    }

    public static void subStringOfString() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (int i=0; i<s.length(); i++) {
            for (int j=i+1; j<=s.length(); j++) {
                System.out.println(s.substring(i, j));
            }
        }
        sc.close();
    }

    // HW - Sum of all subbstring of a number - eg. 123 -> 1 + 2 + 3 + 12 + 23 + 123 = 164
    public static void sumOfSubstrings() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int sum = 0;
        for (int i=0; i<s.length(); i++) {
            for (int j=i+1; j<=s.length(); j++) {
                String sub = s.substring(i, j);
                sum += Integer.parseInt(sub);
            }
        }
        System.out.println(sum);
        sc.close();
    }

    public static void interningView() {
        String s = "Kaushik";
        // s = "Mandal";
        s += " Mandal";
        System.out.println(s);
    }

    public static void equal() {
        String s1 = "Kaushik";
        String s2 = new String("Kaushik");
        System.out.println(s1 == s2); // false
        System.out.println(s1.equals(s2)); // true
    }

    public static boolean equals(String s1, String s2) {
        if(s1.length() != s2.length()) return false;
        for(int i=0; i<s1.length(); i++) {
            if(s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void stringBuilder() {
        StringBuilder sb = new StringBuilder(6);
        sb.append(" Mandal");
        System.out.println(sb);
        System.out.println(sb.capacity() + ", " + sb.length());
        sb.setCharAt(1, 'o');
        System.out.println(sb);
    }

    public static void reverseSb() {
        StringBuilder sb = new StringBuilder("Kaushik");
        // sb.reverse();
        int left = 0;
        int right = sb.length() - 1;
        while(left < right) {
            char temp = sb.charAt(left);
            sb.setCharAt(left, sb.charAt(right));
            sb.setCharAt(right, temp);
            left++;
            right--;
        }
        System.out.println(sb);
    }

    public static boolean anagram(String s1, String s2) {
        if(s1.length() != s2.length()) return false;
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        for(int i=0; i<ch1.length; i++){
            if(ch1[i] != ch2[i]) return false;
        }
        return true;
    }

    // most frequent character 
    public static void MostOccuringChar(String s) {
        int n = s.length();
        int maxFreq = -1;
        char ans = ' ';
        for(int i=0; i<n; i++) {
            char ch = s.charAt(i);
            int count = 0;
            for(int j=0; j<n; j++) {
                if(s.charAt(j) == ch) {
                    count++;
                }
            }
            if(count > maxFreq) {
                maxFreq = count;
                ans = ch;
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        // test1();
        // test2();
        // test3();
        // countVowels();
        // isPalindrome();
        // builtInMethods();
        // compareTo("Kaushik", "Hello");
        // plus();
        // intToString();
        // countDigits();
        // stringToCharArray();
        // subStringOfString();
        // sumOfSubstrings();
        // interningView();
        // equal();
        // equals("Kaushik", "Kaushik");
        // stringBuilder();
        // reverseSb();
        System.out.println(anagram("listen", "silent"));
    }
}
