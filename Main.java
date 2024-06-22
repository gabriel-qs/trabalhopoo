import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	Database db = new Database();
	Scanner scanner = new Scanner(System.in);
	int opcao;
	
	System.out.println("-- POKEDEX --");
	System.out.println("");
	do {
	    System.out.println("Menu:");
	    System.out.println("1 - Cadastrar pokemon");
	    System.out.println("2 - Consultar pokemon");
	    System.out.println("3 - Atualizar pokemon");
	    System.out.println("4 - Excluir pokemon");
	    System.out.println("0 - Sair");
	    opcao = scanner.nextInt();
	    scanner.nextLine();

	    switch (opcao) {
		case 1:
		    System.out.print("Nome: ");
		    String nome = scanner.nextLine();
		    System.out.print("Tipo: ");
		    String tipo = scanner.nextLine();
		    System.out.print("Região: ");
		    String regiao = scanner.nextLine();
		    System.out.print("HP: ");
		    int hp = scanner.nextInt();
		    System.out.print("Ataque: ");
		    int ataque = scanner.nextInt();
		    System.out.print("Defesa: ");
		    int defesa = scanner.nextInt();
		    scanner.nextLine();

		    Pokemon novoPokemon = new Pikachu(nome, tipo, regiao, hp, ataque, defesa); 
		    db.cadastrarPokemon(novoPokemon);
		    break;

		case 2:
		    System.out.print("Nome do pokemon a consultar: ");
	    nome = scanner.nextLine();
	    db.consultarPokemon(nome);
	    break;

	case 3:
	    System.out.print("Nome do Pokemon a atualizar: ");
	    nome = scanner.nextLine();
	    System.out.print("Novo Tipo: ");
	    tipo = scanner.nextLine();
	    System.out.print("Nova Região: ");
	    regiao = scanner.nextLine();
	    System.out.print("Novo HP: ");
	    hp = scanner.nextInt();
	    System.out.print("Novo Ataque: ");
	    ataque = scanner.nextInt();
	    System.out.print("Nova Defesa: ");
	    defesa = scanner.nextInt();
	    scanner.nextLine();

	    Pokemon atualizarPokemon = new Pikachu(nome, tipo, regiao, hp, ataque, defesa); 
	    db.atualizarPokemon(atualizarPokemon);
	    break;

	case 4:
	    System.out.print("Nome do Pokemon a excluir: ");
	    nome = scanner.nextLine();
	    db.excluirPokemon(nome);
	    break;

	case 0:
	    System.out.println("Saindo...");
	    break;

	default:
	    System.out.println("Opção inválida!");
	    break;
    }
} while (opcao != 0);

scanner.close();
}
}

