import java.time.LocalDate;

public class Ingresso {
    private double valorrs;
    private String nomeDoEvento;
    private LocalDate data;
    public Ingresso(double valorrs,String nomeDoEvento,LocalDate data){
        this.data=data;
        this.nomeDoEvento=nomeDoEvento;
        this.valorrs=valorrs;
    }
    public void imprimeValor(){
        System.out.println("Valor do ingresso: "+this.valorrs);
    }
    public double getValorrs(){
        return this.valorrs;
    }
    public void imprimeDadosDoEvento(){
        System.out.println("--------------Dados do Evento----------------\n");
        System.out.println("Nome: "+this.nomeDoEvento+"\nData: "+this.data);
        imprimeValor();
    }
}
