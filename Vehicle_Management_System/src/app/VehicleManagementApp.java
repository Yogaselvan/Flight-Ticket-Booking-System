package app;

import java.util.Scanner;
import java.util.InputMismatchException;
import model.Driver;
import model.Service;
import model.Vehicle;
import service.DriverService;
import service.ServiceService;
import service.VehicleService;

public class VehicleManagementApp {
    private static VehicleService vehicleService = new VehicleService();
    private static DriverService driverService = new DriverService();
    private static ServiceService serviceService = new ServiceService();

    public static void main(String[] args) {
        // Sample data initialization
        initializeData();
        String green = "\u001B[32m";
        String reset = "\u001B[0m";

        // Rest of the main application code
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println(green + "\n=========================   Vehicle Management System        ==========================" + reset);
            System.out.println("1. Add Vehicle ");
            System.out.println("2. View Vehicles");
            System.out.println("3. Update Vehicles");
            System.out.println("4. Delete Vehicles");
            System.out.println("------------------------------------------");
            System.out.println("5. Add Driver");
            System.out.println("6. View Drivers");
            System.out.println("7. Update Driver");
            System.out.println("8. Delete Driver");
            System.out.println("------------------------------------------");
            System.out.println("9. Add Service to the vehicles...");
            System.out.println("10. View Service to the vehicles...");
            System.out.println("11. update Service to the vehicles...");
            System.out.println("12. Delete Service to the vehicles...");
            System.out.println("13. Exit your choices....");
            System.out.print("Enter your choice (1-13): ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
            case 1:
                addVehicleDetails();
                break;
            case 2:
            	 getVehicleById();
                break;
            case 3:
                updateVehicleDetailsById();
                break;
            case 4:
                deleteVehicleById();
                break;
            case 5:
                addDriverDetails();
                break;
            case 6:
            	 getDriverById();
                break;
            case 7:
                updateDriverDetailsById();
                break;
            case 8:
                deleteDriverById();
                break;
            case 9:
                addServiceDetails();
                break;
            case 10:
            	 getServiceById();
                break;
            case 11:
                updateServiceDetailsById();
                break;
            case 12:
                deleteServiceById();
                break;
            
            case 13:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
        } while (choice != 13);
    }

    // Sample data initialization
    private static void initializeData() {
        // You can initialize some sample data here if needed
    }

    private static void addVehicleDetails() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter registration number: ");
            String number_plate = scanner.nextLine();
            System.out.print("Enter id: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter model: ");
            String model = scanner.nextLine();
            System.out.print("Enter year: ");
            int year = scanner.nextInt();
            scanner.nextLine();

            Vehicle newVehicle = new Vehicle(number_plate, id, model, year);

            vehicleService.add(newVehicle);
            System.out.println("Vehicle details added successfully!");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter valid data.");
        }
    }

    private static void getVehicleById() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter vehicle ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Vehicle vehicle = vehicleService.getById(id);

        if (vehicle != null) {
            System.out.println("\n====== Vehicle Details ======");
            System.out.println(vehicle);
        } else {
            System.out.println("Vehicle with ID " + id + " not found.");
        }
    }

    private static void updateVehicleDetailsById() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter vehicle ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter new model: ");
        String model = scanner.nextLine();
        System.out.print("Enter new year: ");
        int year = scanner.nextInt();
        scanner.nextLine();

        Vehicle updatedVehicle = new Vehicle(null, id, model, year);
        vehicleService.update(updatedVehicle);
        System.out.println("Vehicle details updated successfully!");
    }

    private static void deleteVehicleById() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter vehicle ID to delete: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        vehicleService.delete(id);
        System.out.println("Vehicle details with ID " + id + " deleted successfully!");
    }

    private static void addDriverDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter driver ID: ");
        int id = Integer.parseInt(scanner.next());

        System.out.print("Enter driver name: ");
        String name = scanner.next();
        scanner.nextLine();
        System.out.print("Enter driver address: ");
        String address = scanner.nextLine();
        System.out.print("Enter driver mobile: ");
        String mobile = scanner.nextLine();
        System.out.print("Enter driver license: ");
        String license = scanner.nextLine();

        Driver newDriver = new Driver(id, name, address, mobile, license);
        driverService.add(newDriver);
        System.out.println("Driver details added successfully!");
    }

    private static void getDriverById() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter driver ID: ");
        int id = Integer.parseInt(scanner.next());
        scanner.nextLine();

        Driver driver = driverService.getById(id);

        if (driver != null) {
            System.out.println("\n====== Driver Details ======");
            System.out.println(driver);
        } else {
            System.out.println("Driver with ID " + id + " not found.");
        }
    }


    private static void updateDriverDetailsById() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Driver ID: ");
        int id = Integer.parseInt(scanner.next());

        System.out.print("Enter new name: ");
        String name = scanner.next();
        scanner.nextLine();
        System.out.print("Enter new address: ");
        String address = scanner.nextLine();
        System.out.print("Enter new mobile: ");
        String mobile = scanner.nextLine();
        System.out.print("Enter new license: ");
        String license = scanner.nextLine();

        Driver updatedDriver = new Driver(id, name, address, mobile, license);
        driverService.update(updatedDriver);
        System.out.println("Driver details updated successfully!");
    }

    private static void deleteDriverById() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter driver ID to delete: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        driverService.delete(id);
        System.out.println("Driver details with ID " + id + " deleted successfully!");
    }

    private static void addServiceDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter vehicle ID: ");
        int vehicleId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter fuel type: ");
        String fuelType = scanner.nextLine();
        System.out.print("Enter fuel amount: ");
        String fuelAmount = scanner.nextLine();
        System.out.print("Enter service type: ");
        String serviceType = scanner.nextLine();
        System.out.print("Enter service amount: ");
        String serviceAmount = scanner.nextLine();
        System.out.print("Enter service date: ");
        String serviceDate = scanner.nextLine();

        Service newService = new Service(vehicleId, fuelType, fuelAmount, serviceType, serviceAmount, serviceDate);
        serviceService.add(newService);
        System.out.println("Service details added successfully!");
    }

    private static void getServiceById() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter service ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Service service = serviceService.getById(id);

        if (service != null) {
            System.out.println("\n====== Service Details ======");
            System.out.println(service);
        } else {
            System.out.println("Service with ID " + id + " not found.");
        }
    }

    private static void updateServiceDetailsById() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter service ID: ");
        int serviceId = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter vehicle ID: ");
        int vehicleId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter new fuel type: ");
        String fuelType = scanner.nextLine();
        System.out.print("Enter new fuel amount: ");
        String fuelAmount = scanner.nextLine();
        System.out.print("Enter new service type: ");
        String serviceType = scanner.nextLine();
        System.out.print("Enter new service amount: ");
        String serviceAmount = scanner.nextLine();
        System.out.print("Enter new service date: ");
        String serviceDate = scanner.nextLine();

        Service updatedService = new Service(vehicleId, fuelType, fuelAmount, serviceType, serviceAmount, serviceDate);
        serviceService.update(serviceId, updatedService);
        System.out.println("Service details with ID " + serviceId + " updated successfully!");
    }

    private static void deleteServiceById() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter service ID to delete: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        serviceService.delete(id);
        System.out.println("Service with ID " + id + " deleted successfully!");
    }
}