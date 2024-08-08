package Classes;

import com.sun.tools.javac.Main;

public class Method
{
    // Static Method
    static void myStaticMethod(){
        System.out.println("Static methods can be called without creating objects");
    }

    // Public Method
    public void myPublicMethod(){
        System.out.println("Public methods must be called by creating objects");
    }

    // Main Method
    public static void main(String[] args) {
        //  call the static method
        myStaticMethod();

        // This would output an error
        myPublicMethod();

        Main myObj = new Main(); // create an object of Main
        myObj.myPublicMethod(); // call the public method
    }

    // abstract class
    abstract class main {
        public String fname = "Mohammad";

        public int age = 24;

        public abstract void study(); // abstratct method
    }

    // Subclass (inherit from Main)
    class Student extends Main{
        public int graduationYear = 2018;

        // the body of the abstract method is provided here
        public void study(){
            System.out.println("Studying all day long");
        }
    }



}
