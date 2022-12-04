package sintaxe_variaveis_e_fluxo;

public class TestaEscopo
{
	public static void main(String[] args)
	{
		System.out.println("testando condicionais");
		
		int idade = 20;
		int quantidadePessoas = 3;
		//boolean acompanhado = quantidadePessoas >= 2;
		
		boolean acompanhado;
		// É necessário declarar a variavel fora do bloco, pois ela nasce na linha 18 e morre na linha 19, mesma coisa no else
		// nasce na linha 21 e morre na linha 22 por causa do escopo
		
		if (quantidadePessoas >= 2)
		{
			acompanhado = true;
		} else {
			acompanhado = false;
		}

		System.out.println("valor de acompanhado = " + acompanhado);
		
		if (idade >= 18 && acompanhado)
		{
			System.out.println("seja bem vindo");
		}
		else
		{
				System.out.println("infelizmente você não pode entrar");
		}
	}
}