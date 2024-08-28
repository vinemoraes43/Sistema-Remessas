package SistemaProdutos;

public class SuperServidor extends Produto {
    public SuperServidor() {
        super(3800.0, 120000.0, 30000.0);
    }

    @Override
    public double calcularFrete() {
        double frete = 0.80 * getPesoEmKg() + 1.00 * getVolumeEmMetrosCubicos();
        double taxaSeguro = 0.30 * preco;
        return frete + taxaSeguro;
    }
}
