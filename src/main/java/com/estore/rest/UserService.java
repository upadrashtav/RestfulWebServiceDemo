package com.estore.rest;

import java.util.Date;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/user")
public class UserService {
	  
           @GET
           @Produces(MediaType.TEXT_PLAIN)
           public String registerUserWithPlainResponse() {
                       String response = "[PLAIN TEXT] User Regsitered Successfully at "+new Date();
                       return response;
           }
          
           @GET
           @Produces(MediaType.TEXT_HTML)
           public String registerUserWithHTMLResponse() {
                       String response = "<html>"
                                               + "<body>"
                                               + "<h3>[HTML TEXT] User Regsitered Successfully at"+new Date()+"</h3>"
                                               + "</body>"
                                               + "</html>";
                       return response;
           }
          
           @GET
           @Produces(MediaType.TEXT_XML)
           public String registerUserWithXMLResponse() {
                       String response = "<?xml version='1.0' charset='UTF-8'?>"
                                               + "<response>[XML TEXT] User Regsitered Successfully at"+new Date()+"<response>";
                       return response;
           }
          
           @GET
           @Produces(MediaType.APPLICATION_JSON)
           public String registerUserWithJSONResponse() {
                       String response = "{"
                                               + "'resposne': '[JSON TEXT] User Regsitered Successfully at"+new Date()+"'"
                                               + "}";
                                               return response;
           }

}


