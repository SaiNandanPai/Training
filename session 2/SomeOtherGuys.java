public class SomeOtherGuys {


    public Integer computeSomeCalculation(String x) {
        if(x == null || x.isEmpty()) {
            return null;
        }
        return Integer.parseInt(x);
    }
    
}
