package giocatori;
import java.util.Scanner;
public class TestGiocatore {
    public static void main(String[] args) {
        int scelta;
        Scanner input=new Scanner (System.in);
        int nGiocatori;
        System.out.println("Inserisci il numero dei giocatori");
        nGiocatori= input.nextInt();
        Giocatore[]giocatori=new Giocatore[nGiocatori];
        for(int i=0;i<giocatori.length;i++){
            giocatori[i]=new Giocatore();
        }
        System.out.println("Inserisci la scelta");
        scelta= input.nextInt();
        switch(scelta){
            case 1:{
                giocatori[0]=new Giocatore();
                giocatori[0].setNome(input.next());
                Funzioni.aggiunta(giocatori);
                break;
            }
            case 2:{
                for(int i=0;i<giocatori.length;i++){
                    System.out.println(giocatori[i].getNome());
                    System.out.println(giocatori[i].getCapitano());
                    System.out.println(giocatori[i].getGol());
                }
                break;
            }
            case 3:{
                int sceltaGiocatore;
                System.out.println("Inserisci il numero del giocatore da modificare");
                sceltaGiocatore= input.nextInt();
                giocatori[sceltaGiocatore].setNome(input.next());
                if(giocatori[sceltaGiocatore].getCapitano()) {
                    giocatori[sceltaGiocatore].setCapitano(false);
                }
                giocatori[sceltaGiocatore].setGol(input.nextInt());
                Funzioni.modifica(giocatori,sceltaGiocatore);
                break;
            }
            case 4:{
                int cancella;
                System.out.println("Inserisci il giocatore da cancellare");
                cancella= input.nextInt();
                //da completare
                break;
            }
            case 5:{
                for(int i=0;i<giocatori.length;i++){
                    if(giocatori[i].getGol()>5){
                        System.out.println(giocatori[i].getNome());
                    }
                }
                break;
            }
            case 6:{
                for(int i=0;i<giocatori.length;i++){
                    if(giocatori[i].getCapitano()){
                        System.out.println("Il capitano si chiama:"+giocatori[i].getNome());
                    }
                }
                break;
            }
        }
    }
}