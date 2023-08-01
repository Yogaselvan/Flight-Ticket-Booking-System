package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import model.Driver;

public class DriverService {
	 private static final String DB_URL = "jdbc:mysql://localhost:3306/vehicle";
	    private static final String DB_USER = "root";
	    private static final String DB_PASSWORD = "Yogaselvan_2004";

	    private static final String DRIVER_TABLE = "drivers";
	    private static final String COLUMN_ID = "id";
	    private static final String COLUMN_NAME = "name";
	    private static final String COLUMN_ADDRESS = "address";
	    private static final String COLUMN_MOBILE = "mobile";
	    private static final String COLUMN_LICENSE = "license";

	    private Connection connection;

	    public DriverService() {
	        try {
	            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    public void add(Driver driver) {
	        String query = "INSERT INTO " + DRIVER_TABLE + " (" + COLUMN_ID + ", " + COLUMN_NAME + ", " +
	                COLUMN_ADDRESS + ", " + COLUMN_MOBILE + ", " + COLUMN_LICENSE + ") VALUES (?, ?, ?, ?, ?)";
	        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
	            pstmt.setInt(1, driver.getId());
	            pstmt.setString(2, driver.getName());
	            pstmt.setString(3, driver.getAddress());
	            pstmt.setString(4, driver.getMobile());
	            pstmt.setString(5, driver.getLicense());

	            pstmt.executeUpdate();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    public void update(Driver driver) {
	        String query = "UPDATE " + DRIVER_TABLE + " SET " + COLUMN_NAME + " = ?, " +
	                COLUMN_ADDRESS + " = ?, " + COLUMN_MOBILE + " = ?, " + COLUMN_LICENSE + " = ? WHERE " + COLUMN_ID + " = ?";
	        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
	            pstmt.setString(1, driver.getName());
	            pstmt.setString(2, driver.getAddress());
	            pstmt.setString(3, driver.getMobile());
	            pstmt.setString(4, driver.getLicense());
	            pstmt.setInt(5, driver.getId());

	            pstmt.executeUpdate();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    public void delete(int id) {
	        String query = "DELETE FROM " + DRIVER_TABLE + " WHERE " + COLUMN_ID + " = ?";
	        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
	            pstmt.setInt(1, id);

	            pstmt.executeUpdate();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    public Driver getById(int id) {
	        String query = "SELECT * FROM " + DRIVER_TABLE + " WHERE " + COLUMN_ID + " = ?";
	        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
	            pstmt.setInt(1, id);

	            try (ResultSet resultSet = pstmt.executeQuery()) {
	                if (resultSet.next()) {
	                    Driver driver = new Driver();
	                    driver.setId(resultSet.getInt(COLUMN_ID));
	                    driver.setName(resultSet.getString(COLUMN_NAME));
	                    driver.setAddress(resultSet.getString(COLUMN_ADDRESS));
	                    driver.setMobile(resultSet.getString(COLUMN_MOBILE));
	                    driver.setLicense(resultSet.getString(COLUMN_LICENSE));
	                    return driver;
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
