package com.berkayerol.Controller.Impl;

import com.berkayerol.Controller.IRestEmployeeController;
import com.berkayerol.Dto.DtoEmployee;
import com.berkayerol.Model.Employee;
import com.berkayerol.Service.IEmployeeService;
import com.berkayerol.Utils.RestPageableEntity;
import com.berkayerol.Utils.RestPageableRequest;
import com.berkayerol.Utils.RestRootEntity;
import org.springframework.data.domain.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api/employee")
public class RestEmployeeControllerImpl extends RestBaseController implements IRestEmployeeController {

    @Autowired
    private IEmployeeService employeeService;
    
    @GetMapping("/list/pageable")
    @Override
    public RestRootEntity<RestPageableEntity<DtoEmployee>> findAllPageable(RestPageableRequest pageableRequest) {
        Page<Employee> page = employeeService.findAllPageable(toPageable(pageableRequest));
        RestPageableEntity<DtoEmployee> pageableResponse = toPageableResponse(page, employeeService.toDTOList(page.getContent()));
        return ok(pageableResponse);
    }
}
