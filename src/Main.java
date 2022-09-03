public class Main {
    public static void main(String[] args) {

        Cliente cl = new Cliente(22, "Michael", 3202153939L, 500);
        System.out.println(cl.toString());
        Trabajador tr = new Trabajador(22, "Michael", 3202153939L, 4000L);
        System.out.println(tr.toString());
    }
}