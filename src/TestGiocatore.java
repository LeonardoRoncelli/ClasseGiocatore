import java.util.Random;
import java.util.Scanner;
public class TestGiocatore {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int scelta;
        int nGiocatori;
        System.out.println("Inserisci il numero dei giocatori");
        nGiocatori= input.nextInt();
        Giocatore[]giocatori=new Giocatore[nGiocatori];
        for(int i=0;i<giocatori.length;i++){
            giocatori[i]=new Giocatore();
        }
        System.out.println("1 - aggiungere un giocatore alla squadra, controllando che non ci sia più di un capitano");
        System.out.println("2 - visualizzare tutti i giocatori della squadra");
        System.out.println("3 - modificare i dati di un giocatore a scelta");
        System.out.println("4 - cancellare un giocatore dalla squadra");
        System.out.println("5 - visualizzare i giocatori che hanno realizzato più di 5 goal.");
        System.out.println("6 - visualizzare il nome del capitano");
        System.out.println("7 - assegnare il ruolo di capitano in modo casuale se non ancora presente");
        System.out.println("Inserisci la scelta");
        scelta=input.nextInt();
        switch(scelta){
            case 1:{
                for(int i=0;i<giocatori.length;i++){
                    if(giocatori[i].getCapitano()){
                        System.out.println("C'è già un capitano");
                        break;
                    }
                    else{
                        giocatori[0]=new Giocatore();
                        giocatori[0].setNome(input.next());
                    }
                }
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
                    System.out.println(giocatori[i].getNome());
                    }
                break;
                }
            }
        }
    }