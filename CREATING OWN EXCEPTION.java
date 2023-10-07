import java.util.*;

class MyException extends Exception {
    public MyException(String str) {
        super(str); // Call the constructor of the parent Exception class with the message
    }
}

class Excep {
    public static void main(String[] args) {
        try {
            int age;
            String name;
            Scanner s = new Scanner(System.in);
            System.out.println("Enter name:");
            name = s.next();
            System.out.println("Enter Age:");
            age = s.nextInt();
            
            if (age < 18)
                throw new MyException("Access denied");
            else
                System.out.println("Access granted");
        } catch (MyException e) {
            System.out.println("Exception occurs: " + e.getMessage()); // Print the custom exception's message
        } catch (Exception e) {
            System.out.println("Other Exception occurs: " + e);
        }
    }
}
/*
OUTPUT:

Enter name: Jack
Enter age: 20
Access granted 


Enter name: Rose
Enter age: 15
Access denied 
Exception occurs: MyException

*/
