 import java.util.*;
class MyException extends Exception {
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
            System.out.println("Exception occurs: " + e);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid age.");
        }
    }
    public MyException(String str) {
        super(str);
    }
}

 class Excep {
    
}

