public class Server extends Computer{
    private String CPU;
    private String RAM;
    private String HDD;


    public Server(String CPU, String HDD, String RAM) {
        this.CPU = CPU;
        this.HDD = HDD;
        this.RAM = RAM;
    }

    @Override
    public String getCPU() {return this.CPU;}
    @Override
    public String getRAM() {
        return this.RAM;
    }

    @Override
    public String getHDD() {
        return this.HDD;
    }
}
