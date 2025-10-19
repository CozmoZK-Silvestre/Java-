public class aplicativo2{
    public static void main(String[] args) {
        Cachorro a1=new Cachorro(20,"Osso",4,2,"Casa");
        a1.comer();
        Lobo l1=new Lobo(20,"Ovelha",10,30,"caverna");
        Onca o1=new Onca(30,"Gazela",45,40);
        Gato g1=new Gato(17, "Peixe", 5, 10, "whisky");
        l1.comer();
        l1.mostrarIdade();
        o1.ronronar();
        g1.miar();
        o1.rosnar();
        a1.latir();
        a1.alimentar();
        l1.uivar();
    }
}