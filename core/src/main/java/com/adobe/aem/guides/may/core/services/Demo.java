package com.adobe.aem.guides.may.core.services;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(immediate = true,enabled = true,name = "DemoSerive")
public class Demo {

    //to know how the OSGI srvice methods are working we can track them by using LOGGER functions.

    private static final Logger LOG=LoggerFactory.getLogger(Demo.class);
    //Note: Logger and Loggerfactory should be from org.slf4j.Logger package
    //we can pass our class to the Logger

    @Activate
    public void activateTheContent(){
        LOG.info("Method coming from OSGI Component Services activate() method");
    }

    @Deactivate
    public void deActivateTheContent(){
        LOG.info("Method coming from OSGI Component Services deActivate() method");
    }

    @Modified
    public void modifyTheContent(){
        LOG.info("Method coming from OSGI Component Services modified() method");
    }

}