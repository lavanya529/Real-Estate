package com.cg.frs.service;

import java.util.ArrayList;

import com.cg.frs.dao.FlatRegistrationDAOImpl;
import com.cg.frs.dao.IFlatRegistrationDAO;
import com.cg.frs.dto.FlatRegistrationDTO;

public class FlatRegistrationServiceImpl implements IFlatRegistrationService{
	IFlatRegistrationDAO dao= new FlatRegistrationDAOImpl();
	public FlatRegistrationDTO registerFlat(FlatRegistrationDTO flat) {
		
		
		return dao.registerFlat(flat);
	}

	public ArrayList<Integer> getAllOwnerIds() {
		
		
		return dao.getAllOwnerIds();
	}

}
