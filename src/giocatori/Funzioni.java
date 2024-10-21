package giocatori;
public class Funzioni {
    public static void aggiunta(Giocatore[] giocatori){
        for(int i=0;i<giocatori.length;i++){
            if(giocatori[i].getCapitano()){
                System.out.println("C'è già un capitano");
                break;
            }
        }
    }
    public static void vosulizza(Giocatore []giocatori){

    }
    public static void modifica(Giocatore[]giocatori,int sceltaGiocatore){

    }
    public static void cinqueGol(Giocatore[]giocatori){
        for(int i=0;i<giocatori.length;i++){
            if(giocatori[i].getGol()>5){
                System.out.println(giocatori[i].getNome());
            }
        }
    }
    public static Giocatore capitano(Giocatore[]giocatori){
        Giocatore capitano = null;
        for(int i=0;i<giocatori.length;i++){
            if(giocatori[i].getCapitano()){
                capitano=giocatori[i];
            }
        }
        return capitano;
    }
}
