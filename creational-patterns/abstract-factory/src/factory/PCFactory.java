package factory;

import computer.Computer;
import computer.PC;
import factory.ComputerAbstractFactory;

public class PCFactory implements ComputerAbstractFactory {
    private String CPU;
    private String RAM;
    private String HDD;

    public PCFactory(String CPU, String RAM, String HDD) {
        this.CPU = CPU;
        this.RAM = RAM;
        this.HDD = HDD;
    }

    @Override
    public Computer createComputer() {
        return new PC(CPU,RAM,HDD);
    }
}