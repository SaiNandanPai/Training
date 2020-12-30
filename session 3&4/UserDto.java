
final class UserDto {

    // 1st step
    private final Long userId;
    private final String userName;
    private final String dateOfBirth;
    private final Long ssnNumber;

    // 3rd step
    private UserDto(final UserDto.Builder builder) {
        this.userId = builder.userId;
        this.userName = builder.userName;
        this.dateOfBirth = builder.dateOfBirth;
        this.ssnNumber = builder.ssnNumber;
    }

    
    public Long getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public Long getSsnNumber() {
        return ssnNumber;
    }
    
    public static UserDto.Builder builder() {
		return new Builder();
	}

    // 2nd step
    public static class Builder {
        private Long userId; // this
        private String userName;
        private String dateOfBirth;
        private Long ssnNumber;

        public UserDto.Builder setUserId(Long userId) {
            this.userId = userId;
            return this;
        }

        public UserDto.Builder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public UserDto.Builder setDateOfBirth(String dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public UserDto.Builder setSsnNumber(Long ssnNumber) {
            this.ssnNumber = ssnNumber;
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