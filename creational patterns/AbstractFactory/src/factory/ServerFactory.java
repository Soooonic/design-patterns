package factory;

import computer.Computer;
import computer.Server;
import factory.ComputerAbstractFactory;


public class ServerFactory implements ComputerAbstractFactory {
    private String CPU;
    private String RAM;
    private String HDD;

    public ServerFactory(String CPU, String RAM, String HDD) {
        this.CPU = CPU;
        this.RAM = RAM;
        this.HDD = HDD;
    }

    @Override
    public Computer createComputer() {
        return new Server(CPU,RAM,HDD);
    }
}
