package com.adobe.aem.guides.may.core.services;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.metatype.annotations.Designate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(service = EmpConfigurationMethods.class)
@Designate(ocd = EmpConfiguration.class)
public class EmpConfigurationImpl implements EmpConfigurationMethods{//Note Siva: whenever you creating a class for that You have to create a interface . That is suggested way

    public String empName;
    public int empId;
    public double empSalary;
    public String empCountry;

    // @Reference
    // EmpConfiguration empConfiguration;

    private static final Logger LOG=LoggerFactory.getLogger(EmpConfigurationImpl.class);

    @Activate
    public void activateEmp(EmpConfiguration empConfiguration){
        empName=empConfiguration.empName();
        empId=empConfiguration.empId();
        empSalary=empConfiguration.empSalary();
        empCountry=empConfiguration.empCountry();
        // LOG.info(empName+" "+empId+" "+empSalary+" "+empCountry);

        LOG.info("activate() method from EmpConfigurationImpl");
    }



    @Override
    public String getEmpName() {
        return empName;
    }

    @Override
    public int getEmpId() {
       return empId;
    }

    @Override
    public double getEmpSalary() {
      return empSalary;
    }

    @Override
    public String getEmpCountry() {
        return empCountry;
    }

}
