package com.accred.logic;


import java.util.List;

import com.accred.model.AuthAccount;

public interface AuthAccountLs {
	void insert(AuthAccount authAccount);
	
	List<AuthAccount> selectAll();
}
