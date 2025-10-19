import java.time.LocalDate;

public class CamaroteSuperior extends Vip{
    private String localizacaoIngresso;
    private double adicionalPlus;
    public CamaroteSuperior(double valorrs,String nomeDoEvento,LocalDate data,double adicional,String localizacaoIngresso,double adicionalPlus){
        super(valorrs,nomeDoEvento,data,adicional);
        this.localizacaoIngresso=localizacaoIngresso;
        this.adicionalPlus=adicionalPlus;
    }
    public String getLocalizacaoIngresso() {
        return this.localizacaoIngresso;
    }
    public void imprimeLocalizacao(){
        System.out.println("Localizacao: "+this.localizacaoIngresso);
    }
    public double valorrsSuperior(){
        return this.adicionalPlus+valorrsVip();
    }
}
