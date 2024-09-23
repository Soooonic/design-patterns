import computer.Computer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Computer.ComputerBuilder computerBuilder=new Computer.ComputerBuilder("1TB", "16GB", "2.4GHz","Intel i7");

        //do some operations


        //get the optional parameters

        String opticalDrive=scanner.next();
        computerBuilder.setOpticalDrive(opticalDrive);

        boolean graphicsCardInput=scanner.nextBoolean();
        if(graphicsCardInput){
            computerBuilder.setGraphicsCardEnabled();
        }

        Computer computer=computerBuilder.getResult();

        System.out.println(computer.getRAM());
    }
}
