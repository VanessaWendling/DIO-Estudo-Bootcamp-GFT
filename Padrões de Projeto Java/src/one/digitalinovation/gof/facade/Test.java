package one.digitalinovation.gof.facade;

//Facade - prover uma interface que reduza a complexidade
//nas integra��es com subsistemas.
public class Test {
	public static void main(String[] args) {
		Facade facade = new Facade();
		facade.migrarCliente("Vanessa", "25675033");
	}
}
