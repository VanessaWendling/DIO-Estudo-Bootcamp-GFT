package one.digitalinovation.gof.singleton;
//Singleton - permite a cria��o de uma �nica inst�ncia
//de uma classe e fornece um modo para recuper�-la

//COM SPRING: @Bean e @Autowired

public class Test {

	
	public static void main(String[] args) {
		
		//Testes relacionados ao Design Pattern Singleton
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
	}

}

