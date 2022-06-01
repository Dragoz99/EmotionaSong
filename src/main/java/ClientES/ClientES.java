package ClientES;


import ServerES.UserInterface;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ClientES {

    public static void main(String[] args){
        String host = (args.length <1) ? null: args[0];
        try{
            Registry reg  = LocateRegistry.getRegistry(host);
            UserInterface stub = (UserInterface) reg.lookup("");
            String prova = stub.testRmiFun("ciao mondo");
            //--------------------------
            System.out.println(prova);

        }catch(Exception e){
            System.err.println("Client exc: "+ e.toString());
        }
    }
}
