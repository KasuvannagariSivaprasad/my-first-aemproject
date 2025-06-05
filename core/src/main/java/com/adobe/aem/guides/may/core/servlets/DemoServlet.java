package com.adobe.aem.guides.may.core.servlets;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.apache.sling.servlets.annotations.SlingServletPaths;
import org.apache.sling.servlets.annotations.SlingServletResourceTypes;
import org.osgi.service.component.annotations.Component;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import java.io.IOException;

@Component(service = { Servlet.class })
@SlingServletResourceTypes(
        resourceTypes  ="siva/prasad/developer"
)

public class DemoServlet extends SlingAllMethodsServlet {

    @Override
    protected void doGet( SlingHttpServletRequest req, SlingHttpServletResponse resp) throws ServletException, IOException {

        resp.getWriter().write(" Hello! Siva Prasad from Get()");
    }

    @Override
    protected void doPost( SlingHttpServletRequest req, SlingHttpServletResponse resp) throws ServletException, IOException {

        resp.getWriter().write(" Hello! Siva Prasad from Post()");
    }

    @Override
    protected void doPut( SlingHttpServletRequest req, SlingHttpServletResponse resp) throws ServletException, IOException {

        resp.getWriter().write(" Hello! Siva Prasad from Put()");
    }

    @Override
    protected void doDelete( SlingHttpServletRequest req, SlingHttpServletResponse resp) throws ServletException, IOException {

        resp.getWriter().write(" Hello! Siva Prasad from Delete()");
    }
}