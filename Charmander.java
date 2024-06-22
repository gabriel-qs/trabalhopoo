public class Charmander extends Pokemon {
    public Charmander(String nome, String tipo, String regiao, int hp, int ataque, int defesa) {
        super(nome, tipo, regiao, hp, ataque, defesa);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Charmander: " + getNome() + ", Tipo: " + getTipo() + ", RegiÃ£o: " + getRegiao() + ", HP: " + getHp() + ", Ataque: " + getAtaque() + ", Defesa: " + getDefesa());
    }
}

