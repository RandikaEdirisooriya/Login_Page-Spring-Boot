package lk.ijse.login.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CitizanDto {
    private  int id;
    private String NIC;
    private String FirstName;
    private String LastName;
    private String ContactNumber;
    private String Address;
    private String EmailAddress;
    private String Password;
}
