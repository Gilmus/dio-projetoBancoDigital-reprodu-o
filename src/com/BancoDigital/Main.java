package com.BancoDigital;

/*Codigo fonte adapatado do repositorio do professor Venilton Falvo Junior*
 *Dispinivel no endereço:https://github.com/falvojr/lab-banco-digital-oo.git.  
 *author Gilmario de Araujo Ferreira.
 */
public class Main {
    
    public static void main(String[] args) {
		Cliente gilmario = new Cliente();
		gilmario.setNome("Gilmario");
		
		Conta cc = new ContaCorrente(gilmario);
		Conta poupanca = new ContaPoupanca(gilmario);

		cc.depositar(200);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
    
}
