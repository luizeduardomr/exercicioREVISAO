public class BagagemNormal extends Bagagem {

    public BagagemNormal(double peso, String descricao){
        super(peso, descricao);
    }


    @Override
    public double getCusto() {
        if ((super.getPeso()-20)<=0) return 0;
        return (super.getPeso()-20)*Bagagem.getCustoExcedente();
    }

    @Override
    public String toString() {
        return "Bagagem Normal - " + super.toString() + " - Custo: R$ " + getCusto();
    }
}
