class Programa {

	public static void main(String[] args) {

		System.out.println("ola mundo, agora estamos no Git");
		System.out.println("Não gostei... imprime outra coisa");

	}

	public static int soma(int a, int b){
		if (a > b){
			System.out.println("A não pode ser maior que B");
			return 0;
		}
		int soma = a + b;
		return soma;
	}

}
