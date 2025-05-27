package com.adobe.aem.guides.may.core.models;

import org.apache.sling.models.annotations.Model;



import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;

import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables =Resource.class , defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class DigitalSubChild {

    @ValueMapValue
    private String bookwriter;

    @ValueMapValue
    private String writerdes;
    @ValueMapValue
    private String writersalary;


    public String getBookwriter() {
        return bookwriter;
    }
    public String getWriterdes() {
        return writerdes;
    }

    public String getWritersalary() {
        return writersalary;
    }


}
