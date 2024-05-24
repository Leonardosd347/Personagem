public class App {
    public static void main(String[] args) {
        Personagem heroi = new Personagem("Hercules", 2, 16);

        heroi.mostrarStatus();
        heroi.atacar("Hydra", "golpe duplo");

        System.out.println("Dano calculado: " + heroi.calcularDano());
    }
}

class Personagem {
    private String nome;
    private int nivel;
    private int forca;

    // Construtor
    public Personagem(String nome, int nivel, int forca) {
        this.nome = nome;
        this.nivel = nivel;
        this.forca = forca;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    // Método para mostrar o status do personagem
    public void mostrarStatus() {
        System.out.format("Personagem: %s (lvl %d) com %d de força.\n", nome, nivel, forca);
    }

    // Método para simular um ataque
    public void atacar(String alvo, String habilidade) {
        if (habilidade == null || habilidade.isEmpty()) {
            System.out.format("%s atacou %s e causou %d de dano.\n", nome, alvo, forca);
        } else {
            System.out.format("%s usou '%s' contra %s e causou %d de dano.\n", nome, habilidade, alvo, forca);
        }
    }

    // Método para calcular o dano
    public int calcularDano() {
        return nivel * forca;
    }
}
