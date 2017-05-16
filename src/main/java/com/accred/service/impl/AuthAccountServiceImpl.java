package com.accred.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.accred.logic.AuthAccountLs;
import com.accred.model.AuthAccount;
import com.accred.service.AuthAccountService;

@Service("authAccountService")
public class AuthAccountServiceImpl implements AuthAccountService{

	@Resource
	private AuthAccountLs authaccountLs;
	
	@Override
	public List<AuthAccount> getList() throws Exception {
		// TODO Auto-generated method stub
		return authaccountLs.selectAll();
	}

	@Override
	public void insert(AuthAccount authAccount) throws Exception {
		// TODO Auto-generated method stub
		authaccountLs.insert(authAccount);
	}

}
