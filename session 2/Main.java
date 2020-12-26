public class Main {

    public static void main(String[] args) {

        SomeOtherGuys someGuy = new SomeOtherGuys();

        String stringValue = "50"; //given to me by client

        stringValue = "";

        int xzy = 10;

        Integer x = someGuy.computeSomeCalculation(stringValue);

        System.out.println(x);

    }

}