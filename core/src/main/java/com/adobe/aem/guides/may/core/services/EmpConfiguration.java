package com.adobe.aem.guides.may.core.services;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;
import org.osgi.service.metatype.annotations.Option;

@ObjectClassDefinition(name = "Employee Details", description = "Taking Employee Details From Employee") //Whatever the name you gave here it will display on the SLING Configurations in author page
public @interface EmpConfiguration {

    @AttributeDefinition(
        //Actually these are the variable names that we giving here , so whatever the names given here those will display on the SLING Configurations in suthor page
        name="Employee Name",
        type = AttributeType.STRING,
        description="Enter Name",
        required =true,
        defaultValue = "Siva"
    )
    public String empName();

    @AttributeDefinition(
        name="ID No",
        type = AttributeType.INTEGER,
        description="Enter ID No",
        required =true,
        defaultValue = "475"
    )
    public int empId();

    @AttributeDefinition(
        name="Salary",
        type = AttributeType.DOUBLE,
        description="Enter Salary",
        required =true,
        defaultValue = "9999999"
    )
    public double empSalary();

    @AttributeDefinition(
        name="Country",
        type = AttributeType.STRING,
        options = {
            @Option(label="India",value = "india"),
            @Option(label = "UK", value = "UK"),
            @Option(label = "France", value = "france")
        },
        description="Enter COuntry",
        required =true,
        defaultValue = "India"
    )
    public String empCountry();


}

//Whenever we did OSGI Configuration[EmpConfiguration] for that we need to create a OSGI Service[EmpConfigurationImp], because to get the data that we passing here.