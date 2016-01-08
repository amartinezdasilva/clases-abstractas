
package clasesabstractas;


public class Camion extends Vehiculo {
  
    private  int numRodas;
    public Camion(int cilindrada, int potencia, int numRodas){
         super(cilindrada, potencia);
         this.numRodas = numRodas;    
    
    }
public double calcularImposto(){
   return getCilindrada()/30+getPotencia()*20+numRodas*20;

}
   

    
    
    
}
