package com.bridgelabz.addressbook.repository;

import com.bridgelabz.addressbook.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public interface AddressRepository extends JpaRepository<Address , Integer> {
}
