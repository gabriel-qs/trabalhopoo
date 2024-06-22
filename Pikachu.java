public class Pikachu extends Pokemon {
    public Pikachu(String nome, String tipo, String regiao, int hp, int ataque, int defesa) {
        super(nome, tipo, regiao, hp, ataque, defesa);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Pikachu: " + getNome() + ", Tipo: " + getTipo() + ", Região: " + getRegiao() + ", HP: " + getHp() + ", Ataque: " + getAtaque() + ", Defesa: " + getDefesa());
    }
}

