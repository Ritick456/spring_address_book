package com.bridgelabz.addressbook.controller;

import com.bridgelabz.addressbook.dto.AddressBook;
import com.bridgelabz.addressbook.entity.Address;
import com.bridgelabz.addressbook.service.AddressService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    AddressService addressService;
    
        @GetMapping
        public Map<String , String> getAddress(){
            log.trace("Checking request");
            Map<String , String> response = new HashMap<>();
            response.put("Message" , "get request");
            return  response;
        }

        @PostMapping("/create")
        public Address createAddress(@RequestBody  AddressBook address){
            log.trace("Creating new Adress");
            Address add  = addressService.createAddress(address);
            return add;
        }

        @GetMapping("/all")
        public List<Address> getAllAddress(){
            log.trace("Fetching all contacts");
            List<Address> list = addressService.getAllAddress();
            return list;
        }

        @GetMapping("/{id}")
        public Address getAddressById(@PathVariable int id){
            log.trace("Fetching contacts by id");
            Address add = addressService.getAddressById(id);
            return add;
        }



        @PostMapping
        public Map<String , String> postAddress(){
            log.trace("Checking post request");
            Map<String , String> response = new HashMap<>();
            response.put("Message" , "get request");
            return  response;
        }

        @PutMapping("/{id}")
        public Address updateAddress(@PathVariable int id, @RequestBody AddressBook request){
            log.trace("updating Address By id");
            System.out.println("kshfkahfk");
            Address add = addressService.update(id , request);

            return add;

        }


        @PutMapping
        public Map<String , String> putAddress(){
            log.trace("Updating Adress");
            Map<String , String> response = new HashMap<>();
            response.put("Message" , "get request");
            return  response;
        }

        @DeleteMapping("/delete/{id}")
        public void deleteAddress(@PathVariable int id){
            log.trace("Deleting Adress");
            try{
                addressService.deleteAddress(id);
            }
            catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
        @DeleteMapping
        public Map<String , String> deleteAddress(){
            log.trace("Checking Delete request");
            Map<String , String> response = new HashMap<>();
            response.put("Message" , "get request");
            return  response;
        }

}
