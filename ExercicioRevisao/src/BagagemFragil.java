public class BagagemFragil extends Bagagem {
    private double valorSeguro;


    public BagagemFragil(double peso, String descricao, double valorSeguro){
        super(peso, descricao);
        this.valorSeguro = valorSeguro;
    }

    public double getValorSeguro() {
        return valorSeguro;
    }

    public void setValorSeguro(double valorSeguro) {
        this.valorSeguro = valorSeguro;
    }

    @Override
    public double getCusto() {
        if((this.getPeso() - 20) <= 20) return 0;
        return ((this.getPeso() - 20) * Bagagem.getCustoExcedente()*2);

    }
    @Override
    public String toString() {
        return "Bagagem Frágil - " + super.toString() + " - Valor Seguro: " + valorSeguro + " - Custo: R$ " + getCusto();
    }

}
