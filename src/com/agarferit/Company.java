package com.agarferit;

public class Company {

      private HumanResourcesDepartment hrd;

    public Company() {
//        this.hrd = hrd;
        hrd = new HumanResourcesDepartment();
    }

    public void hireEmployee (String firstName, String lastName, String ssn){
        hrd.hireEmployee(firstName,lastName,ssn);
    }

    public HumanResourcesDepartment getHrd() {
        return hrd;
    }

    public void setHrd(HumanResourcesDepartment hrd) throws NullPointerException {
        if(hrd == null) {
            throw new NullPointerException("HRD is null");
        }
        this.hrd = hrd;
    }
}
