package socketadapter;

import socket.Socket;
import socket.Volt;

public class SocketObjectAdapterImpl implements SocketAdapter {
    //Composition
    private Socket socket=new Socket();

    @Override
    public Volt get120Volt() {
        return socket.getVolt();
    }

    @Override
    public Volt get12Volt() {
        Volt volt=socket.getVolt();
        return convertVolt(volt,10);
    }

    @Override
    public Volt get3Volt() {
        Volt volt=socket.getVolt();
        return convertVolt(volt,40);
    }
    public Volt convertVolt(Volt volt, int convertFactor){
        return new Volt(volt.getVolts()/convertFactor);
    }
}
