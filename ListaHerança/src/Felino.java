public class Felino extends Animal{
    public Felino(double peso, String alimento,int idade, double velocidade){
        super(peso,alimento,idade,velocidade);
    }
    //Método
    public void ronronar(){
        System.out.println("O felino está ronrronando.");
    }
}