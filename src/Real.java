public class Real extends  Moeda{
    public Real() {
        super();
    }

    /**
     * Converte o valor em real.
     *
     * @return Valor em Real.
     */
    @Override
    public Double converter() {
        return valor * 1d;
    }

    /**
     * Imprime informações da moeda.
     */
    @Override
    public void info() {
        System.out.printf("Real = %.2f%n", valor);
    }
}
