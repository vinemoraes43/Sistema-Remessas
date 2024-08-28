package SistemaProdutos;

public abstract class Produto{
    protected double peso; 
    protected double volume;
    protected double preco; 

    public Produto(double peso, double volume, double preco) {
        this.peso = peso;
        this.volume = volume;
        this.preco = preco;
    }

    public abstract double calcularFrete();

    public double getPesoEmKg() {
        return peso / 1000.0; // convertendo para kg
    }

    public double getVolumeEmMetrosCubicos() {
        return volume / 1000000.0; // convertendo para m³
    }
}
