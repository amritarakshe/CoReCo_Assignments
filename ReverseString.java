package task.com;

public class ReverseString {

	public static void main(String[] args) {
		String str= "Hello World", revstr="";
        char ch;
       
      System.out.print("Original String: ");
      System.out.println("Hello World"); 
       
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); 
        revstr= ch+revstr;
      }
      System.out.println("Reversed String: "+ revstr);

	}

}
