package com.berkayerol.Service;

import com.berkayerol.Dto.DtoEmployee;
import com.berkayerol.Model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IEmployeeService {

    Page<Employee> findAllPageable(Pageable pageable);

    List<DtoEmployee> toDTOList(List<Employee> employeeList);
}
