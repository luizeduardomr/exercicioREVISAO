import java.util.ArrayList;
import java.util.Collection;

public class ListaDeBagagens {
    private ArrayList<Bagagem> lista;
    private int contador;

    public ListaDeBagagens() {
        lista = new ArrayList<>();
    }

    public void add(Bagagem b) {
        lista.add(b);
        contador++;
    }

    public int getContador() {
        return contador;
    }

    public ArrayList<Bagagem> getLista() {
        return lista;
    }

    public double getCustoTotal() {
        double custototal = 0;
        for (Bagagem b : lista) {
            custototal = custototal + b.getCusto();
        }
        return custototal;
    }

    public double getCustoTotalBagagensDeMao() {
        double custoTotalM = 0;
        for (Bagagem b : lista) {
            if (b instanceof BagagemDeMao) {
                custoTotalM = custoTotalM + b.getCusto();
            }
        }
        return custoTotalM;
    }

    public ArrayList<Bagagem> getBagagemDeMao() {
        ArrayList<Bagagem> bagagemM = new ArrayList<>();
        for (Bagagem b : lista) {
            if (b instanceof BagagemDeMao) {
                bagagemM.add(b);
            }
        }
        return bagagemM;
    }

    public int getTotalBagagensDeMao() {
        int count = 0;
        for (Bagagem bag : lista) {
            if (bag instanceof BagagemDeMao) count++;
        }
        return count;
    }
    @Override
    public String toString() {
        String bags = "";
        for (Bagagem bag: lista){
            bags = bags + bag + "\n";
        }
        return "Lista De Bagagens\n" + bags;
    }
}
