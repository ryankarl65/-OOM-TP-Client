import Service.RemoteInterface;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {

    /**
     * @param args arguments of params input
     */
    public static void main(String[] args) {
        try {
            String serverAddress = "localhost";
            Registry registry = LocateRegistry.getRegistry(serverAddress, 18500);
            RemoteInterface remote = (RemoteInterface) registry.lookup("remote");
            System.out.println("je suis connecté à" + serverAddress);
            String say = remote.sayHello();

            double avg = remote.average(2, 3);
            double div = remote.divided(4, 2);
            double mul = remote.multiplied(3, 5);
            double sub = remote.subs(3, 5);
            double add = remote.add(6, 1);

            System.out.println(say + "\n");
            System.out.println(avg + "\n");
            System.out.println(div + "\n");
            System.out.println(mul + "\n");
            System.out.println(sub + "\n");
            System.out.println(add + "\n");

        } catch (RemoteException | NotBoundException ex) {
            System.err.println(ex);
        }
    }
}
