public abstract class Pokemon {
    private String nome;
    private String tipo;
    private String regiao;
    private int hp;
    private int ataque;
    private int defesa;

    public Pokemon(String nome, String tipo, String regiao, int hp, int ataque, int defesa) {
        this.nome = nome;
        this.tipo = tipo;
        this.regiao = regiao;
        this.hp = hp;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public String getRegiao() { return regiao; }
    public void setRegiao(String regiao) { this.regiao = regiao; }

    public int getHp() { return hp; }
    public void setHp(int hp) { this.hp = hp; }

    public int getAtaque() { return ataque; }
    public void setAtaque(int ataque) { this.ataque = ataque; }

    public int getDefesa() { return defesa; }
    public void setDefesa(int defesa) { this.defesa = defesa; }

    
    public abstract void mostrarInfo();
}

