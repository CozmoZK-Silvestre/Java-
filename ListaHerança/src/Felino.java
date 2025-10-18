public class Felino extends Animal{
    public Felino(String alimento,int idade, double velocidade, double peso){
        super(peso,alimento,idade,velocidade);
    }
    //Método
    public void ronronar(){
        System.out.println("O felino está ronrronando.");
    }
}