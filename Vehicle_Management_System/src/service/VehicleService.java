package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import model.Vehicle;

public class VehicleService {
	 private static final String DB_URL = "jdbc:mysql://localhost:3306/vehicle";
	 private static final String DB_USER = "root";
	 private static final String DB_PASSWORD = "Yogaselvan_2004";
     private static final String VEHICLE_TABLE = "vehicles";
     private static final String COLUMN_ID = "id";
     private static final String COLUMN_REGISTRATION_NUMBER = "number_plate";
     private static final String COLUMN_TYPE = "model";
     private static final String COLUMN_YEAR = "year";
     private Connection connection;

 public VehicleService() {
     try {
    	 Class.forName("com.mysql.cj.jdbc.Driver");
         connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
     } catch (SQLException e) {
         e.printStackTrace();
     } catch (ClassNotFoundException e) {
		e.printStackTrace();
     }
 
 public void delete(int id) {
     String query = "DELETE FROM " + VEHICLE_TABLE + " WHERE " + COLUMN_ID + " = ?";
     try (PreparedStatement pstmt = connection.prepareStatement(query)) {
         pstmt.setInt(1, id);

         pstmt.executeUpdate();
     } catch (SQLException e) {
         e.printStackTrace();
     }
 }
 public Vehicle getById(int id) {
     String query = "SELECT * FROM " + VEHICLE_TABLE + " WHERE " + COLUMN_ID + " = ?";
     try (PreparedStatement pstmt = connection.prepareStatement(query)) {
         pstmt.setInt(1, id);
         ResultSet resultSet = pstmt.executeQuery();

         if (resultSet.next()) {
             String number_plate = resultSet.getString(COLUMN_REGISTRATION_NUMBER);
             String model = resultSet.getString(COLUMN_TYPE);
             int year = resultSet.getInt(COLUMN_YEAR);

             return new Vehicle(number_plate,id,model, year);
         }
     } catch (SQLException e) {
         e.printStackTrace();
     }
     return null;
 }
 public void closeConnection() {
     try {
         if (connection != null) {
             connection.close();
         }
     } catch (SQLException e) {
         e.printStackTrace();
     }
 }
	public void add(Vehicle vehicle) {
		 String query = "INSERT INTO " + VEHICLE_TABLE + " (" + COLUMN_ID + ", " + COLUMN_REGISTRATION_NUMBER + ", " +
	                COLUMN_TYPE + ", " + COLUMN_YEAR + ") VALUES (?, ?, ?, ?)";
	        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
	            pstmt.setInt(1, vehicle.getId());
	            pstmt.setString(2, vehicle. getNumberPlate());
	            pstmt.setString(3, vehicle.getModel());
	            pstmt.setInt(4, vehicle.getYear());

	            pstmt.executeUpdate();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
		
	}
	public void update(Vehicle vehicle) {
		 String query = "UPDATE " + VEHICLE_TABLE + " SET " + COLUMN_REGISTRATION_NUMBER + " = ?, " + COLUMN_TYPE + " = ?, " +
	                COLUMN_YEAR + " = ? WHERE " + COLUMN_ID + " = ?";
	        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
	            pstmt.setString(1, vehicle.getNumberPlate());
	            pstmt.setString(2, vehicle.getModel());
	            pstmt.setInt(3, vehicle.getYear());
	            pstmt.setInt(4, vehicle.getId());

	            pstmt.executeUpdate();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
		
	}
}
