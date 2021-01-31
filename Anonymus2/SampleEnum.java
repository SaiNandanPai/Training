package Anonymus2;

public enum SampleEnum {

    MONDAY("M"),
    TUESDAY("T@#@"),
    WEDNESDAY("Wednht");

    private final String day;
    
    SampleEnum(String day) {
        this.day = day;
    }

    public static SampleEnum name(String input) {
        for(SampleEnum x : SampleEnum.values()) {
            if (x.toString().equals(input)) {
                return x;
            }
        }
        throw new IllegalArgumentException("no input found 400: bad request");
    }
}
