package sintaxe_variaveis_e_fluxo;

public class TestaConversao
{
	public static void main(String[] args)
	{
		double salario = 1270.50;
		int valor = (int) salario; // Forçar o valor utilizando casting
		System.out.println(valor);

		double valor1 = 3; // Isso é permitido no Java um inteiro dentro de uma variavel decimal, será convertido
		System.out.println(valor1);

		double valor2 = 0.2;
		double valor3 = 0.1;
		double total = valor2 + valor3;
		System.out.println(total); // Por causa da especificação IEEE 754 que a linguagem usa
		
		//float pontoFlutuante = (float) 3.14;
		float pontoFlutuante = 3.14f;
		System.out.println(pontoFlutuante);

		// byte numeroMuitoPequeno; Guarda até 256
		// short numeroPequeno; Guarda até 16 bits
		// int numeroPadrao; Guarda até 32 bits
		// long numeroGrande; Guarda até 64 bits		
	}
}
