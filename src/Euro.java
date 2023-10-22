public class Euro extends  Moeda{
    public Euro() {
        super();
    }

    /**
     * Converte o valor em real.
     *
     * @return Valor em Real.
     */
    @Override
    public Double converter() {
        return valor * 6d;
    }

    /**
     * Imprime informações da moeda.
     */
    @Override
    public void info() {
        System.out.printf("Euro = %.2f%n", valor);
    }
}
