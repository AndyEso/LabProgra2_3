/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TG2;

import java.util.ArrayList;

/**
 *
 * @author David
 */
public class PlanBasico {
    //Atributos
    public int numero_tel;
    public String nombre;
    ArrayList<LogCall> array;
    
    //Constructor
    public PlanBasico(int c,String nomb){
        array = new ArrayList<>();
    }
    
    //Funciones

    public int getNumero_tel() {
        return numero_tel;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void call(int numero, double mins){
        array.add(new LogCall(numero,mins) );
    }
    
    public double monthlyMinutes(){
        return 1;
    }
    public double pagoMensual(){
        return monthlyMinutes()* 0.5;
    } 
    
    @Override
    public String toString(){
        return "Numero= "+numero_tel+" Nombre= "+nombre;
    }
    public void Imprimir(){
         
    }
    
}
