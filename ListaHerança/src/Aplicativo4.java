public class Aplicativo4 {
    public static void main(String[] args) {
        Imovel I1=new Imovel("Rua Santoro",40300);
        Novo I2=new Novo("Rua Santoro", 40300, 200);
        Velho I3=new Velho("Rua Santoro",40300,10000);
        I1.imprimirPreco();
        I2.imprimirAdicional();
        I2.imprimirPreco();
        I3.imprimirDesconto();
        I3.imprimirPreco();
    }
}
