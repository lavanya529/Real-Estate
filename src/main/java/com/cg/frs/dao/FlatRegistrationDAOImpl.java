package com.cg.frs.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.cg.frs.dto.FlatRegistrationDTO;

public class FlatRegistrationDAOImpl implements IFlatRegistrationDAO{
	int i;
	public FlatRegistrationDTO registerFlat(FlatRegistrationDTO flat_details) {
		FlatRegistrationDTO DTO= flat_details;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/realestate", "root","root");
			PreparedStatement preparedStatement = connection.prepareStatement(" insert into flat_registration values(?,?,?,?,?,?)");
			
			
			preparedStatement.setInt(1, DTO.getFlatRegNo());
			preparedStatement.setInt(2,DTO.getOwnerId());
			preparedStatement.setInt(3,DTO.getFlatType() );
			preparedStatement.setInt(4,DTO.getFlatArea());
			preparedStatement.setInt(5, DTO.getRent() );
			preparedStatement.setInt(6,DTO.getDeposite());
			
			
			 i = preparedStatement.executeUpdate();
			 
			 ResultSet resultSet = preparedStatement.executeQuery("select reg_no from Flat_registration");
			 while(resultSet.next()) {
					
					DTO.setFlatRegNo(resultSet.getInt(1));
				}
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return DTO;
	}

	public ArrayList<Integer> getAllOwnerIds() {
		ArrayList<Integer> id_no= new ArrayList<Integer>();
		
			
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/realestate", "root","root");
			Statement statement =  connection.createStatement();
			
			ResultSet resultSet = statement.executeQuery("select owner_id_no from Flat_Owners");
			
			while(resultSet.next()) {
				
				id_no.add(resultSet.getInt(1));
			}
			connection.close();
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		return id_no ;
	}

	
}
