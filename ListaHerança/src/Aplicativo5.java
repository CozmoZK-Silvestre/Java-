import java.time.LocalDate;
public class Aplicativo5 {
    public static void main(String[] args) {
        Ingresso i1=new Ingresso(50, "Cascomadeira", LocalDate.of(2025,10,17));
        Vip i2=new Vip(500, "Binks no sake",LocalDate.of(2025,02,17), 200);
        CamaroteSuperior i3=new CamaroteSuperior(500, "Binks no Sake",LocalDate.of(2025,12,03),200,"A2",100);
        Normal i4=new Normal(1200, "Crossworlds", LocalDate.of(2025,9,04));
        i1.imprimeDadosDoEvento();
        System.out.println(i2.valorrsVip()); 
        i3.imprimeLocalizacao();
        i4.imprimirIngresso();

    }
}
