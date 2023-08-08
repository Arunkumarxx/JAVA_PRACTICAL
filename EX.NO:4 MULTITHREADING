import java.lang.*;
class A extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("From Thread A+++ " + i + " * 3 = " + (i * 3));
        }
        System.out.println("Exit from Thread A");
    }
}

class B extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("From Thread B+" + i + " * 4 = " + (i * 4));
        }
        System.out.println("Exit from Thread B");
    }
}

class C extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("From Thread C++ " + i + " + 5 = " + (i * 5));
        }
        System.out.println("Exit from thread C");
    }
    public static void main(String args[]) {
        C obj2 = new C();
        A obj = new A();
        B obj1 = new B();

        obj2.setPriority(10);
        obj.setPriority(1);
        obj1.setPriority(7);

        System.out.println("Thread A start");
        System.out.println("Thread B start");
        System.out.println("Thread C start");

        obj.start();
        obj1.start();
        obj2.start();
}
}
