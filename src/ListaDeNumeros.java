public class ListaDeNumeros
{
  //atributos
  public int[] dados;
  public int tamanho;
  public int capacidade;

  //metodos
    ListaDeNumeros (int c)
  {
	tamanho = 0;
	capacidade = c;
	dados = new int[capacidade];
  }
  //lista itens
  public void listar ()
  {
	System.out.println ("----------Lista de dados----------");
	for (int i = 0; i < tamanho; i++)
	  {
		System.out.println("|" + dados[i] + "|");
	  }
    System.out.println("-----------------------------------");
  }

  public boolean cheia ()
  {
	return tamanho == capacidade;
  }

  public boolean vazio ()
  {
	return tamanho == 0;
  }

  public void inserir (int n)
  {
	if (cheia ())
	  {
		System.out.
		  println ("Lista cheia!");
	  }
	else
	  {
		dados[tamanho] = n;
		tamanho++;
        System.out.println("Valor inserido!");
	  }
  }

  public int buscar (int n)
  {
	for (int i = 0; i < tamanho; i++)
	  {
		if (dados[i] == n)
		  {
			return i;
		  }
	  }
	return -1;
  }

  public int deletar (int n)
  {
	int existe = buscar (n);

	if (vazio () || existe < 0)
	  {
		System.out.println("Valor não encontrado ou Lista vazia");
        return -1;
	  }
	for (int i = (existe); i < (tamanho-1); i++)
	  {
		dados[i] = dados[i + 1];
	  }
	tamanho --;
    System.out.println("Dado deletado");
	return existe;
  }
}