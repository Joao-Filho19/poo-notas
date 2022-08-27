/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

/**
 *
 * @author Acer
 */
public class Notas {
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;
    
    public void aprovacao(){
        double media=(nota1+nota2+nota3);
        double restante=60-media;
        if (media>60){
            System.out.printf("Media final= %.2f \nAprovado",media);
        }
        else{
            System.out.printf("Media final= %.2f\nFalhou\nFaltando %.2f pontos",media,restante);
        }
    }
}
