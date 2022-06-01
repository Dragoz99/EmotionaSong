package ClientES;

public class Registrato extends Utente {
    private String nome;
    private String cognome;
    private String cf;
    private String indirizzo_fisico;
    private String email;
    private String userId;
    private String passwd;
    private int id_playlist_selezionata;
    private int id_brano_selezionato;


    public Registrato(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getCf() {
        return cf;
    }

    public void setCf(String cf) {
        this.cf = cf;
    }

    public String getIndirizzo_fisico() {
        return indirizzo_fisico;
    }

    public void setIndirizzo_fisico(String indirizzo_fisico) {
        this.indirizzo_fisico = indirizzo_fisico;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public int getId_playlist_selezionata() {
        return id_playlist_selezionata;
    }

    public void setId_playlist_selezionata(int id_playlist_selezionata) {
        this.id_playlist_selezionata = id_playlist_selezionata;
    }

    public int getId_brano_selezionato() {
        return id_brano_selezionato;
    }

    public void setId_brano_selezionato(int id_brano_selezionato) {
        this.id_brano_selezionato = id_brano_selezionato;
    }

    @Override
    public void whoAmI() {

    }




    public void VisualizzaPlayList(String nomePlaylist){

    }
    public void registraPlayList(String nomePlaylist){

    }

    public void visualizzaCanzoniPlaylist(int idPlaList) {

    }

    public void insericiEmozioniBrano(){    //?????????
        // + inserisciEmozioniBrano(emo1: Array[String])
    }

    public void logOut(){

    }
    public void selezionaBranoPlaylist(int id_brano){

    }

    public void eliminaBranoPlaylist(int id_brano){

    }

    public void inserisciBranoPlaylist(int id_playlist){

    }




}
