public class Velho extends Imovel{
    private double desconto;
    public Velho(String endereco,double preco,double desconto){
        super(endereco,(preco-desconto));
        this.desconto=desconto;
    }
    public double getDesconto() {
        return this.desconto;
    }
    public void imprimirDesconto(){
        System.out.println("Desconto: "+this.desconto);
    }
}
