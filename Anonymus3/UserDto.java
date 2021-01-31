package Anonymus3;

public class UserDto {

    private Long userId;
    private String userName;
    private String address;
    private Long phoneNumber;

    public UserDto(Builder builder) {
        this.address = builder.address;
        this.phoneNumber = builder.phoneNumber;
        this.userId = builder.userId;
        this.userName = builder.userName;
    }

    public String getAddress() {
        return address;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public Long getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Long userId;
        private String userName;
        private String address;
        private Long phoneNumber;

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setPhoneNumber(Long phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public Builder setUserId(Long userId) {
            this.userId = userId;
            return this;
        }

        public UserDto build() {
            return new UserDto(this);
        }
    }

}

// POJO - Plain Old Java Object

// POJO consists of getter and setter methods for the private fields / Objects
// inside it.

// On leaving the POJO without any modification, it will be called API response
// classes in MicroService

// On converting the POJO to Builder Pattern, it is called Concepts in
// MicroServices

// On converting the POJO to an Entity Representation, it is called JPA Entities
// in Hibernate and JPA

// On converting the POJO to an Entity Representation in Spring Boot, it is
// called JPA Entities / Bean
