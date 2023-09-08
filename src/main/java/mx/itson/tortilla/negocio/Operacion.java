/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.tortilla.negocio;

/**
 *Contiene metodos para trabajar con cadenas de texto.
 * @author sansi
 */
public class Operacion {

    Operacion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

/**
 * Separa una cadena de texto en donde encuentre el caracter guion medio.
 * @param oracion Es la operacion que sera separada en fracciones.
 * @return Array de String en cuyo cada componente seera un fraccion de la cadena otorgada.
 */
    
    
    public String[] separar(String oracion){
        String[] resultado = oracion.split("-");
        return resultado;
                }
}
