package com.adobe.aem.guides.may.core.workflows;


import org.osgi.service.component.annotations.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.adobe.granite.workflow.WorkflowException;
import com.adobe.granite.workflow.WorkflowSession;
import com.adobe.granite.workflow.exec.WorkItem;
import com.adobe.granite.workflow.exec.WorkflowProcess;
import com.adobe.granite.workflow.metadata.MetaDataMap;

@Component(service = WorkflowProcess.class,immediate = true,enabled = true,
            property = {"process.label=Articel2025" } )
public class ArticleWorkFlow implements WorkflowProcess{
    private static final Logger LOG=LoggerFactory.getLogger(ArticleWorkFlow.class);

    @Override
    public void execute(WorkItem workItem, WorkflowSession arg1, MetaDataMap arg2) throws WorkflowException {

        String payLoadType=workItem.getWorkflowData().getPayloadType();
        if("JCR_PATH".equals(payLoadType)){
            LOG.info("Payload type: {}", payLoadType+" and Hello World....");

            String path = workItem.getWorkflowData().getPayload().toString();
            LOG.info("Payload path: {}", path+" and Hello World....");
        }

    }


}
