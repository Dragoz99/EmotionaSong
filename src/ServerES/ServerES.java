package ServerES;

import java.rmi.RemoteException;
import java.util.List;

public class ServerES implements UserInterface{
    @Override
    public void registrazione() throws RemoteException {

    }

    @Override
    public boolean verify(String email, String passwd) throws RemoteException {
        return false;
    }

    @Override
    public List<Brano> cercaBranoMusicale(String titolo) throws RemoteException {
        return null;
    }

    @Override
    public List<Brano> cercaBranoMusicale(String autore, int anno) throws RemoteException {
        return null;
    }

    @Override
    public Valutazioni visualizzaEmozioni(int id_brano) throws RemoteException {
        return null;
    }

    @Override
    public List<String> visualizzaNote(int id_brano) throws RemoteException {
        return null;
    }

    @Override
    public boolean registraPlaylist(String nome, String userId) throws RemoteException {
        return false;
    }

    @Override
    public boolean inserisciBranoPlaylist(int idPlaylist, int idBrano) throws RemoteException {
        return false;
    }

    @Override
    public boolean eliminaBranoPlaylist(int idPlayList, int idBrano) throws RemoteException {
        return false;
    }

    @Override
    public String[] visualizzaNomiPlaylist(int idUser) throws RemoteException {
        return new String[0];
    }

    @Override
    public String[] visualizzaIdPlaylist(int idUser) throws RemoteException {
        return new String[0];
    }

    @Override
    public String[] visualizzaNomiCanzoni(int idPlaylist) throws RemoteException {
        return new String[0];
    }

    @Override
    public String[] visualizzaidCanzoni(int idPlaylist) throws RemoteException {
        return new String[0];
    }

    @Override
    public String[] getNomiPlaylist(int idUser) throws RemoteException {
        return new String[0];
    }

    @Override
    public String[] getIdPlaylist(int idUser) throws RemoteException {
        return new String[0];
    }

    @Override
    public boolean inserisciValutazione(Valutazioni a) throws RemoteException {
        return false;
    }
}
