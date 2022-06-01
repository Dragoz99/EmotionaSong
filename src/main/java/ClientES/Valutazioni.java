package ClientES;

import java.io.Serializable;

public class Valutazioni implements Serializable {
    private Emozioni[] arrayEmozioni;
    private int id_brano;

    //=========================================
    public Valutazioni(){

    }
    //=========================================

    public Emozioni[] getArrayEmozioni() {
        return arrayEmozioni;
    }

    public void setArrayEmozioni(Emozioni[] arrayEmozioni) {
        this.arrayEmozioni = arrayEmozioni;
    }

    public int getId_brano() {
        return id_brano;
    }

    public void setId_brano(int id_brano) {
        this.id_brano = id_brano;
    }
}
