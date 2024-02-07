package com.estore.test;

import java.net.URI;

import org.glassfish.jersey.client.ClientConfig;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.UriBuilder;

public class TestClient {

          
          WebTarget target;
         
          public TestClient() {
                      ClientConfig configuration = new ClientConfig();
                      Client client = ClientBuilder.newClient(configuration);
                      URI uri = UriBuilder.fromUri("http://localhost:8080/RestfulWebServiceDemo").build();
                      target = client.target(uri);
          }
         
          public String getPlainResponse() {
                      String response = target.path("rest").path("user").request().accept(MediaType.TEXT_PLAIN).get(String.class);
                      return response;
          }
         
          public String getHTMLResponse() {
                      String response = target.path("rest").path("user").request().accept(MediaType.TEXT_HTML).get(String.class);
                      return response;
          }
         
          public String getXMLResponse() {
                      String response = target.path("rest").path("user").request().accept(MediaType.TEXT_XML).get(String.class);
                      return response;
          }
         
          public String getJSONResponse() {
                      String response = target.path("rest").path("user").request().accept(MediaType.APPLICATION_JSON).get(String.class);
                      return response;
          }

}
