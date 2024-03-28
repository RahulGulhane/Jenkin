package com.BikkadIT.RollBackTrans.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.BikkadIT.RollBackTrans.model.Employee;
@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
