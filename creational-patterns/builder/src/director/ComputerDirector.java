package director;

import builder.Builder;

public class ComputerDirector {
    public void construct(Builder builder){
        builder.buildRAM("500GB");
        builder.buildHDD("2GB");
        builder.buildGraphicsCardEnabled();
        builder.buildBluetoothEnabled();
    }
}
