package Homework6;

public class Notebook {
    private String brand;
    private String model;
    private String color;
    private double screenSize;
    private int ram;
    private int hdd;
    private String os;

    public Notebook(String brand, String model, String color, double screenSize, int ram, int hdd, String os) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.screenSize = screenSize;
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
    }
    public String printInfo(){
        System.out.printf("Brand: %s, Model: %s, Color: %s, ScreenSize: %s, RAM: %s, sizeDisk: %d, OS: %s", brand, model, color, screenSize, ram, hdd, os);
        return ".";
    }
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public String getColor() {
        return getColor(null);
    }

    public String getColor(String requestUserForSearch) {
        return color;
    }

    public int getRam() {
        return ram;
    }

    public int gethdd() {
        return hdd;
    }

    public String getOs() {
        return os;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void sethdd(int hdd) {
        this.hdd = hdd;
    }

    public void setOs(String os) {
        this.os = os;
    }

}
