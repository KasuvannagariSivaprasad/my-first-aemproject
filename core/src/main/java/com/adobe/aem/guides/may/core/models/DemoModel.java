package com.adobe.aem.guides.may.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class DemoModel implements Demo{

    @ValueMapValue
    private String text;

    @ValueMapValue
    private String des;

    @ValueMapValue
    private int num;

    @ValueMapValue
    private String color;

    public String getArticleText() {
        return text;
    }

    public String getArticleDes() {
        return des;
    }

    public int getArticleNum() {
        return num;
    }

    public String getArticleColor() {
        return color;
    }
}
