package com.exemplo.enums;

public class Main {
    public static void main(String[] args) {
        // Exemplo com DiaDaSemana
        DiaDaSemana hoje = DiaDaSemana.SEGUNDA;
        System.out.println("Hoje é: " + hoje);

        // Iterando sobre todos os dias
        System.out.println("\nDias da semana:");
        for (DiaDaSemana dia : DiaDaSemana.values()) {
            System.out.println(dia);
        }

        // Exemplo com Planet
        System.out.println("\nInformações dos planetas:");
        for (Planet planeta : Planet.values()) {
            System.out.println(planeta.name() + 
                " | Massa: " + planeta.getMassa() + " kg" +
                " | Raio: " + planeta.getRaio() + " m");
        }
    }
}