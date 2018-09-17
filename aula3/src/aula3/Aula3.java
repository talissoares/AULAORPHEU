/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3;

/**
 *
 * @author aluno
 */
public class Aula3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        
        p1.nome = "nome";
        p1.carteira = 500.0;
        
        Pessoa p2= new Pessoa();
        
        p2.nome = "Maria";
        p2.carteira = 600.0;
        
        System.out.println(p1.nome +""+ p1.carteira);
        System.out.println(p2.nome +""+ p2.carteira);
        
        p1.carteira -= 150;
        p2.carteira += 150;
        
        System.out.println(p1.nome +""+ p1.carteira);
        System.out.println(p2.nome +""+ p2.carteira);
        
        
    }
    
}
