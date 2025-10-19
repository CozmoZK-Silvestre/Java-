import java.time.LocalDate;

public class CamaroteInferior extends Vip{
    private String localizacaoIngresso;
    public CamaroteInferior(double valorrs,String nomeDoEvento,LocalDate data,double adicional,String localizacaoIngresso){
        super(valorrs,nomeDoEvento,data,adicional);
        this.localizacaoIngresso=localizacaoIngresso;
    }
    public String getLocalizacaoIngresso() {
        return this.localizacaoIngresso;
    }
    public void imprimeLocalizacao(){
        System.out.println("Localizacao: "+this.localizacaoIngresso);
    }
}
