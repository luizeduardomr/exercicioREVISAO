public class AppBagagem {
    public static void main (String args[]){
        ListaDeBagagens lista = new ListaDeBagagens();

        Bagagem mao1 = new BagagemDeMao(3, "Mochila");
        Bagagem mao2 = new BagagemDeMao(5, "Bolsa de viagem");
        Bagagem mao3 = new BagagemDeMao(6, "Malinha");
        Bagagem mao4 = new BagagemDeMao(12, "Mala");

        Bagagem fragil1 = new BagagemFragil(12, "Produtos eletrônicos", 1000);
        Bagagem fragil2 = new BagagemFragil(20, "Caixa de copos de vidro", 800);
        Bagagem fragil3 = new BagagemFragil(240, "Geladeira", 8000);

        Bagagem normal1 = new BagagemNormal(22, "Roupas 1");
        Bagagem normal2 = new BagagemNormal(27, "Roupas 2");
        Bagagem normal3 = new BagagemNormal(24, "Roupas 3");
        Bagagem normal4 = new BagagemNormal(32, "Roupas 4");

        lista.add(mao1);
        lista.add(mao2);
        lista.add(mao3);
        lista.add(mao4);

        lista.add(fragil1);
        lista.add(fragil2);
        lista.add(fragil3);

        lista.add(normal1);
        lista.add(normal2);
        lista.add(normal3);
        lista.add(normal4);

        Bagagem.setCustoExcedente(5);

        System.out.println("Lista de bagagens: ");
        System.out.println(lista);

        System.out.println("Custo total de bagagens de mão: ");
        System.out.println(lista.getCustoTotalBagagensDeMao());

        System.out.println("Lista de bagagens de mão: ");
        System.out.println(lista.getBagagemDeMao());

        System.out.println("\nTotal de bagagens: " + Bagagem.getTotalBagagens());
    }
}
