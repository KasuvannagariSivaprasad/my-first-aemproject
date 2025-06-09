package com.adobe.aem.guides.may.core.schedulers;

import org.apache.sling.commons.scheduler.ScheduleOptions;
import org.apache.sling.commons.scheduler.Scheduler;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.metatype.annotations.Designate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(service = BiryaniOfferExpImp.class,immediate = true,enabled = true )
@Designate(ocd=BiryaniOfferExp.class)
public class BiryaniOfferExpImp implements Runnable {

    private static final Logger LOG=LoggerFactory.getLogger(BiryaniOfferExpImp.class);

    // @Reference
    // BiryaniOfferExp biryaniOfferExp;

    @Reference
    Scheduler scheduler;

    @Override
    public void run() {
       
        LOG.info("Log Coming From Biryani Offer Exp");
    }

    @Activate
    public void activateTheOffer(BiryaniOfferExp biryaniOfferExp){
        LOG.info("Biryani Offer  is activated.....");
        addSchedular(biryaniOfferExp);

    }

    @Deactivate
    public void deactivateTheOffer(){
        LOG.info("Biryani Offer is deactivated.....");

    }

    @Modified
    public void modifyTheOffer(){
        LOG.info("Biryani Offer is modified......");

    }

    public void addSchedular(BiryaniOfferExp biryaniOfferExp){
        LOG.info("Schedular added successfully......");
        if (biryaniOfferExp.enable_scheduler()) {
            ScheduleOptions options = scheduler.EXPR(biryaniOfferExp.scheduler_expression());
            options.name(biryaniOfferExp.scheduler_name());
            options.canRunConcurrently(biryaniOfferExp.concurrent_scheduler());

            // Add scheduler to call depending on option passed.
            scheduler.schedule(this, options);
            LOG.info("Scheduler added successfully name='{}'", biryaniOfferExp.scheduler_name());
        } else {
            LOG.info("SimpleScheduledTask disabled");
        }
    }
    }
    




