package SistemaProdutos;

public class SistemaRemesa {

    public double calcularTotalCustoFrete(Produto[] produtos) {
        double custoTotal = 0;

        for (Produto produto : produtos) {
            custoTotal += produto.calcularFrete();
        }

        return custoTotal;
    }
}
