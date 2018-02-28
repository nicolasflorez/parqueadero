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
public class Celador {

    String saludo() {
        return "Hola Doctor";
    }

    String saludo(boolean ebrio) {
        return "Largo de Aqui";
    }

    String saludo(String genero) {
        if (genero == "hombre") {
            return "Hola Doctor";
        } else {
            return "venga que no es pa eso";
        }
    }

}
