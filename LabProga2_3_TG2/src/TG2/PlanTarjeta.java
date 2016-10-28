/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TG2;

import java.util.Calendar;
import java.util.Locale;

/**
 *
 * @author David
 */
public class PlanTarjeta extends PlanBasico {
    public double saldo;
    Calendar hoy= Calendar.getInstance();
    
    public PlanTarjeta(int c, String nomb) {
        super(c, nomb);
        saldo= 0;
        
    }
    
    public void aplicarTarjeta(double monto){
       if (monto>0) {
           if (hoy.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG,Locale.forLanguageTag("es")).equalsIgnoreCase("Domingo")){
            saldo= saldo+(monto*3);
            return;
           }
            saldo= saldo+ monto;
           
       }
    }
}
