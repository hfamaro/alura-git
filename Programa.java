class Programa {

	public static void main(String[] args) {

		System.out.println("ola mundo, agora estamos no Git");
		System.out.println("Não gostei... imprime outra coisa");

	}

	public static int produto(int a, int b){
		if (a == 0 || b == 0){
			System.out.println("A e B não podem ser 0");
			return 0;
		}
		return a * b;
	}

}
