package nl.soccar.rmi.interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;
import nl.soccar.library.enumeration.BallType;
import nl.soccar.library.enumeration.Duration;
import nl.soccar.library.enumeration.MapType;

/**
 * Interface that specifies the methods that make it possible for a Main server
 * to communicate with the Game server through RMI-communication.
 *
 * @author PTS34A
 */
public interface IGameServerForMainServer extends Remote {

    /**
     * Creates a new game session on the remote Game Server.
     *
     * @param name The roomname of the session that is being created.
     * @param password The password of the session that is being created.
     * @param hostName The username of the player that created the session.
     * @param capacity The player capacity of the session that is being created.
     * @param duration The game duration of the session that is being created.
     * @param mapType The maptype of the session that is being created.
     * @param ballType The balltype of the session that is being created.
     * @return True if the session is created successfully.
     * @throws RemoteException Thrown when a communication error occurs during
     * the remote call of this method.
     */
    boolean createSession(String name, String password, String hostName, int capacity, Duration duration, MapType mapType, BallType ballType) throws RemoteException;

    
    /**
     * Gets the amount of free memory in the Java Virtual Machine.
     * 
     * @return The amount free memory measured in bytes.
     * @throws RemoteException Thrown when a communication error occurs during
     * the remote call of this method.
     */
    int getAvailableMemory() throws RemoteException;
    
}
