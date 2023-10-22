public class Dolar extends  Moeda{
    public Dolar() {
        super();
    }

    /**
     * Converte o valor em real.
     *
     * @return Valor em Real.
     */
    @Override
    public Double converter() {
        return valor * 5d;
    }

    /**
     * Imprime informações da moeda.
     */
    @Override
    public void info() {
        System.out.printf("Dólar = %.2f%n", valor);
    }
}
