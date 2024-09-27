import socket.Volt;
import socketadapter.SocketAdapter;
import socketadapter.SocketClassAdapterImpl;
import socketadapter.SocketObjectAdapterImpl;

public class Main {
    public static void main(String[] args) {
        //Class Adapter
        SocketAdapter socketAdapter = new SocketClassAdapterImpl();
        Volt v3 = socketAdapter.get3Volt();
        Volt v12 = socketAdapter.get12Volt();
        Volt v120 = socketAdapter.get120Volt();
        System.out.println("v3 volts using Class Adapter="+v3.getVolts());
        System.out.println("v12 volts using Class Adapter="+v12.getVolts());
        System.out.println("v120 volts using Class Adapter="+v120.getVolts());

        //Object Adapter
        SocketAdapter socketObjectAdapter = new SocketObjectAdapterImpl();
        Volt vObject3 = socketObjectAdapter.get3Volt();
        Volt vObject12 = socketObjectAdapter.get12Volt();
        Volt vObject120 = socketObjectAdapter.get120Volt();
        System.out.println("v3 volts using Object Adapter="+vObject3.getVolts());
        System.out.println("v12 volts using Object Adapter="+vObject12.getVolts());
        System.out.println("v120 volts using Object Adapter="+vObject120.getVolts());
    }
}
