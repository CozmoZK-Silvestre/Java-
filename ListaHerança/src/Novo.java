public class Novo extends Imovel {
    private double adicional;
    public Novo(String endereco,double preco, double adicional){
        super(endereco,(preco+adicional));
        this.adicional=adicional;
    }
    public double getAdicional() {
        return this.adicional;
    }
    public void imprimirAdicional(){
        System.out.println("Adicional: "+this.adicional);
    }
}
