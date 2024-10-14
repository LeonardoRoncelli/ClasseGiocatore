package giocatori;
public class Giocatore {
    private String nome;
    private boolean capitano;
    private int gol;
    public Giocatore(){
        nome=null;
        capitano=false;
        gol=0;
    }
    public Giocatore(String nome1){
        setNome(nome1);
        capitano=false;
        gol=0;
    }
    public Giocatore(boolean capitano1){
        nome=null;
        setCapitano(capitano1);
        gol=0;
    }
    public Giocatore(int gol1){
        nome=null;
        capitano=false;
        setGol(gol1);
    }
    public Giocatore(String nome1,boolean capitano1,int gol1){
        setNome(nome1);
        setCapitano(capitano1);
        setGol(gol1);
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
    public void setNome(String nome1){
        nome=nome1;
    }
    public void setCapitano(boolean capitano1){
        capitano=capitano1;
    }
    public void setGol(int gol1){
        gol=gol1;
    }
}
