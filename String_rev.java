//reverse of a string

import java.util.Scanner;
class String_rev
{
  public static void main(String[] args)
  {
     String s;
     int i,n;
     Scanner in = new Scanner(System.in);
     System.out.println("enter the string:");
     s=in.nextLine();
     char[] c = s.toCharArray();
     n=s.length();
     for(i=n-1;i>=0;i--)
     {
       System.out.print(c[i]);
     }
  }
}
