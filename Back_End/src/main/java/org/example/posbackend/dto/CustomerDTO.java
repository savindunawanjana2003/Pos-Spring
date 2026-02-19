package org.example.posbackend.dto;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class CustomerDTO {
    @NotNull(message = "Custormer Id is mandatory...")
    private Long cId;
    @NotBlank
    @Pattern(regexp = "^[A-Za-z ]{3,50}$",message = "Custormer name Paten avelable..")
    private String cName;
    @Size(min = 10,max = 100,message ="Min 10 $ Max 100")
    private String cAddress;

    public CustomerDTO(Long cId, String cName, String cAddress) {
        this.cId = cId;
        this.cName = cName;
        this.cAddress = cAddress;
    }
    public CustomerDTO() {

    }

    public Long getCId() {
        return cId;
    }

    public String getCname() {
        return cName;
    }

    public String getCaddress() {
        return cAddress;
    }

    public void setcId(Long cId) {
        this.cId = cId;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public void setcAddress(String cAddress) {
        this.cAddress = cAddress;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "cId=" + cId +
                ", cName='" + cName + '\'' +
                ", cAddress='" + cAddress + '\'' +
                '}';
    }


}
