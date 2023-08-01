package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import model.Service;

public class ServiceService {
	 private static final String DB_URL = "jdbc:mysql://localhost:3306/vehicle";
	    private static final String DB_USER = "root";
	    private static final String DB_PASSWORD = "Yogaselvan_2004";

 private static final String SERVICE_TABLE = "services";
 private static final String COLUMN_ID = "id";
 private static final String COLUMN_FUEL_TYPE = "fuelType";
 private static final String COLUMN_FUEL_AMOUNT = "fuelAmount";
 private static final String COLUMN_SERVICE_TYPE = "serviceType";
 private static final String COLUMN_SERVICE_AMOUNT = "serviceAmount";
 private static final String COLUMN_SERVICE_DATE = "serviceDate";

 private Connection connection;

 public ServiceService() {
     try {
    	 Class.forName("com.mysql.cj.jdbc.Driver");
         connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
     } catch (SQLException e) {
         e.printStackTrace();
     } catch (ClassNotFoundException e) {
		e.printStackTrace();
     }
 

 public void add(Service service) {
     String query = "INSERT INTO " + SERVICE_TABLE + " (" + COLUMN_FUEL_TYPE + ", " + COLUMN_FUEL_AMOUNT + ", " +
             COLUMN_SERVICE_TYPE + ", " + COLUMN_SERVICE_AMOUNT + ", " + COLUMN_SERVICE_DATE +
             ") VALUES (?, ?, ?, ?, ?)";
     try (PreparedStatement pstmt = connection.prepareStatement(query)) {
         pstmt.setString(1, service.getFuelType());
         pstmt.setString(2, service.getFuelAmount());
         pstmt.setString(3, service.getServiceType());
         pstmt.setString(4, service.getServiceAmount());
         pstmt.setString(5, service.getServiceDate());

         pstmt.executeUpdate();
     } catch (SQLException e) {
         e.printStackTrace();
     }
 }

 public void update(int serviceId, Service service) {
     String query = "UPDATE " + SERVICE_TABLE + " SET " + COLUMN_FUEL_TYPE + " = ?, " +
             COLUMN_FUEL_AMOUNT + " = ?, " + COLUMN_SERVICE_TYPE + " = ?, " +
             COLUMN_SERVICE_AMOUNT + " = ?, " + COLUMN_SERVICE_DATE + " = ? WHERE " + COLUMN_ID + " = ?";
     try (PreparedStatement pstmt = connection.prepareStatement(query)) {
         pstmt.setString(1, service.getFuelType());
         pstmt.setString(2, service.getFuelAmount());
         pstmt.setString(3, service.getServiceType());
         pstmt.setString(4, service.getServiceAmount());
         pstmt.setString(5, service.getServiceDate());
         pstmt.setInt(6, service.getId());

         pstmt.executeUpdate();
     } catch (SQLException e) {
         e.printStackTrace();
     }
 }

 public void delete(int id) {
     String query = "DELETE FROM " + SERVICE_TABLE + " WHERE " + COLUMN_ID + " = ?";
     try (PreparedStatement pstmt = connection.prepareStatement(query)) {
         pstmt.setInt(1, id);

         pstmt.executeUpdate();
     } catch (SQLException e) {
         e.printStackTrace();
     }
 }

 public Service getById(int id) {
     String query = "SELECT * FROM " + SERVICE_TABLE + " WHERE " + COLUMN_ID + " = ?";
     try (PreparedStatement pstmt = connection.prepareStatement(query)) {
         pstmt.setInt(1, id);

         try (ResultSet resultSet = pstmt.executeQuery()) {
             if (resultSet.next()) {
                 Service service = new Service();
                 service.setId(resultSet.getInt(COLUMN_ID));
                 service.setFuelType(resultSet.getString(COLUMN_FUEL_TYPE));
                 service.setFuelAmount(resultSet.getString(COLUMN_FUEL_AMOUNT));
                 service.setServiceType(resultSet.getString(COLUMN_SERVICE_TYPE));
                 service.setServiceAmount(resultSet.getString(COLUMN_SERVICE_AMOUNT));
                 service.setServiceDate(resultSet.getString(COLUMN_SERVICE_DATE));
                 return service;
             }
         }
     } catch (SQLException e) {
         e.printStackTrace();
     }
     return null;
 }

 public void closeConnection() {
     try {
         if (connection != null && !connection.isClosed()) {
             connection.close();
         }
     } catch (SQLException e) {
         e.printStackTrace();
     }
 }
}
