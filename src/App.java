public class App
{
  public static void main (String[]args)
  {
	ListaDeNumeros lista1 = new ListaDeNumeros (5);
	  lista1.inserir (1);
	  lista1.inserir (2);
	  lista1.inserir (3);
	  lista1.inserir (4);
	  lista1.inserir (5);

    System.out.println ("=-=-=-=-=-=Antes da Exclusão=-=-=-=-=-=");
    lista1.listar();

	lista1.deletar (3);

	System.out.println ("=-=-=-=-=-=Depois da Exclusão=-=-=-=-=-=");

	lista1.listar();

  }
}

class ListaDeNumeros
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
		  println ("Lista cheia, procure a sala do mundial do palmeiras");
	  }
	else
	  {
		dados[tamanho] = n;
		tamanho++;
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
		return -1;
	  }
	for (int i = (existe); i < (tamanho-1); i++)
	  {
		dados[i] = dados[i + 1];
	  }
	tamanho --;

	return existe;
  }
}