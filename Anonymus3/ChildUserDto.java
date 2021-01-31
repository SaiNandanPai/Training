package Anonymus3;

import Anonymus1.Orange;

public class ChildUserDto {

    private Long userId;
    private Long ssnNumber;
    private Long cllgId;
    private Long usn;
    private Long empId;
    private Long phoneNumber;

 
    public Long getUserId() {
        return userId;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getSsnNumber() {
        return ssnNumber;
    }

    public void setSsnNumber(Long ssnNumber) {
        this.ssnNumber = ssnNumber;
    }

    public Long getCllgId() {
        return cllgId;
    }

    public void setCllgId(Long cllgId) {
        this.cllgId = cllgId;
    }

    public Long getUsn() {
        return usn;
    }

    public void setUsn(Long usn) {
        this.usn = usn;
    }

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


}
