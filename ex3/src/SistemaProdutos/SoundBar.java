package SistemaProdutos;

public class SoundBar extends Produto {

    public SoundBar() {
        super(670.0, 8000.0, 1800.0);
    }

    @Override
    public double calcularFrete() {
        double frete = 0.80 * getPesoEmKg() + 1.00 * getVolumeEmMetrosCubicos();
        return frete;
    }
}
