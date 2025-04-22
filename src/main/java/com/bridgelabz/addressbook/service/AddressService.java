package com.bridgelabz.addressbook.service;

import com.bridgelabz.addressbook.dto.AddressBook;
import com.bridgelabz.addressbook.entity.Address;
import com.bridgelabz.addressbook.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class AddressService {

    @Autowired
    AddressRepository addressRepository;

    public Address getAddress(AddressBook address){

        Address adrs = new Address();

        adrs.setEmail(address.getEmail());
        adrs.setCity(address.getCity());
        adrs.setId(address.getId());
        adrs.setName(address.getName());

        return adrs;

    }


    public Address createAddress(AddressBook book){

        Address add = new Address();

        add.setName(book.getName());
        add.setCity(book.getCity());
        add.setId(book.getId());
        add.setEmail(book.getEmail());

        addressRepository.save(add);
        return add;
    }

    public List<Address> getAllAddress(){

        return  addressRepository.findAll();
    }

    public  Address getAddressById(int id){

        Optional<Address> add = addressRepository.findById(id);

        Address addres = new Address();
        addres = add.get();
        return addres;

    }

    public Address update(int id, AddressBook book){

        Optional<Address> add = addressRepository.findById(id);

        if(!add.isEmpty()){
            Address addres = add.get();

            addres.setEmail(book.getEmail());
            addres.setName(book.getName());

            addres.setCity(book.getCity());

            addressRepository.save(addres);
            return addres;
        }


        return null;

    }

    public void deleteAddress(int id){

        if(!addressRepository.existsById(id)){
            throw new IllegalArgumentException("Not found with id : " + id);
        }
        addressRepository.deleteById(id);

    }

}
