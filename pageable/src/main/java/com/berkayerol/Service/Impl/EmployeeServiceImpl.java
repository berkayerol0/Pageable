package com.berkayerol.Service.Impl;

import com.berkayerol.Dto.DtoDepartment;
import com.berkayerol.Dto.DtoEmployee;
import com.berkayerol.Model.Employee;
import com.berkayerol.Repository.EmployeeRepository;
import com.berkayerol.Service.IEmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

    private static final Logger logger = LoggerFactory.getLogger(EmployeeServiceImpl.class);

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Page<Employee> findAllPageable(Pageable pageable) {
        logger.info("Fetching employees with pageable: {}", pageable); 
        Page<Employee> page = employeeRepository.findAllPageable(pageable);
        return page;
    }

    @Override
    public List<DtoEmployee> toDTOList(List<Employee> employeeList) {
        logger.info("Converting Employee list to DTO list. Size: {}", employeeList.size()); 
        List<DtoEmployee> dtoList = new ArrayList<>();

        for(Employee employee: employeeList) {
            DtoEmployee dtoEmployee = new DtoEmployee();
            DtoDepartment dtoDepartment = new DtoDepartment();

            BeanUtils.copyProperties(employee, dtoEmployee);
            BeanUtils.copyProperties(employee.getDepartment(), dtoDepartment);

            dtoEmployee.setDepartment(dtoDepartment);

            dtoList.add(dtoEmployee);

        }
        return dtoList;
    }
}