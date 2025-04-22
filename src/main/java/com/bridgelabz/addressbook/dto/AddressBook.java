package com.bridgelabz.addressbook.dto;


import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddressBook {

    private int id;
    private String name;
    private String email;
    private String City;

}
