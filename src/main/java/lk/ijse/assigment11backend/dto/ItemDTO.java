package lk.ijse.assigment11backend.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ItemDTO implements Serializable {

    private String item_id;
    private String descr;
    private String price;
    private String qty;

}