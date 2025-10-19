public class Imovel {
    private String endereco;
    private double preco;
    public Imovel(String endereco,double preco){
        this.endereco=endereco;
        this.preco=preco;
    }
    public double getPreco(){
        return this.preco;
    }
    public void imprimirPreco(){
        System.out.println("Preco: "+this.preco);
    }
}
