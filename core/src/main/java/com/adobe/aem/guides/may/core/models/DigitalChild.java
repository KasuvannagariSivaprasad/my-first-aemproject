package com.adobe.aem.guides.may.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class DigitalChild  {
    


    @ValueMapValue
    private String bookname;

    @ValueMapValue
    private String bookdes;
    @ValueMapValue
    private String bookprice;

    public String getBookname() {
        return bookname;
    }

    public String getBookdes() {
        return bookdes;
    }

    public String getBookprice() {
        return bookprice;
    }


}
