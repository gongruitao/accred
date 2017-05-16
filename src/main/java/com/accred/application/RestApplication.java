package com.accred.application;

import org.codehaus.jackson.jaxrs.JacksonJsonProvider;
import org.glassfish.jersey.filter.LoggingFilter;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.web.filter.RequestContextFilter;

import com.accred.rest.AuthAccountRest;

public class RestApplication extends ResourceConfig{

	public RestApplication(){
		register(RequestContextFilter.class);
		register(JacksonJsonProvider.class);
		register(LoggingFilter.class);
		
		register(AuthAccountRest.class);
		
	}
}
