
package clasesabstractas;


public class Coche extends Vehiculo{
    
    private int numPortas;
    public Coche(int cilindrada, int potencia, int numPortas){
        super(cilindrada,potencia);
        this.numPortas = numPortas;
     }

    @Override
    public String toString() {
        return "Coche{" + "numPortas=" + numPortas +"potencia "+getPotencia()+ "cilindrada"+getCilindrada()+ '}';
    }
    public double calcularImposto(){
    return getCilindrada()/20+getPotencia()*20;
    }
    
    
}
