package com.redouane.RedouaneDemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PersonDTO {
    
    private int id;
    private String name;
    private String email;
    private Boolean state;
}
