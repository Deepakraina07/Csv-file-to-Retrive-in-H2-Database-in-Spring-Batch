package com.samco.config;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Service;

import com.samco.model.Employee;

@Service
public class EmployeeProcessor implements ItemProcessor<Employee, Employee>{

	@Override
	public Employee process(Employee employee){
		return employee;
	}

}
