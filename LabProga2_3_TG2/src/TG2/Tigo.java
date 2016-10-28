/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TG2;

import java.util.ArrayList;

/**
 *
 * @author ANDY ESCOBAR 007
 */
public class Tigo {
    
    ArrayList<PlanBasico> plan=new ArrayList<>();
    
    
    
    public void addPlan(int numtel,String nombre, String tipo){
        if(search(numtel)!=null){
            if(tipo.equals("BASICO")){
                plan.add(new PlanBasico(numtel, nombre));
            }
            else if(tipo.equals("SMART")){
                plan.add(new PlanSmart(numtel, nombre)); 
            }
            else if(tipo.equals("TARJETA")){
                plan.add(new PlanTarjeta(numtel, nombre));
            }
        }
        
    }
    public PlanBasico search(int num){
        for(PlanBasico numero: plan){
                if(numero.getNumero_tel()==num){
                    return numero;
                }
                
        }
        return null;
    }
    double makeCall(int numTelOrigen, int numTelDestino, double mins){
        
    }
    double payPlan(int numTel){
        
    }
    void activateCard(int numTel, double monto){
        
    }
    void viewPlan(int numTel){
        
    }
}
