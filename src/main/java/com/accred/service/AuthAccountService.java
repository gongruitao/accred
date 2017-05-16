package com.accred.service;

import java.util.List;

import com.accred.model.AuthAccount;

public interface AuthAccountService {
	
	List<AuthAccount> getList()throws Exception;
	
	void insert(AuthAccount authAccount)throws Exception;
}
