public class Car {
    private String color;
    private String model;
    private double motor;
    private int doorNumber;
    private int generatingDate;
    private String Brand;

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public double getMotor() {
        return motor;
    }

    public int getDoorNumber() {
        return doorNumber;
    }

    public int getGeneratingDate() {
        return generatingDate;
    }

    public String getBrand() {
        return Brand;
    }


    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    public void setDoorNumber(int doorNumber) {
        if (doorNumber == 2 || doorNumber == 4 ){
            this.doorNumber = doorNumber;
        }
        else{
            System.out.println("The door number dont change");
        }
    }

    public void setGeneratingDate(int generatingDate) {
        this.generatingDate = generatingDate;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }
}
