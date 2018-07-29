package com.Prashant;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestEmployeeDetails {
    EmployeeDetails employeeDetails=new EmployeeDetails();
    EmployeeService employeeService=new EmployeeService();

    @Test
    public void testCalculateAppriasal(){
        employeeDetails.setName("Prashant");
        employeeDetails.setAge(22);
        employeeDetails.setMonthlySalary(10000);
        double appraisal=employeeService.calculateAppraisal(employeeDetails);
        assertEquals(500,appraisal,0.0);
    }

    @Test
    public void testCalculateYearlySalary(){
        employeeDetails.setName("Maya");
        employeeDetails.setAge(22);
        employeeDetails.setMonthlySalary(13000);
        double yearlySalary=employeeService.calculateYearlySalary(employeeDetails);
        assertEquals(156000,yearlySalary,0.0);
    }

}
