package com.cg.frs.ui;

import java.util.ArrayList;
import java.util.Scanner;

import com.cg.frs.dao.FlatRegistrationDAOImpl;
import com.cg.frs.dto.FlatRegistrationDTO;
import com.cg.frs.service.FlatRegistrationServiceImpl;
import com.cg.frs.service.IFlatRegistrationService;

public class Client {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		FlatRegistrationDTO register= new FlatRegistrationDTO();
		IFlatRegistrationService registerImpl =new FlatRegistrationServiceImpl();
		System.out.println("Enter your choice 1.Register Flat 2.Exit");
		int ch = sc. nextInt();
		switch (ch) {
		case 1:
			
			System.out.println("enter your details");
			ArrayList<Integer> a = registerImpl.getAllOwnerIds();
			System.out.println("owner id's:"+ registerImpl.getAllOwnerIds());
			System.out.println("enter your owner id from the above list");
			int id=sc.nextInt();
			if(!a.contains(id)) {
		      System.out.println("owner doesn't exist");
			}else {
				register.setOwnerId(id);
				System.out.println("select flat type 1. 1BHK 2. 2BHK");
				int flatType=sc.nextInt();
					if(flatType==1||flatType==2) {
						register.setFlatType(flatType);
						System.out.println("enter flat area");
						int flatArea=sc.nextInt();
						register.setFlatArea(flatArea);
						System.out.println("enter desired rent amount");
						int rent=sc.nextInt();
						register.setRent(rent);
						System.out.println("enter desired deposite amount");
						int deposite=sc.nextInt();
						
						if(deposite>rent) {
							register.setDeposite(deposite);
							register=registerImpl.registerFlat(register);
							System.out.println("Flat registered. registration id:"+ register.getFlatRegNo());	
						}
						else {
							System.out.println("enter valid deposite");	
						}
						
					}else {
						System.out.println("enter valid input");
					}
				
			}
			break;
		case 2:
			System.out.println("Thank you");
			
			break;

		default:
			System.out.println("Enter valid input");
			break;
		}

	}

	

}
