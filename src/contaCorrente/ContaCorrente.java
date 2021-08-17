package contaCorrente;

public class ContaCorrente {
	private Double saldo;
	
	//construtor que inicia o saldo com valor de 15
	public ContaCorrente(Double valorSaldo) {
		this.saldo = valorSaldo;
	}

	//construtor que inicia o saldo com o valor de 0
	public ContaCorrente() {
		this.saldo = 0.0;
	}
	

	public Double getSaldo() {
		return saldo;
	}
	
	public Double sacar(Double valorSacado) { 
		if (valorSacado > saldo) {
			System.out.println("Saldo insuficiente");
		}
		else {
			this.saldo = getSaldo() - valorSacado;
			return valorSacado;
		}
		return 0.0;
	}
	
	public void depositar(Double valorDepositado) { 
		this.saldo = valorDepositado + getSaldo();
	}

	public void imprimirOperacao(Double valor, Double saldo, String sinal) {
		if (sinal == "+") {
			System.out.println(getSaldo() + " + " + valor + " = " + (getSaldo() + valor));
		}
		else {
			System.out.println(getSaldo() + " - " + valor + " = " + (getSaldo() - valor)); 
		}
	}
	
}
