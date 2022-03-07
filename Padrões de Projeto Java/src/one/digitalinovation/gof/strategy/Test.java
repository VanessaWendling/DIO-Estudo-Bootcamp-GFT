package one.digitalinovation.gof.strategy;

//Strategy - simplificar a variação de algoritmos para 
//a resolução de um mesmo problema

//COM SPRING: @Service e @Repository

public class Test {
	public static void main(String[] args) {
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();

		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();
	}
}
