package com.imooc.repository;

import com.imooc.domain.Employee;
import org.springframework.data.repository.Repository;

public interface EmployeeRepository extends Repository<Employee,Integer> {
    Employee findByName(String name);
}
