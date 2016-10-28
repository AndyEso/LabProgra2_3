/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TG2;

import java.util.Calendar;

/**
 *
 * @author Miguel Paz
 */
public class LogCall {
    public double numero_marcado;
    public double minutos;
    public Calendar fecha= Calendar.getInstance();
    
    @Override
    public String toString(){
       return "Número marcado= " + numero_marcado+ " Minutos ="+ minutos+ "Fecha= "+ fecha;
       
    }
}
