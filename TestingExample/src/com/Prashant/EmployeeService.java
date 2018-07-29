package com.Prashant;

public class EmployeeService {
    public double calculateYearlySalary(EmployeeDetails employeeDetails){
        double yearlySalary=0;
        yearlySalary=employeeDetails.getMonthlySalary()*12;
        return yearlySalary;
    }

    public double calculateAppraisal(EmployeeDetails employeeDetails){
        double appraisalAmount=0;
        if(employeeDetails.getMonthlySalary()<15000){
            appraisalAmount=500;
        }else {
            appraisalAmount=1500;
        }
        return appraisalAmount;
    }
}
