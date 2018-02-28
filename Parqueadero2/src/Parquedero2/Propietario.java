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
public class Propietario {

    int nivelAlcohol;
    String genero;

    boolean ebrio() {

        if (nivelAlcohol > 1) {
            return true;
        } else {
            return false;
        }
    }
    
  String mirargenero(){
      return genero;
  }
}
