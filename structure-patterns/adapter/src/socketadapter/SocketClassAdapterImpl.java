package socketadapter;

import socket.Socket;
import socket.Volt;

public class SocketClassAdapterImpl extends Socket implements SocketAdapter {

    @Override
    public Volt get120Volt() {
      return getVolt();
    }

    @Override
    public Volt get12Volt() {
        Volt v=getVolt();
        return convertVolt(v,10);
    }

    @Override
    public Volt get3Volt() {
        Volt v=getVolt();
        return convertVolt(v,40);
    }
    public Volt convertVolt(Volt volt, int convertFactor){
        return new Volt(volt.getVolts()/ convertFactor);
    }

}
