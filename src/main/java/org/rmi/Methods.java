package org.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Methods extends Remote {
    int sum(int a, int b) throws RemoteException;
}
