public class Gato extends Felino{
    private String raca;
    public Gato(double peso,String alimento, int idade, double velocidade,String raca){
        super(peso,alimento,idade,velocidade);
        this.raca=raca;
    }
    public void miar(){
        System.out.println("Miauuuuuuuuuuuuuuuuu");
    }
}