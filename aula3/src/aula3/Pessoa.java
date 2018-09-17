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
public class Pessoa {

    double carteira;
    String nome;
    
    public void dar( Pessoa px, double valor ){
        this.carteira -= valor;
        receber(px, valor);
    }

    public void receber(Pessoa px, double valor) {
     px.carteira += valor;
    }
    
    
}
