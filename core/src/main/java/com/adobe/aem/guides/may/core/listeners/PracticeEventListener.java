package com.adobe.aem.guides.may.core.listeners;

import javax.jcr.RepositoryException;
import javax.jcr.observation.EventIterator;
import javax.jcr.observation.EventListener;

import org.osgi.service.component.annotations.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(immediate = true, enabled = true, service = EventListener.class)
public class PracticeEventListener implements EventListener{
    private static final Logger LOG=LoggerFactory.getLogger(PracticeEventListener.class);

    @Override
    public void onEvent(EventIterator eventIterator) {
        while (eventIterator.hasNext()) {
            try {
                LOG.info("onEvent Path = '{}",eventIterator.nextEvent().getPath());
            } catch (RepositoryException e) {
                LOG.info("RespositoryException", e);
            }
            
        }
        
    }

}
