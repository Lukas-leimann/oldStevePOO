public class oldStevePOO {

    public static void main(String[] args) {

        Picareta ferro = new Picareta(
                "Ferro",
                250,
                3,
                6.0
        );

        Bloco terra = new Bloco("Terra", 2);
        Bloco pedra = new Bloco("Pedra", 5);
        Bloco obsidiana = new Bloco("Obsidiana", 20);

        System.out.println("=== PICARETA ===");
        ferro.mostrarInformacoes();

        System.out.println("\n=== MINERAÇÃO ===");

        ferro.minerar(terra);
        ferro.minerar(pedra);
        ferro.minerar(obsidiana);

        System.out.println("\n=== ESTADO FINAL ===");
        ferro.mostrarInformacoes();
    }
}
