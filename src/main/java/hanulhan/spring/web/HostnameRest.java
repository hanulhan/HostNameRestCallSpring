/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hanulhan.spring.web;

import java.net.InetAddress;
import javax.ws.rs.core.Context;
import javax.ws.rs.Path;
import javax.ws.rs.GET;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/**
 * REST Web Service
 *
 * @author uhansen
 */
@Component
@Path("/rest/hostname")
public class HostnameRest implements ApplicationContextAware {

    private static final Logger LOGGER = Logger.getLogger(HostnameRest.class);

    private ApplicationContext applicationContext;

    @Context
    HttpServletResponse resp;


    public HostnameRest() {
    }


    @GET
    @Produces({MediaType.TEXT_PLAIN})
    public String getHostname() {

        try {
             String result = InetAddress.getLocalHost().getHostName();
                        
            return result;
        } catch (Exception e) {
            LOGGER.log(Level.ERROR, "Can't process /rest/Hostname/" + e);
            return null;
        }

    }

    @Override
    public void setApplicationContext(ApplicationContext ac) throws BeansException {
        this.applicationContext = ac;
    }

}
