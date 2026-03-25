package FactoryMethod;

public class PlaneFactory extends TransportFactory{
    @Override
    Transport createTransport(){
        return new Plane();
    }
}
