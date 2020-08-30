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
public class TesteFiguraGeometrica {

    public static void main(String[] args) {
        // figuras 2D
        Circulo circulo = new Circulo();
        circulo.setRaio(2);
        Quadrado quadrado = new Quadrado();
        quadrado.setLado(3);
        Triangulo triangulo = new Triangulo();
        triangulo.setAltura(4);
        triangulo.setBase(3);

        // Figuras 3D
        Cubo cubo = new Cubo();
        cubo.setAresta(3);
        cubo.setLca(5);
        Cilindro cilindro = new Cilindro();
        cilindro.setRaio(3);
        cilindro.setAltura(5);
        cilindro.setRaioBase(7);
        Piramede piramede = new Piramede();
        piramede.setLado(5);
        piramede.setAltura(3);
        piramede.setAreaBase(3);
        piramede.setAreaLateral(3);
        

        FiguraGeometrica[] figuras = new FiguraGeometrica[6];
        
        figuras[0] = circulo;
        figuras[1] = quadrado;
        figuras[2] = triangulo;
        figuras[3] = cubo;
        figuras[4] = cilindro;
        figuras[5] = piramede;
    
        for (FiguraGeometrica fig : figuras) {
            if (fig instanceof Figura2D) {
                Figura2D fig2D = (Figura2D) fig;
                fig2D.calcularArea();
                System.out.println(fig2D);
                System.out.println();
            } else if (fig instanceof Figura3D) {
                Figura3D fig3D = (Figura3D) fig;
                fig3D.calcularArea();
                fig3D.calcularVolume();
                System.out.println(fig3D);
                System.out.println();

            }
        }

    }
}
