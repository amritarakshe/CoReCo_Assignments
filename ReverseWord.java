package task.com;

import java.util.Stack;

public class ReverseWord {
	
	static void reverseWords(String str)
    {
        Stack<Character> st = new Stack<Character>();

        for (int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) != ' ')
                st.push(str.charAt(i));

            else {
                while (st.empty() == false) {
                    System.out.print(st.pop());
                }
                System.out.print(" ");
            }
        }

        while (st.empty() == false) {
            System.out.print(st.pop());
        }
    }

	public static void main(String[] args) {
		String str = "Hello World";
        reverseWords(str);

	}

}
