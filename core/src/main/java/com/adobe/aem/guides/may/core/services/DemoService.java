package com.adobe.aem.guides.may.core.services;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(service = DemoService.class, immediate = true, enabled = true)
public class DemoService {

    private static final Logger LOG=LoggerFactory.getLogger(DemoService.class);

    @Activate
    public void activate(){
        LOG.info("Message coming from the OSGI Service DemoService class method activate() ");
    }

    @Deactivate
    public void deActivate(){
        LOG.info("Message coming from the OSGI Service DemoService class method deactivate()");
    }

    @Modified
    public void modified(){
        LOG.info("Message coming from the OSGI Service DemoService class method modified()");
    }

}
