
package clasesabstractas;


public class Motos extends Vehiculo {

    
    public Motos(int cilindrada, int potencia){
    super(cilindrada,potencia);
    
    }
    
    
    public double calcularImposto(){
    return getCilindrada()/30+getPotencia()*10;
 }
}
