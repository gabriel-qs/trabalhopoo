import java.sql.*;

public class Database {
    private static final String URL = "jdbc:mysql://localhost:3306/pokedex";
    private static final String USER = "gab"; 
    private static final String PASSWORD = "1223334444";

    private Connection connect() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public void cadastrarPokemon(Pokemon pokemon) {
        String sql = "INSERT INTO pokemons (nome, tipo, regiao, hp, ataque, defesa) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = this.connect(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, pokemon.getNome());
            pstmt.setString(2, pokemon.getTipo());
            pstmt.setString(3, pokemon.getRegiao());
            pstmt.setInt(4, pokemon.getHp());
            pstmt.setInt(5, pokemon.getAtaque());
            pstmt.setInt(6, pokemon.getDefesa());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
	
	public void consultarPokemon(String nome) {
	String sql = "SELECT * FROM pokemons WHERE nome = ?";

   		 try (Connection conn = this.connect(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setString(1, nome);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
			    System.out.println("Tipo: " + rs.getString("tipo"));
			    System.out.println("Região: " + rs.getString("regiao"));
			    System.out.println("HP: " + rs.getInt("hp"));
			    System.out.println("Ataque: " + rs.getInt("ataque"));
			    System.out.println("Defesa: " + rs.getInt("defesa"));
			    System.out.println("----------------------------------");
			    System.out.println("");
			}
	    	} 
		catch (SQLException e) {
			System.out.println("Erro ao consultar Pokemon: " + e.getMessage());
	    	}
	}



    public void atualizarPokemon(Pokemon pokemon) {
        String sql = "UPDATE pokemons SET tipo = ?, regiao = ?, hp = ?, ataque = ?, defesa = ? WHERE nome = ?";

        try (Connection conn = this.connect(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, pokemon.getTipo());
            pstmt.setString(2, pokemon.getRegiao());
            pstmt.setInt(3, pokemon.getHp());
            pstmt.setInt(4, pokemon.getAtaque());
            pstmt.setInt(5, pokemon.getDefesa());
            pstmt.setString(6, pokemon.getNome());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void excluirPokemon(String nome) {
        String sql = "DELETE FROM pokemons WHERE nome = ?";

        try (Connection conn = this.connect(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, nome);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

