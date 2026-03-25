package FactoryMethod;

public class Plane implements Transport {
    @Override
    public void move(){
        System.out.println("Move by plane");
    }
}
