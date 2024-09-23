package computer;

public class Computer {
    private String HDD;
    private String RAM;
    private String CPU;
    private String processor;
    //optional
    private String opticalDrive;//DVD
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;


    public String getHDD() {
        return HDD;
    }

    public String getRAM() {
        return RAM;
    }

    public String getCPU() {
        return CPU;
    }

    public String getProcessor() {
        return processor;
    }

    public String getOpticalDrive() {
        return opticalDrive;
    }

    public boolean isGraphicsCardEnabled() {
        return isGraphicsCardEnabled;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    private Computer(ComputerBuilder computerBuilder) {
        this.HDD = computerBuilder.HDD;
        this.RAM = computerBuilder.RAM;
        this.CPU = computerBuilder.CPU;
        this.processor = computerBuilder.processor;
        this.opticalDrive=computerBuilder.opticalDrive;
        this.isGraphicsCardEnabled=computerBuilder.isGraphicsCardEnabled;
        this.isBluetoothEnabled=computerBuilder.isBluetoothEnabled;
    }


    public static class ComputerBuilder {
        private String HDD;
        private String RAM;
        private String CPU;
        private String processor;
        //optional
        private String opticalDrive;//DVD
        private boolean isGraphicsCardEnabled;
        private boolean isBluetoothEnabled;


        public ComputerBuilder(String HDD, String RAM, String CPU, String processor) {
            this.HDD = HDD;
            this.RAM = RAM;
            this.CPU = CPU;
            this.processor = processor;
        }

        public ComputerBuilder setOpticalDrive(String opticalDrive){
            this.opticalDrive=opticalDrive;
            return this;
        }
        public ComputerBuilder setGraphicsCardEnabled(){
            this.isGraphicsCardEnabled=true;
            return this;
        }
        ComputerBuilder setBluetoothEnabled(){
            this.isBluetoothEnabled=true;
            return this;
        }

        public  Computer getResult(){
            return new Computer(this);
        }
    }
}
