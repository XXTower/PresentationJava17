package com.oxyl;

public interface PLayWhitSealed {

    sealed interface Vehicule permits Bus,Moto {}
    sealed class Bus implements Vehicule {}
    final class Car extends Bus {}
    non-sealed class Moto implements Vehicule{}


}
