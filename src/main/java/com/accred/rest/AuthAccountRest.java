package com.accred.rest;

import java.util.List;

import javax.annotation.Resource;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.accred.application.ContentType;
import com.accred.model.AuthAccount;
import com.accred.service.AuthAccountService;

import net.sf.json.JSONArray;

@Component
@Path("/auth")
public class AuthAccountRest {
	
	private Logger logger = Logger.getLogger(AuthAccountRest.class);
	
	@Resource
	private AuthAccountService authAccountService;
	
	@GET
	@Path("/list")
	@Produces(ContentType.APPLICATION_JSON_UTF_8)
	public List<AuthAccount> getAuthAccountList(){
		logger.info("query auth account dat info.");
		try {
			List<AuthAccount>  authList = authAccountService.getList();
			return authList;
		} catch (Exception e) {
			logger.error("query auth account data info error:" + e.getMessage());
			//throw new Exception(e.getMessage());
			return null;
		}
	}
}
