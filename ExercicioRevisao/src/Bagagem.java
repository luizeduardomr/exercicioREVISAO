public abstract class Bagagem implements Comparable<Bagagem> {
    private double peso;
    private String descricao;
    private static int count = 0;
    private static double custoExcedente;

    public Bagagem(double peso, String descricao){
        this.peso = peso;
        this.descricao = descricao;
        count++;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public static double getCustoExcedente(){
        return custoExcedente;
    }

    public static void setCustoExcedente(double custoExcedente){
        Bagagem.custoExcedente = custoExcedente;
    }

    public double getPeso(){
        return peso;
    }


    public abstract double getCusto();


    @Override
    public String toString() {
        return "Peso: " + peso + " Descrição: " + descricao;
    }

    public static int getTotalBagagens(){
        return count;
    }

    public int compareTo(Bagagem outraBagagem){
        if(this.peso - outraBagagem.getPeso()>0) return 1;
        else if(this.peso - outraBagagem.getPeso() == 0) return 0;
        else return -1;
    }
}


/* Questão 5:
        O método getCusto é um método de sobrescrita (Override)
        O método toString é um método de sobrescrita (Override)

 */
