package com.BikkadIT.RollBackTrans.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.BikkadIT.RollBackTrans.model.Address;
@Repository
public interface AddressRepository extends CrudRepository<Address, Integer> {

}
