package FactoryMethod;

public interface Transport {
    default void move(){
        System.out.println("Just move");
    }
}
