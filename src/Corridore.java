import java.util.ArrayList;

public class Corridore extends Thread{
    private String nome;
    public static ArrayList<String> podio = new ArrayList<>();

    public Corridore(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void run(){
        for(int i = 0; i < 100; i++){
            System.out.println(this.nome +" "+ (i+1) + " metri");
            if(i == 99){
                System.out.println("Il corridore "+this.nome+" e' arrivato");
                podio.add(this.nome);
            }
        }
        System.out.println(podio);
    }
}
