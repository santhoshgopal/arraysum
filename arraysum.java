import java.io.*;
import java.util.*;
public class arraysum
{
public static void main(String[] args)
{
int temp=0;
Scanner in = new Scanner(System.in);
String n=in.nextLine();
int len=n.length();
char[] b=n.toCharArray();
ArrayList<Character> abc=new ArrayList<Character>();
for(int i=0;i<len;i++)
abc.add(b[i]);
for(char z : abc)
{
		temp=temp+Character.getNumericValue(z);
		
}
System.out.println(temp);

		
		if(len<=0)
		System.out.println("NO VALID INPUT");

	}
}