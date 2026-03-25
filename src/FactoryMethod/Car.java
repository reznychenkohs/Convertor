package FactoryMethod;

public class Car implements Transport{
    @Override
    public void move(){
        System.out.println("Move by car");
    }
}
