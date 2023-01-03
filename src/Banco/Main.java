package Banco;

public class Main {

	public static void main(String[] args) {
		Cliente eliel = new Cliente();
		eliel.setName("Eliel");
		
		Conta cc = new ContaCorrente(eliel);
		cc.depositar(150);
		cc.pedirEmprestimo(5000);
		Conta poupanca = new ContaPoupanca(eliel);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
}
