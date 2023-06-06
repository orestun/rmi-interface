package org.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Decomposition extends Remote {
    float[][] getSecondPartOfExpression(float[][] Y2, float[][] Y1, float[][] transposedY2, float[][] Y3) throws RemoteException;
}
