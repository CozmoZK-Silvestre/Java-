public class Cachorro extends Canino{
    public Cachorro(double peso, String alimento, int idade,double velocidade,String habitat){
        super(peso,alimento,idade,velocidade,habitat);
    }
    public void alimentar(){
        System.out.println("O animal esta comendo");
    }
    public void latir(){
        System.out.println("AU AU AU AU AU AU!!!!!!");
    }
}