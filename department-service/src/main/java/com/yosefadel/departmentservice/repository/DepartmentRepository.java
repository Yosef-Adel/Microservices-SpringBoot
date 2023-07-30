package com.yosefadel.departmentservice.repository;

/*
 * @created 30/07/2023 - 1:55 PM
 * @project service-regisry
 * @author Yosef Adel Mahmoud Saaid
 */

import com.yosefadel.departmentservice.model.Department;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DepartmentRepository {

  // create a list of departments
    private List<Department> departments = new ArrayList<>();

    // add departments to the list
    public Department addDepartment(Department department) {
        departments.add(department);
        return department;
    }

    // get departments from the list by id
    public Department getDepartment(Long id) {
        return departments.stream()
                .filter(department -> department.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Department not found"));
    }

    // get all departments from the list
    public List<Department> getDepartments() {
        return departments;
    }

}
