package com.bridgelabz.addressbook.controller;

import com.bridgelabz.addressbook.dto.AddressBook;
import com.bridgelabz.addressbook.entity.Address;
import com.bridgelabz.addressbook.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    AddressService addressService;


        @PostMapping("/create")
        public Address createAddress(@RequestBody  AddressBook address){

            Address add  = addressService.createAddress(address);

            return add;
        }

        @GetMapping("/all")
        public List<Address> getAllAddress(){
            List<Address> list = addressService.getAllAddress();
            return list;
        }

        @GetMapping("/{id}")
        public Address getAddressById(@PathVariable int id){

            Address add = addressService.getAddressById(id);
            return add;
        }


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

        @PutMapping("/{id}")
        public Address updateAddress(@PathVariable int id, @RequestBody AddressBook request){

            System.out.println("kshfkahfk");
            Address add = addressService.update(id , request);

            return add;

        }


        @PutMapping
        public Map<String , String> putAddress(){
            Map<String , String> response = new HashMap<>();
            response.put("Message" , "get request");
            return  response;
        }

        @DeleteMapping("/delete/{id}")
        public void deleteAddress(@PathVariable int id){

            try{
                addressService.deleteAddress(id);
            }
            catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
        @DeleteMapping
        public Map<String , String> deleteAddress(){
            Map<String , String> response = new HashMap<>();
            response.put("Message" , "get request");
            return  response;
        }

}
