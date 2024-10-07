public class Giocatore {
    private String nome;
    private boolean capitano;
    private int gol;
    public Giocatore(){
        nome=null;
        capitano=false;
        gol=0;
    }
    public String getNome (){
        return nome;
    }
    public boolean getCapitano(){
        return capitano;
    }
    public int getGol(){
        return gol;
    }
}
