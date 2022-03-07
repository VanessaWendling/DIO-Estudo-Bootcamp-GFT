package one.digitalinovation.gof.facade;

//Facade - prover uma interface que reduza a complexidade
//nas integrações com subsistemas.

//COM SPRING: construiremos uma API REST com o mesmo objetivo
//desse padrão, abstrair a complexidade das seguintes integrações
//Spring Data JPA e ViaCEP(Feign)

public class Test {
	public static void main(String[] args) {
		Facade facade = new Facade();
		facade.migrarCliente("Vanessa", "25675033");
	}
}
