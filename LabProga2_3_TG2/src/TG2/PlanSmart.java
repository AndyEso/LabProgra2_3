/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TG2;

/**
 *
 * @author ANDY ESCOBAR 007
 */
public class PlanSmart extends PlanBasico{

    public PlanSmart(int c, String nomb) {
        super(c, nomb);
    }
    
    
    @Override
    public double pagoMensual(){
        
        double pagoxinternet=20;
        double pagoxplan=22;
       return pagoxinternet+pagoxplan;
       
        
        
        
    }

    @Override
    public String toString() {
        return super.toString()+" -PlanSmart";
    }
    
    
    
    
    
    
}
