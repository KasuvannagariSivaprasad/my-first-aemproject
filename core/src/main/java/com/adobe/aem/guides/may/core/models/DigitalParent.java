package com.adobe.aem.guides.may.core.models;

import java.util.List;



import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;

import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ScriptVariable;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import com.day.cq.wcm.api.Page;


@Model(adaptables ={Resource.class,SlingHttpServletRequest.class} , defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class DigitalParent {

    @ValueMapValue
    private String text;

    @ValueMapValue
    private String des;

    @ValueMapValue
    private int num;

    @ValueMapValue
    private String color;

    // @ScriptVariable
    // Page currentPage;//When taking Page you have verify the package com.day.cq.wcm.api.Page We have to use same variable names

    // public String getArticlePageName(){//here we can give any method name
    //     return currentPage.getName(); //here we should use same as predefined method name
    // }

    // public String getArticlePageTitle(){
    //     return currentPage.getPageTitle();
    // }
    // public String getArticlePagePath(){
    //     return currentPage.getPath();
    // }
    // public Page getArticleParentPage(){
    //     return currentPage.getParent();
    // }

    // @Inject
    // ResourceResolver resolver;

    // public String getWebContentNode(){
    //     return resolver.getUserID();
    // }



    @ChildResource
    public List<DigitalChild> bookdetailswithmap;

    public String getText() {
        return text;
    }

    public String getDes() {
        return des;
    }

    public int getNum() {
        return num;
    }

    public String getColor() {
        return color;
    }

    public List<DigitalChild> getBookdetailswithmap() {
        return bookdetailswithmap;
    }

}
