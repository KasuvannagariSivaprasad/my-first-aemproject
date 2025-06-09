package com.adobe.aem.guides.may.core.schedulers;


import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name="Biryani Offer Expire")
public @interface BiryaniOfferExp {
        @AttributeDefinition(
            name = "Biryani Offer name",
            description = "Biryani name",
            type = AttributeType.STRING)
    String scheduler_name() default "Buy 1 get 1 Chicken Biryani";

    // cron job for every minute
    @AttributeDefinition(
        name = "Offer Time Periode",
        description = "Biryani Offer Time Periode",
        type = AttributeType.STRING)
    String scheduler_expression() default "0 * * * * ?";

    @AttributeDefinition(
        name = "Enable Offer",
        description = "Enable Offer",
        type = AttributeType.BOOLEAN)
    boolean enable_scheduler() default true;

    @AttributeDefinition(
        name = "Concurrent Offer",
        description = "Concurrent Offer",
        type = AttributeType.BOOLEAN)
    boolean concurrent_scheduler() default false;

}
