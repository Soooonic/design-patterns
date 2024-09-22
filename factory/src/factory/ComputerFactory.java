package factory;

import computer.Computer;
import computer.PC;
import computer.Server;

public class ComputerFactory {
    public static Computer getComputer(String type , String ram, String hdd, String cpu){
        if(type.equalsIgnoreCase("PC")){
            return new PC(cpu, hdd, ram);
        }
        else if(type.equalsIgnoreCase("Server")){
            return new Server(cpu, hdd, ram);
        }
        return null;
    }
}
