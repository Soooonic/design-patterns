package builder;

import computer.Computer;

public interface Builder {
    void buildHDD(String HDD);
    void buildRAM(String RAM);
    void buildGraphicsCardEnabled();
    void buildBluetoothEnabled();
    Computer getResult();
}
