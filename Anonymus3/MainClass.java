package Anonymus3;

import Anonymus1.Orange;

public class MainClass {

    public static void main(String[] args) {

        UserDto.Builder userBuilder = UserDto.builder();

        UserDto userDto = userBuilder
                                    .setAddress("address")
                                    .setPhoneNumber(2335746L)
                                    .setUserId(12223L)
                                    .setUserName("name")
                                    .build();

        // userBuilder.setAddress(address);

        // userDetails.setAddress("address");
        // userDetails.setPhoneNumber(8899334343L);
        // userDetails.setUserId(223344L);
        // userDetails.setUserName("userName");

        // abc.userName = "asdad";

        // ChildUserDto o = new ChildUserDto();
        // ---------------------------------------------------------------
        // hacker man in middle
        // userDetails.setUserId(13214214L);


        processData(userDto);

        // ------------------------------------------------

        Cup cup = new Cup();

        PrepareTea prepareTea = new PrepareTea();
        prepareTea.initialzeTea();
        Vessel vessel = prepareTea.getVessel();

        cup.addTea(vessel.getTea());

        System.out.println(cup.getTea());

    }

    public static void processData(UserDto userDto) {
        //userDto.getAddress();

    }

}
