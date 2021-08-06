package com.mnrc.core.repositories;


import com.mnrc.core.entities.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends CrudRepository<Address, String> {
}
