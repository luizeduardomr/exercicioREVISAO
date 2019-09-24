public class BagagemDeMao extends Bagagem {

    public BagagemDeMao(double peso, String descricao){
        super(peso, descricao);
    }

    @Override
    public double getCusto() {
        if(this.getPeso()<5) return 0;
        if(this.getPeso()>=5 && this.getPeso()<=10) return (this.getPeso() -5) *10;
       return (this.getPeso() -5) *20;

    }

    @Override
    public String toString() {
        return "Bagagem De Mão: " + super.toString() + " - Custo: R$ " + getCusto();
    }
}
