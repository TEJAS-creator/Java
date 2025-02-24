interface Car {
    String getCarName();
    double getCarPrice();
}

class Tesla implements Car {
    @Override
    public String getCarName() {
        return "Tesla Model S";
    }
    
    @Override
    public double getCarPrice() {
        return 79999.99;
    }
}

class BMW implements Car {
    @Override
    public String getCarName() {
        return "BMW M3";
    }
    
    @Override
    public double getCarPrice() {
        return 70999.99;
    }
}

public class CarDetails {
    public static void main(String[] args) {
        Car tesla = new Tesla();
        Car bmw = new BMW();
        
        System.out.println("Car: " + tesla.getCarName() + ", Price: $" + tesla.getCarPrice());
        System.out.println("Car: " + bmw.getCarName() + ", Price: $" + bmw.getCarPrice());
    }
}
