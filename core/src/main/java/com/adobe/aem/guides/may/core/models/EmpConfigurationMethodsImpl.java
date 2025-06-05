package com.adobe.aem.guides.may.core.models;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;

import com.adobe.aem.guides.may.core.services.EmpConfigurationMethods;

@Model(adaptables = SlingHttpServletRequest.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class EmpConfigurationMethodsImpl {

    @OSGiService
    EmpConfigurationMethods empConfigurationMethods;

    public String getEmpName(){
        return empConfigurationMethods.getEmpName();
    }

    public int getEmpId(){
        return empConfigurationMethods.getEmpId();
    }

    public double getEmpSalary(){
        return empConfigurationMethods.getEmpSalary();
    }

    public String getEmpCountry(){
        return empConfigurationMethods.getEmpCountry();
    }


}
