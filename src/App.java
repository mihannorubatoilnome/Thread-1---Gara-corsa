public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Pronti Partenza ... VIA!");

        Corridore c1 = new Corridore("Giovanni");
        Corridore c2 = new Corridore("Giuseppe");
        Corridore c3 = new Corridore("Claudio");
        Corridore c4 = new Corridore("Marco");

        c1.start();
        c2.start();
        c3.start();
        c4.start();

        c1.join();
        c2.join();
        c3.join();
        c4.join();
        
        System.out.println("Gara FINITA!");
    }
}
