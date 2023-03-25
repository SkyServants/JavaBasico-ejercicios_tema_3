package com.SkyServants;

import java.util.Arrays;

public class BucleEjercicio {

    public static void main(String[] args) {

        String[] datosPersona = {"Edgar", "Alexander", "Mendivelso", "Peñaranda"};

        String cadena = "";

        //Desarrolo del bucle para concatenar el Array de texto;

        for (int i = 0; i < datosPersona.length; i++) {

            cadena += " " + datosPersona[i];

        }

        System.out.println("Concatenacion del array:"+ " " + cadena);


        //Concatenacion de un array de texto, forma sugeriada por el IDE
        StringBuilder cadena2 = new StringBuilder();

        for (String s : datosPersona) {
            cadena2.append(" ").append(s);

        }

        System.out.println("Concatenacion del array (Forma sugerida por el entorno de desarrollo):" +
                " " + cadena);

    }


}



