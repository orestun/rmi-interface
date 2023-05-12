package org.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Decomposition extends Remote {
    float[][] getSecondPartOfExpression(float[][] Y3, float[][] Y1, float[][] transposedY1) throws RemoteException;
}
