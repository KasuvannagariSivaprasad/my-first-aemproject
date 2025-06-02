package com.adobe.aem.guides.may.core.services;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name = "Emp Configuration")
public @interface EmpConfiguration {

    @AttributeDefinition(
        name="Siva",
        description="Software Employee",
        required =true,
        defaultValue = "Employee Name"
    )
    public String empName();

    @AttributeDefinition(
        name="475",
        description="His Id is 475",
        required =true,
        defaultValue = "9999"
    )
    public int empId();

    @AttributeDefinition(
        name="7000000",
        description="Total 7000000 rupees only",
        required =true,
        defaultValue = "9999999"
    )
    public double empSalary();


}
