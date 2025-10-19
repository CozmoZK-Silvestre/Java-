import java.time.LocalDate;

public class Vip extends Ingresso{
    private double adicional;
    public Vip(double valorrs,String nomeDoEvento,LocalDate data,double adicional){
        super(valorrs,nomeDoEvento,data);
        this.adicional=adicional;
    }
    public double valorrsVip(){
        return (adicional+getValorrs());
    }
}
