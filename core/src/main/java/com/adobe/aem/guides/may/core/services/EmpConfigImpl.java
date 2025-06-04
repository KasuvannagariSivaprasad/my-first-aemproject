package com.adobe.aem.guides.may.core.services;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.metatype.annotations.Designate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(immediate = true, enabled = true, service = EmpConfigImpl.class)
@Designate(ocd = EmpConfiguration.class)
public class EmpConfigImpl {

    public String empName;
    public int empId;
    public double empSalary;

    @Reference
    EmpConfiguration empConfiguration;

    private static final Logger LOG=LoggerFactory.getLogger(EmpConfigImpl.class);

    @Activate
    public void activateEmp(EmpConfiguration empConfiguration){

        updateConfiguration(empConfiguration);
        LOG.info("activate() method from EmpConfigImpl");
    }

    @Deactivate
    public void deActivateEmp(EmpConfiguration empConfiguration){

        LOG.info("deactivate() method from EmpConfigImpl");
        

    }

    @Modified
    public void modifiedEmp(EmpConfiguration empConfiguration){

        LOG.info("modified() method from EmpConfigImpl");

    }

    public void updateConfiguration(EmpConfiguration empConfiguration){ //we need to call this into activateEmp() method.
        this.empName=empConfiguration.empName();  //instance variable initialization
        this.empId=empConfiguration.empId();
        this.empSalary=empConfiguration.empSalary();
        LOG.info("empName{}.empId{},empSalary{}",empName,empId,empSalary);

       

    }

}
