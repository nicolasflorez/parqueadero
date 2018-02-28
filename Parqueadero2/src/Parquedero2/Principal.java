/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parquedero2;

/**
 *
 * @author Estudiantes
 */
public class Principal {

    public static void main(String[] args) {
 
        Celador miCelador = new Celador();
        String saludo;
        boolean ebrio;

        Propietario hombre1 = new Propietario();
        hombre1.nivelAlcohol = 10;
        hombre1.genero = "hombre";
        saludo=miCelador.saludo("hombre");
        System.out.println(saludo);

        Propietario hombre2 = new Propietario();
        hombre2.nivelAlcohol = 0;
        hombre2.genero = "hombre";

        Propietario mujer1 = new Propietario();
        mujer1.nivelAlcohol = 10;
        mujer1.genero = "mujer";

        Propietario mujer2 = new Propietario();
        mujer2.nivelAlcohol = 0;
        mujer1.genero = "mujer";
    }

}
