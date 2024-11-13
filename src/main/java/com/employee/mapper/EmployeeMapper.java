package com.employee.mapper;

import com.employee.dto.EmployeeDto;
import com.employee.entity.Employee;

/*NOTE*-> MAPPER CLASS IS USED TO MAP JPA-ENTITY TO DTO[VICE-VERSA], 
WHENEVER WE BUILD RESTFUL SERVICES WE HAVE CONVERT DTO TO JPA-ENTITY AND VICE-VERSA.*/


public class EmployeeMapper {

    public static EmployeeDto mapToEmployeeDto(Employee employee) {
        return new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail()
        );
    }

    public static Employee mapToEmployee(EmployeeDto employeeDto) {
    	//THIS METHOD CONVERTS EMPLOYEEDTO TO EMPLOYEE
        return new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail()
        );
    }
}



