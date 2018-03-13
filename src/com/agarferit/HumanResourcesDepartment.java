package com.agarferit;


public class HumanResourcesDepartment {
    private Employee employee;


    public HumanResourcesDepartment() {
          this.employee = employee;
    }

    public void hireEmployee(String firstName, String lastName, String ssn){
        Employee newEmp = new Employee(firstName, lastName, ssn);
        newEmp.setFirstName(firstName);
        newEmp.setLastName(lastName);
        newEmp.setSsn(ssn);
        newEmp.doFirstTimeOrientation("A123");
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        if(employee == null) {
            throw new NullPointerException("employee is null");
        }
        this.employee = employee;
    }

}
