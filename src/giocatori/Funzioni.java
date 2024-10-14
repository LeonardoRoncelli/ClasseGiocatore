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
}
