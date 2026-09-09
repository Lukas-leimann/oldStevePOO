public class Picareta {

    private String material;
    private int durabilidade;
    private int forca;
    private double velocidade;

    public Picareta(String material, int durabilidade, int forca, double velocidade) {
        this.material = material;
        this.durabilidade = durabilidade;
        this.forca = forca;
        this.velocidade = velocidade;
    }

    public boolean podeQuebrar(Bloco bloco) {
        return forca >= bloco.getDureza();
    }

    public void minerar(Bloco bloco) {
        if (durabilidade <= 0) {
            System.out.println("A picareta está quebrada.");
            return;
        }

        if (!podeQuebrar(bloco)) {
            System.out.println(
                    "A picareta de " + material +
                            " não consegue quebrar " + bloco.getNome()
            );
            return;
        }

        durabilidade--;

        System.out.println(
                "Quebrando " + bloco.getNome() +
                        " com a picareta de " + material
        );
    }

    public void mostrarInformacoes() {
        System.out.println("Material: " + material);
        System.out.println("Durabilidade: " + durabilidade);
        System.out.println("Força: " + forca);
        System.out.println("Velocidade: " + velocidade);
    }
}
