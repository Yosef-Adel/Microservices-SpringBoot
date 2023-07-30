package com.yosefadel.departmentservice.client;

import com.yosefadel.departmentservice.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import java.util.List;

/*
 * @created 30/07/2023 - 4:34 PM
 * @project service-regisry
 * @author Yosef Adel Mahmoud Saaid
 */
@HttpExchange
public interface EmployeeClient {
    @GetExchange("/employee/department/{departmentId}")
    public List<Employee> findByDepartment(@PathVariable("departmentId") Long departmentId);
}
