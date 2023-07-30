package com.example.employeeservice.model;

/*
 * @created 30/07/2023 - 2:47 PM
 * @project service-regisry
 * @author Yosef Adel Mahmoud Saaid
 */
public record Employee(Long id, Long departmentId, String name, int age, String position) {
}
