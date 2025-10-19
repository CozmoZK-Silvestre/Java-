import java.time.LocalDate;

public class Normal extends Ingresso{
    public Normal(double valorrs,String nomeDoEvento,LocalDate data){
        super(valorrs,nomeDoEvento,data);
    }
    public void imprimirIngresso(){
        System.out.println("Ingresso Normal");
    }
}
