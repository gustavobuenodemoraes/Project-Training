package br.com.training.util;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("api")
public class TrainingResourceConfig extends ResourceConfig{
	public TrainingResourceConfig(){
		packages("br.com.training.service");
	}
}
