public class Peixe extends Animal {
    private String caracteristica;
    public Peixe(double peso,String alimento, int idade, double velocidade,String caracteristica){
        super(peso,alimento,idade,velocidade);
        this.caracteristica=caracteristica;
    }
    public String getCaract(){
        return this.caracteristica;
    }
    public void setCaract(String caracteristica){
        if(caracteristica!=null){
            this.caracteristica=caracteristica;
        }
    }
    public void dadosDoPeixe(){
        System.out.println("-------------Peixe--------------\n"+"Peso: "+getPeso());
        System.out.println("Idade: "+getidade()+"\nVelocidade: "+getVel()+"\nCaracteristica: "+this.caracteristica);

    }
}
