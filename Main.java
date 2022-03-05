import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Car car = new Car();

        System.out.println("What is your car'S brand?");
        String UIbrand = scan.nextLine();
        car.setBrand(UIbrand);

        System.out.println("What is"+" "+ car.getBrand()+"'s"+" "+"model?");
        String UImodel = scan.nextLine();
        car.setModel(UImodel);

        System.out.println("What is your"+" "+ car.getBrand()+" "+ car.getModel()+"'s"+" "+"generating date?");
        int UIgenetatingDate = scan.nextInt();
        car.setGeneratingDate(UIgenetatingDate);

        System.out.println("What is "+" "+ car.getBrand()+" "+ car.getModel()+"'s"+" "+"motor?");
        double UImotor = scan.nextDouble();
        car.setMotor(UImotor);

       System.out.println("What is your"+" "+car.getModel()+"'s"+" "+"color?");
       String UIcolor = scan.nextLine();
       car.setColor(UIcolor);

        System.out.println("How many doors your car have?");
        int UIdoorNumber = scan.nextInt();
        car.setDoorNumber(UIdoorNumber);




        System.out.println("Car's brand:"+" "+UIbrand);
        System.out.println("Car's model:"+" "+UImodel);
        System.out.println("Car's genetaring date:"+" "+UIgenetatingDate);
        System.out.println("Car's motor:"+" "+UImotor);
        System.out.println("Car's color:"+" "+UIcolor);
        System.out.println("Car's door number:"+" "+UIdoorNumber);

    }
}
