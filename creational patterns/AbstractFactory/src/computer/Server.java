package computer;

import computer.Computer;

public class Server extends Computer {
    private String CPU;
    private String RAM;
    private String HDD;

    public Server(String CPU, String RAM, String HDD) {
        this.CPU = CPU;
        this.RAM = RAM;
        this.HDD = HDD;
    }

    public String getCPU() {
        return CPU;
    }

    public String getRAM() {
        return RAM;
    }

    public String getHDD() {
        return HDD;
    }
}
