import java.util.Objects;

public abstract class Moeda implements IMoeda {

    protected Double valor;

    public Moeda(){

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Moeda moeda)) return false;
        return Objects.equals(valor, moeda.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
