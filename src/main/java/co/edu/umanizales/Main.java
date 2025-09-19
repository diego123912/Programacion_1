package co.edu.umanizales;

public class Main{
    public static void main(String[] args) {
    // Clase base Vehicle
    static class Vehicle {
        private int code;
        private String description;

        public Vehicle(int code, String description) {
            this.code = code;
            this.description = description;
        }

        public int getCode() { return code; }
        public String getDescription() { return description; }
        public void setCode(int code) { this.code = code; }
        public void setDescription(String description) { this.description = description; }
    }

    // Clase Car
    static class Car extends Vehicle {
        private String brand;
        private String model;
        private String color;
        private int year;

        public Car(int code, String description, String brand, String model, String color, int year) {
            super(code, description);
            this.brand = brand;
            this.model = model;
            this.color = color;
            this.year = year;
        }

        public String getBrand() { return brand; }
        public void setBrand(String brand) { this.brand = brand; }
        public String getModel() { return model; }
        public void setModel(String model) { this.model = model; }
        public String getColor() { return color; }
        public void setColor(String color) { this.color = color; }
        public int getYear() { return year; }
        public void setYear(int year) { this.year = year; }
    }

    // Clase Motorcycle
    static class Motorcycle extends Vehicle {
        private String brand;
        private String model;
        private String color;
        private int engineSize;

        public Motorcycle(int code, String description, String brand, String model, String color, int engineSize) {
            super(code, description);
            this.brand = brand;
            this.model = model;
            this.color = color;
            this.engineSize = engineSize;
        }

        public String getBrand() { return brand; }
        public void setBrand(String brand) { this.brand = brand; }
        public String getModel() { return model; }
        public void setModel(String model) { this.model = model; }
        public String getColor() { return color; }
        public void setColor(String color) { this.color = color; }
        public int getEngineSize() { return engineSize; }
        public void setEngineSize(int engineSize) { this.engineSize = engineSize; }
    }

    // Clase ElectricSkateboard
    static class ElectricSkateboard extends Vehicle {
        private String brand;
        private String color;

        public ElectricSkateboard(int code, String description, String brand, String color) {
            super(code, description);
            this.brand = brand;
            this.color = color;
        }

        public String getBrand() { return brand; }
        public void setBrand(String brand) { this.brand = brand; }
        public String getColor() { return color; }
        public void setColor(String color) { this.color = color; }
    }
    

    public static void main(String[] args) {
        // Crear instancias de los vehículos
        Car cars = new Car(1, "Automóvil familiar", "Toyota", "Corolla", "Azul", 2022);
        Motorcycle Motorcycles = new Motorcycle(2, "Moto deportiva", "Yamaha", "R1", "Rojo", 1000);
        ElectricSkateboard ElectricSkateboards = new ElectricSkateboard(3, "Patineta eléctrica", "Xiaomi", "Negro");
        //esta parte cambia el color de los objetos
        Motorcycles.setColor("Verde");
        cars.setColor("Penesgrande");
        ElectricSkateboards.setColor("Azul");

        System.out.println("Carro: " + cars.getBrand() + " modelo " + cars.getModel() + " año" + cars.getYear() + " Color: " + cars.getColor());
        System.out.println("Moto: " + Motorcycles.getBrand() + " " + Motorcycles.getModel() + "Cilindraje" + Motorcycles.getEngineSize() + "Color: " + Motorcycles.getColor());
        System.out.println("Patineta: " + ElectricSkateboards.getBrand() + "Color: " + ElectricSkateboards.getColor());

        Vehicle[] vehicles = { cars, Motorcycles, ElectricSkateboards };
        for (Vehicle vehicle : vehicles) {
            System.out.println("Vehículo: " + vehicle.getDescription() + " (Código: " + vehicle.getCode());
        }
    }
}
 