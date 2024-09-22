package builder;

import computer.Computer;

public class ComputerBuilder implements Builder{
    private Computer computer;

    public ComputerBuilder() {
        this.computer = new Computer();
    }

    public void buildHDD(String HDD){
        computer.setHDD(HDD);
    }
    public void buildRAM(String RAM){
        computer.setRAM(RAM);
    }
    public void buildGraphicsCardEnabled(){computer.setGraphicsCardEnabled(true);}
    public void buildBluetoothEnabled(){
        computer.setBluetoothEnabled(true);
    }

    public Computer getResult(){
        return computer;
    }
}