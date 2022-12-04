package sintaxe_variaveis_e_fluxo;

public class TestaVariaveis
{
	public static void main(String[] args)
	{
		System.out.println("Ola novo teste");
		
		int idade = 37; // Iniciamos as variáveis com letra minúsculas
		System.out.println(idade);

		idade = 30 + 10;
		System.out.println(idade);

		idade = (7 * 5) + 2;
		System.out.println(idade);
		
		System.out.println("a idade é " + idade + ", parabéns");
	}
}
