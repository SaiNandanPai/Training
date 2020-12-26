class MainUtility {

 int a;

 MainUtility() {
    System.out.println("Last to execute");
 }

 void name() {
     //method body;
 }

 static {
     System.out.println("First to execute"); // Logger
 }

 {
     // Anonymus block
     System.out.println("Second to execute");
 }


}


// MyMain's address +  static block 


// Order of calling the Memory blocks