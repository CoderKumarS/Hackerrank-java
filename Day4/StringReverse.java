/*
 * A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.

Given a string , print Yes if it is a palindrome, print No otherwise.

Constraints

 will consist at most  lower case english letters.
Sample Input

madam
Sample Output

Yes
 */

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int i = A.length()-1;
        String rev="";
        do {
            String str=A.substring(i, i+1);
            // String str = A.charAt(i);
            rev+=str;
            i--;
        } while (i>=0);
        if (A.compareTo(rev)==0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}
