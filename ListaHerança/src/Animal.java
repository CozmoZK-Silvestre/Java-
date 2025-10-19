public class Animal{
    //Atributos
    private double peso;
    private String alimento;
    private int idade;
    private double velocidade;
    //Construtor
    public Animal(double peso,String alimento, int idade, double velocidade){
        if(peso >=0){
            this.peso=peso;
        }else{
            this.peso=0;
        }
        this.alimento=alimento;
        this.velocidade=velocidade;
        if(idade>=0){
            this.idade=idade;
        }else{
            this.idade=idade;
        }
    }
    //Getters
    public double getPeso(){
        return this.peso;
    }
    public String getAli(){
        return this.alimento;
    }
    public int getidade(){
        return this.idade;
    }
    public double getVel(){
        return this.velocidade;
    }
    //Métodos
    protected void comer(){
        System.out.println("O animal esta comendo "+this.alimento);
    }
    public void mostrarIdade(){
        System.out.println("Idade do animal:"+this.idade);
    }
    public void mover(){
        this.velocidade+=1;
    }
}