package SistemaProdutos;

public class MiniPc extends Produto {

    public MiniPc() {
        super(500.0, 200.0, 5000.0);
    }

    @Override
    public double calcularFrete() {
        double frete = 0.80 * getPesoEmKg() + 1.00 * getVolumeEmMetrosCubicos();
        return frete;
    }
}
