class Programa {

	public static void main(String[] args) {

		System.out.println("ola mundo, agora estamos no Git");
		System.out.println("Não gostei... imprime outra coisa");
		System.out.println("Corrigindo bug no branch master");

	}

	public static int soma(int a, int b){
		if (a > b){
			System.out.println("A não pode ser maior que B");
			return 0;
		}
		int soma = a + b;
		return soma;
	}	
	public static int produto(int a, int b){
		if (a == 0 || b == 0){
			System.out.println("A e B não podem ser 0");
			return 0;
		}
		return a * b;
	}

}
