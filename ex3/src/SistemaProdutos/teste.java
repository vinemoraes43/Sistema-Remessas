package SistemaProdutos;

public class teste {
    public static void main(String[] args) {
        MiniPc pcMini = new MiniPc();
        SoundBar caixaSom = new SoundBar();
        SuperServidor riot = new SuperServidor();

        Produto[] produtos = { pcMini, caixaSom, riot }; // lista dos produtos

        SistemaRemesa sistemaRemessas = new SistemaRemesa(); // objeto do sistema para fazer o calculo do frete
        double custoTotalFrete = sistemaRemessas.calcularTotalCustoFrete(produtos);

        System.out.printf("Custo Total de Frete: R$ %.2f%n", custoTotalFrete);
    }
}
