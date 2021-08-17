package contaCorrente;

public class Main {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(15.0);
		
		cc.imprimirOperacao(200.00, cc.getSaldo(), "+");
		cc.depositar(200.00);
		
		cc.imprimirOperacao(2.50, cc.getSaldo(), "-");
		cc.sacar(2.50);
	}
}
