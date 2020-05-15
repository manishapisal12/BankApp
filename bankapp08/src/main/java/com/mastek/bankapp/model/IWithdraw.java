package com.mastek.bankapp.model;

import com.mastek.bankapp.model.util.MaintainMinBalException;

public interface IWithdraw {

	String withdraw(double amount) throws Exception;
}
