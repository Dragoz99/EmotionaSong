package ServerES;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface UserInterface  extends Remote {

    void registrazione() throws RemoteException;
    boolean verify(String email, String passwd) throws RemoteException;
    List<Brano> cercaBranoMusicale(String titolo) throws RemoteException;
    List<Brano> cercaBranoMusicale(String autore,int anno) throws RemoteException;
    Valutazioni visualizzaEmozioni(int id_brano) throws RemoteException;
    List<String> visualizzaNote(int id_brano) throws RemoteException;
    boolean registraPlaylist(String nome, String userId) throws RemoteException;
    boolean inserisciBranoPlaylist(int idPlaylist, int idBrano) throws RemoteException;
    boolean eliminaBranoPlaylist(int idPlayList, int idBrano) throws RemoteException;
    boolean inserisciValutazione(Valutazioni a) throws RemoteException;
    String[] visualizzaNomiPlaylist(int idUser) throws RemoteException;
    String[] visualizzaIdPlaylist(int idUser) throws RemoteException;
    String[] visualizzaNomiCanzoni(int idPlaylist) throws RemoteException;
    String[] visualizzaidCanzoni(int idPlaylist) throws RemoteException;
    String[] getNomiPlaylist(int idUser) throws RemoteException;
    String[] getIdPlaylist(int idUser) throws RemoteException;


}
