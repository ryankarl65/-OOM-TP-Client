package Service;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RemoteInterface extends Remote {
    String sayHello() throws RemoteException;

    double average(int a, int b) throws RemoteException;

    double divided(int a, int b) throws RemoteException;

    double multiplied(int a, int b) throws RemoteException;

    double subs(int a, int b) throws RemoteException;

    double add(int a, int b) throws RemoteException;

}