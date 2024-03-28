package com.BikkadIT.RollBackTrans.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIT.RollBackTrans.model.Address;
import com.BikkadIT.RollBackTrans.model.Employee;
import com.BikkadIT.RollBackTrans.repository.AddressRepository;
import com.BikkadIT.RollBackTrans.repository.EmployeeRepository;

import jakarta.transaction.Transactional;

@Service
public class ServiceImpl {
  
	@Autowired
	private AddressRepository addressRepository;
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Transactional(rollbackOn = Exception.class)
	public void saveData() {
		Employee emp = new Employee();
		emp.setEmpId(2);
		emp.setEmpname("Santosh");
		emp.setEmpAge(11);
		employeeRepository.save(emp);
		
		int a = 10;
		int b = 0;
		//int c = a / b;
		
		Address addr = new Address();
		addr.setAddrId(2);
		addr.setArea("Dange Chauk");
		addr.setCity("Pune");
		addressRepository.save(addr);
		
		
		
	}
	
}
