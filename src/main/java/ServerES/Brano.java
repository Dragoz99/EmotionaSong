package ServerES;

import java.io.Serializable;

public class Brano implements Serializable {
    private String titolo;
    private String album;
    private String genere;
    private int anno;
    private String autore;
    private String durata;
    private int id_brano;


    public Brano(){

    }
    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public int getId() {
        return id_brano;
    }

    public void setId(int id_brano) {
        this.id_brano = id_brano;
    }

    public String getDurata() {
        return durata;
    }

    public void setDurata(String durata) {
        this.durata = durata;
    }
}
