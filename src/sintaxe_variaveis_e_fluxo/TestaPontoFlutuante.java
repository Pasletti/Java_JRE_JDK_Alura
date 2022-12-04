package sintaxe_variaveis_e_fluxo;

public class TestaPontoFlutuante
{
	public static void main(String[] args)
	{
		double salario = 1250.70;
		System.out.println("meu salário é " + salario);
		
		double idade = 37;
		System.out.println(idade);
		
		double divisao = 3.14 / 2;
		System.out.println(divisao);
		
		int outraDivisao = 5 / 2; // Resultado 2, dá um inteiro
		System.out.println(outraDivisao);
		
		double novaTentativa = 5 / 2; // Resultado 2.0
		System.out.println(novaTentativa);
		
		novaTentativa = 5.0 / 2; // Resultado 2.5
		System.out.println(novaTentativa);
	}
}
