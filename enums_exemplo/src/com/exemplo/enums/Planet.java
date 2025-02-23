package com.exemplo.enums;

public enum Planet {
    MERCURY(3.303e+23, 2.4397e6),
    VENUS(4.869e+24, 6.0518e6),
    EARTH(5.976e+24, 6.37814e6);

    private final double massa;   // em quilogramas
    private final double raio;    // em metros

    Planet(double massa, double raio) {
        this.massa = massa;
        this.raio = raio;
    }

    public double getMassa() { return massa; }
    public double getRaio() { return raio; }
}