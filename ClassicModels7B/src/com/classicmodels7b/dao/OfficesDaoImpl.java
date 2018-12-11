/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classicmodels7b.dao;

import com.classicmodels7b.model.OfficesModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Luis
 */
public class OfficesDaoImpl implements OfficesDao{
    Conexion con= new Conexion();

    @Override
    public String createOffice(OfficesModel newOffice) {
        String serverAnswer = null;
        try {
            PreparedStatement preparedStatement= con.getConnection().prepareStatement("INSERT INTO offices(officeCode,city, phone,addressLine1,addressLine2,state,country,postalCode,territory) VALUES(?,?,?,?,?,?,?,?,?)");
            
            preparedStatement.setString(1, newOffice.getOfficeCode());
            preparedStatement.setString(2, newOffice.getCity());
            preparedStatement.setString(3, newOffice.getPhone());
            preparedStatement.setString(4, newOffice.getAddressLIne1());
            preparedStatement.setString(5, newOffice.getAddressLIne2());
            preparedStatement.setString(6, newOffice.getState());
            preparedStatement.setString(7, newOffice.getCountry());
            preparedStatement.setString(8, newOffice.getPostalCode());
            preparedStatement.setString(9, newOffice.getTerritory());
            
            int numAffectedRows = preparedStatement.executeUpdate();
            
            if(numAffectedRows>0){
               serverAnswer = "The office was inserted";  
            }
              
        } catch (SQLException e) {
            System.out.println("ERROR" + e.getMessage());
            serverAnswer = "There was an error";
        }
        return serverAnswer;
    }

    @Override
    public ArrayList<OfficesModel> readOffices() {
        ArrayList<OfficesModel> officesList= new ArrayList();
        OfficesModel auxOffice;
        
        try{
            PreparedStatement prepareStatement = con.getConnection().prepareStatement("SELECT * FROM offices");
            
            ResultSet resultSet= prepareStatement.executeQuery();//resultSet guarda los 9 datos de la tabla
            
            while(resultSet.next()){
                auxOffice= new OfficesModel();
                auxOffice.setOfficeCode(resultSet.getString(1));
                auxOffice.setCity(resultSet.getString(2));
                auxOffice.setPhone(resultSet.getString(3));
                auxOffice.setAddressLIne1(resultSet.getString(4));
                auxOffice.setAddressLIne2(resultSet.getString(5));
                auxOffice.setState(resultSet.getString(6));
                auxOffice.setCountry(resultSet.getString(7));
                auxOffice.setPostalCode(resultSet.getString(8));
                auxOffice.setTerritory(resultSet.getString(9));
                
                officesList.add(auxOffice);
            }
        
        }catch(SQLException e){
            System.err.println("ERROR"+ e.getMessage()); 
        }
        
        return officesList;
    }

    @Override
    public String updateOffice(OfficesModel auxOffice) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String delateOffice(String officeCode) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String deleteOffice(String OfficeCode){
        String serverAnswer = null;
        
        try{
        PreparedStatement prepareStatement = con.getConnection().prepareStatement("DELETE from offices where OfficeCode = " + OfficeCode);
        
        int numAffectedRows = prepareStatement.executeUpdate();
        
        if(numAffectedRows>0){
            serverAnswer="La oficina fue borrada";
        }
    } catch(SQLException e){
            System.out.println("ERROR"+ e.getMessage());
            serverAnswer="There was an error";   
    }
    return serverAnswer;
    
    
}
}