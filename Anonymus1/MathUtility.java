package Anonymus1;

public final class MathUtility {
    
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static Integer calculateQuantity(int a, int b , int c) {
        return a + b + c;
    }

    MathUtility() {
        System.out.println("Last to execute");
     }
    
     void name() {
         //method body;
     }
        
     {
         // Anonymus block
         System.out.println("Second to execute");
     }

    static {
        System.out.println("First to execute"); // Logger
    }
}
