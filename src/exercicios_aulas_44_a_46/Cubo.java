    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios_aulas_44_a_46;

/**
 *
 * @author jsjef
 */
public class Cubo extends Figura3D  {
    
    private double aresta;
    private double lca;
    private double area;
    private double volume;

    public double getAresta() {
        return aresta;
    }

    public void setAresta(double aresta) {
        this.aresta = aresta;
    }

    public double getLca() {
        return lca;
    }

    public void setLca(double lca) {
        this.lca = lca;
    }
    
    @Override
    public void calcularArea() {
        area = 6*Math.pow(aresta, 2);
    }

    @Override
    public void calcularVolume() {
        
        volume = Math.pow(lca, 3);
        
    }
    
      @Override
    public String toString(){
        
        return "Área do cubo é igual a:  " + this.area + "\nVolume do cubo é igual a: " + this.volume;
    }



}
