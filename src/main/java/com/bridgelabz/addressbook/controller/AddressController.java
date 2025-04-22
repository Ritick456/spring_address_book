package com.bridgelabz.addressbook.controller;

import com.bridgelabz.addressbook.dto.AddressBook;
import com.bridgelabz.addressbook.entity.Address;
import com.bridgelabz.addressbook.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    AddressService addressService;


        @GetMapping("/dto")
        public Address dtoController(@RequestBody AddressBook book){

            Address a = new Address();
            a.setCity(book.getCity());
            a.setId(book.getId());
            a.setName(book.getName());
            a.setEmail(book.getEmail());

            return a;

        }

    @GetMapping("/service")
    public Address serviceController(@RequestBody AddressBook book){

            Address add = addressService.getAddress(book);

            return add;

    }
        @GetMapping
        public Map<String , String> getAddress(){
            Map<String , String> response = new HashMap<>();
            response.put("Message" , "get request");
            return  response;
        }

        @PostMapping
        public Map<String , String> postAddress(){
            Map<String , String> response = new HashMap<>();
            response.put("Message" , "get request");
            return  response;
        }

        @PutMapping
        public Map<String , String> putAddress(){
            Map<String , String> response = new HashMap<>();
            response.put("Message" , "get request");
            return  response;
        }

        @DeleteMapping
        public Map<String , String> deleteAddress(){
            Map<String , String> response = new HashMap<>();
            response.put("Message" , "get request");
            return  response;
        }

}
