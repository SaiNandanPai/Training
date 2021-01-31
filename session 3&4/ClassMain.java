import java.time.Instant;


public class ClassMain {

    public static void main(String[] args) {

        // String x = "nandan";
        // String y = " - hello";

        // System.out.println(x.substring(2, 5));

        // equals, isEmpty ,trim, toUpperCase, indexOf, substring, contains,concat,
        // split, lastIndexOf

        // StringBuilder - Immutable, not Thread Safe
        // StringBuffer - not Immutable, Thread Safe

        Instant mockDob = Instant.now(); // apple.getDob();
        long ssnNumber = 2233333L; // apple.getSsn();
        long userId = 89347L;// apple.getUserId();
        String userName = "Pai,Sai Nandan";

        UserDto userDto = buildUserDto(mockDob, ssnNumber, userId, userName);

        System.out.println(userDto);

        // Changed object state

        long hackerNumber = 65757575L;
        // userDto.setSsnNumber(hackerNumber);
        System.out.println(userDto);

    }

    private static UserDto buildUserDto(Instant mockDob, long ssnNumber, long userId, String userName) {

        UserDto.Builder userBuilder = UserDto.builder();

        userBuilder.setDateOfBirth(mockDob.toString());

        if (ssnNumber > 0L) {
            userBuilder.setSsnNumber(ssnNumber);
        }

        userBuilder.setUserId(userId).setUserName(userName);

        return userBuilder.build();
    }

}
