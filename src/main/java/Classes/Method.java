package Classes;

import com.sun.tools.javac.Main;

public class Method {
    // There are two types of Modifiers:

    // 1. Access Modifier---> public, protected, private

    // 2. Non-access Modifier---> static, final, abstract, synchronized, volatile

    //--------------------------------------------------------------------------------------------------------------------//
    public class PublicExample{
        public void display(){
            System.out.println("This a Public method");
        }
    }
    class AccessTest{
        public static void main(String[] args) {
            PublicExample publicExample = new PublicExample();
            publicExample.display(); // Accessible
        }
    }

    public  class ProtectedExample{
            protected void display(){
                System.out.println("This is Protected Method");
        }
    }

    class Subclass extends ProtectedExample{
        public static void main(String[] args) {
            Subclass obj = new Subclass();
            obj.display(); // Accessible
        }
    }

    public class PrivateExample{
        private void display(){
            System.out.println("This is a Private Method");
        }

        public static void main(String[] args) {
            PrivateExample privateExample = new PrivateExample();
            privateExample.display(); // Accessible with in the same class
        }
    }

   //----------------------------------------------------------------------------//
    //---------------------------------------------------------------------------//

    public class StaticExample{
        public static int counter = 0;  // static variable

        public static void incrementCounter(){
            counter++;  // Static method
        }

        public static void main(String[] args) {
            StaticExample.incrementCounter();
            System.out.println("Counter Value : " + StaticExample.counter);
        }
    }

    public class FinalExample {
        public final int VALUE = 10;  // Final variable

        public final void displayValue(){
            System.out.println("Value : " + VALUE );  // Final Method
        }
    }

    abstract class AbstractExample{      // Abstract class
        abstract void display();          // Abstract Method
    }

    class ConcreteExample extends AbstractExample{
        abstract void display();     // Abstract Method
        void display(){
            System.out.println("Concrete Implementation of display");
        }

        public static void main(String[] args) {
            ConcreteExample concreteExample = new ConcreteExample();
            concreteExample.display();
        }

    }


 }

