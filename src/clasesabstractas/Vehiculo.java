
package clasesabstractas;


public abstract class Vehiculo {
    private int cilindrada;
    private int potencia;

    public Vehiculo(int cilindrada, int potencia) {
        this.cilindrada = cilindrada;
        this.potencia = potencia;
    }
    
    public int getCilindrada(){
    return cilindrada;
    }
    public int getPotencia(){
    return potencia;
    }
    
    
   public String arrancar(){
   return "Arranca o vehículo";
   }
   public abstract double calcularImposto();
}
