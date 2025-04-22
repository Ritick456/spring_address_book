package com.bridgelabz.addressbook.service;

import com.bridgelabz.addressbook.dto.AddressBook;
import com.bridgelabz.addressbook.entity.Address;
import org.springframework.stereotype.Service;


@Service
public class AddressService {

    public Address getAddress(AddressBook address){

        Address adrs = new Address();

        adrs.setEmail(address.getEmail());
        adrs.setCity(address.getCity());
        adrs.setId(address.getId());
        adrs.setName(address.getName());

        return adrs;

    }


}
