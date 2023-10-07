import java.io.*;
import java.util.*;
class Str
{
public static void main(String args[])
{
String a,b,c;
int I, p;
Scanner S=new Scanner(System.in);
System.out.print("\nEnter a String1:");
a=S.next();
System.out.print("\nEnter a String2:");
b=S.next();
c=a.concat(b);
System.out.println("Concatenated String:"+c);
I=a.length();
System.out.println("Length of the String:"+c.length());
System.out.println("String in UpperCase:"+c.toUpperCase());
System.out.println("Enter the position to know the character At:");
p=S.nextInt();
System.out.println("The Character At that position:"+c.charAt(p-1));
}
}
/*
OUTPUT:

Enter a String1:hi
Enter a String2:dude
Concatenated String:haidude
Lenght of the String:6
String in UpperCase:HIDUDE
Enter the position to know the character At: 4
The Character At that position:U


*/
