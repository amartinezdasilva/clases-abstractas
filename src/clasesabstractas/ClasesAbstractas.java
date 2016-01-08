
package clasesabstractas;

import javax.swing.JOptionPane;


public class ClasesAbstractas {
   
    
    public static void main(String[] args) {
      Motos vespa = new Motos(125,50);
      JOptionPane.showMessageDialog(null,"imposto moto ="+vespa.calcularImposto());
      JOptionPane.showMessageDialog(null,vespa.arrancar());
      Coche citroen = new Coche(1005,80,5);
      JOptionPane.showMessageDialog(null,"imposto coche ="+citroen.calcularImposto());
      JOptionPane.showMessageDialog(null,citroen.arrancar());
      JOptionPane.showMessageDialog(null,citroen.toString());
      Camion barreiro = new Camion(3000,200,8);
      JOptionPane.showMessageDialog(null,"imposto camión ="+barreiro.calcularImposto());
      JOptionPane.showMessageDialog(null,barreiro.arrancar());
     
    }
    
}
