package com.cg.frs.dto;

import java.util.Random;

public class FlatRegistrationDTO {

	private int flatRegNo;
	private int ownerId;
	private int flatType;
	private int flatArea;
	private int Rent;
	private int deposite;
	 
	 
	
	public FlatRegistrationDTO() {
		
	}
	public void registration(int flatRegNo,int ownerId, int flatType,int flatArea, int Rent, int deposite) {
		this.flatRegNo=flatRegNo;
		this.ownerId=ownerId;
		this.flatType=flatType;
		this.flatArea=flatArea;
		this.Rent=Rent;
		this.deposite=deposite;
	}
	public int getFlatRegNo() {
		return flatRegNo;
	}
	public void setFlatRegNo(int i) {
		this.flatRegNo = i;
	}
	public int getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}
	public int getFlatType() {
		return flatType;
	}
	public void setFlatType(int flatType) {
		this.flatType = flatType;
	}
	public int getFlatArea() {
		return flatArea;
	}
	public void setFlatArea(int flatArea) {
		this.flatArea = flatArea;
	}
	public int getRent() {
		return Rent;
	}
	public void setRent(int rent) {
		Rent = rent;
	}
	public int getDeposite() {
		return deposite;
	}
	public void setDeposite(int deposite) {
		this.deposite = deposite;
	}
	
}
