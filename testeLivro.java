
//import java.util.Scanner;

public class testeLivro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Livros livro1 = new Livros();  //instância, erstou criando 1 objeto, estou instânciando Livros
		Livros livro2 = new Livros();
		
		//Scanner ler = new Scanner(System.in);
		
		livro1.nome ="Java a biblia";
		livro1.autor="Cris Fidelix";
		livro1.codLivro=001;
		livro1.descricao="Linguagem de POO";
		livro1.edicao="Atena";
		livro1.isbn="999.9999.9999.99";
		livro1.valor=200.00;
		livro1.ano="2019";
		
				
		livro1.exibirCadastro();
		
		livro2.nome ="XML";
		livro2.autor="Leandro";
		livro2.codLivro=002;
		livro2.descricao="Linguagem XML";
		livro2.edicao="Andromeda";
		livro2.isbn="867.4567.9876.87";
		livro2.valor=150.00;
		livro2.ano="2020";
		
		livro2.exibirCadastro();
		
	}

	
}
