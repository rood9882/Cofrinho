import java.util.ArrayList;
import java.util.List;

public class Cofrinho {
    private final List<Moeda> listaMoedas = new ArrayList<>();

    public void adicionarMoeda(Moeda moeda)
    {
        listaMoedas.add(moeda);
    }

    public void removerMoeda(Moeda moeda){
        listaMoedas.remove(moeda);
    }

    public void listaMoedas(){
        listaMoedas.forEach(IMoeda::info);
    }

    public void totalConvertido(){
        System.out.printf("%.2f%n",listaMoedas.stream().mapToDouble(IMoeda::converter).sum());
    }
}
