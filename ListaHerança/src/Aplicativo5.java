import java.time.LocalDate;
public class Aplicativo5 {
    public static void main(String[] args) {
        Ingresso i1=new Ingresso(50, "Cascomadeira", LocalDate.of(2025,10,17));
        i1.imprimeDadosDoEvento();
    }
}
