import java.io.*;
/*package program*/
// package  pk1;
// public
  
 class success
{
int r,sum=0;
public int sumd(int n1)
{
while(n1>0)
{
r=n1%10;
sum=sum+r;
n1=n1/10;
}
return sum;
}
}
/*Source program*/
// import pk1.success;

class Ex
{
public static void main(String args[])throws IOException
{
int n;
DataInputStream t=new DataInputStream(System.in);
success ob=new success();
System.out.println("Enter the n number:");
n=Integer.parseInt(t.readLine());
System.out.println("Sum of the digit:"+ob.sumd(n));
}
}
