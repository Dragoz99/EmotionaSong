package ClientES;

import java.util.List;

public abstract class Utente {

    private int id_brano_selezionato;

    public abstract void whoAmI();

    private List<Brano> lista_brani_cercati ;


    // provvisorio
    private void cercaBranoMusicale(String titolo){

    }
    private void cercaBranoMusicale(String autore, int anno){

    }

    private void VisualizzaEmozioniBrano(int id_brano){

    }

    public Utente(){

    }

    public int getIdBrano(){
        return id_brano_selezionato;
    }
    public void setIdBrano(int x){
        id_brano_selezionato = x;
    }




}
