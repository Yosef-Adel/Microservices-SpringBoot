package com.yosefadel.departmentservice.model;

/*
 * @created 30/07/2023 - 1:50 PM
 * @project service-regisry
 * @author Yosef Adel Mahmoud Saaid
 */
public record Employee(Long id, Long departmentId, String name, int age, String position) {
}
