package Anonymus1;

public class Nandan {



    public static void main(String[] args) {

        // int request1 = 10;
        // int request2 = 0;

        // ThirdPartyClass tp = new ThirdPartyClass();

        // Integer computeBigId = tp.computeBigId(request1, request2);

        // if (computeBigId == null) {
        // computeBigId = 100;
        // }

        // System.out.println(computeBigId);

        // Calculator

        Student student = new Student();

        student.setAge("10.0");
        student.setGender("male");
        student.setName("Nandan");

        try {
            Double.parseDouble(student.getAge());
        } catch (NumberFormatException e) {
            System.out.println("Invalid age");
        }
    
     }

}
