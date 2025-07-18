package org.example;

public class Mobile {
    // 10 variables
    private  String brand;
    private  String model;
    private  int price;
    private  int batteryCapacity;
    private double screenSize;
    private boolean is5G;
    private  String color;
    private  int cameraMP;
    private  String processor;
    private int ram;

    // Default constructor
    public Mobile() {
        brand = "Unkown";
        model = "Unkown";
        price = 0;
        batteryCapacity = 0;
        screenSize = 0.0;
        is5G = false;
        color = "Black";
        cameraMP = 0;
        processor = "Generic";
        ram = 0;
    }
    //parametarized constructor
    public Mobile(String brand, String model, int price,
                  int batteryCapacity, double screenSize, boolean is5G,
                  String  color, int cameraMP, String processor, int ram){
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.batteryCapacity = batteryCapacity;
        this.screenSize = screenSize;
        this.is5G = is5G;
        this.color = color;
        this.cameraMP = cameraMP;
        this.processor = processor;
        this.ram = ram;
    }
    //Copy constructor
    public Mobile(Mobile other){
        this.brand = other.brand;
        this.model = other.model;
        this.price = other.price;
        this.batteryCapacity = other.batteryCapacity;
        this.screenSize = other.screenSize;
        this.is5G = other.is5G;
        this.color = other.color;
        this.cameraMP = other.cameraMP;
        this.processor = other.processor;
        this.ram = other.ram;

    }
    // methods
    //public methods
    public void displySpecs(){
        System.out.println(("Brand: "+ brand));
        System.out.println(("Model:" + model));
        System.out.println("Price: $" + price);
        System.out.println("Battery: " + batteryCapacity + "mAh");
        System.out.println("Screen: " + screenSize + "inches");
        System.out.println("5G: " + (is5G ? "Yes":"No"));
        System.out.println("Color: " + color);
        System.out.println("Camera: " + cameraMP + "MP");
        System.out.println("Processor: " + processor);
        System.out.println("RAM:" + ram + "GB");
    }
    //private method
    private void secretFeature(){
        System.out.println("This mobile has a hidden developer mode!");
    }
    //protected method
    protected  void chargingInfo(){
        System.out.println("Supports fast chargings up to 65W.");
    }
    //Default (package-private) method
    void connectToEiFi(){
        System.out.println("connecting to wifi....");
    }
    // public method to trigger private method internally
    public void showSecretFeature(){
        secretFeature();//calling private method inside the class
    }
    // main method test
    public static void main(String[] args){
        // using default constructor
        Mobile m1 = new Mobile();
        m1.displySpecs();
        //using parameterized constructor
        Mobile m2 = new Mobile("Samsung", "Galaxy s24", 999, 5000, 6.7, true,
                "Silver", 108, "Snapdaragon 8 Gen 3", 12);
        m2.displySpecs();
        //using copy constructor
        Mobile m3 = new Mobile(m2);

        //using all methods
         m2.connectToEiFi();      //default method
         m2.chargingInfo();       // protected method
         m2.showSecretFeature();  //calla private method internally
    }



}
