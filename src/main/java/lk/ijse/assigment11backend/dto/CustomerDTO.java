package lk.ijse.assigment11backend.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CustomerDTO implements Serializable {

    private String customer_id;
    private String name;
    private String address;
    private String contact;

}
