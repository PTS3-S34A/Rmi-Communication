package nl.soccar.rmi.interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;
import nl.soccar.library.SessionData;

/**
 * Interface that specifies the methods that make it possible for a Game server
 * to communicate with the Main server through RMI-communication.
 *
 * @author PTS34A
 */
public interface IMainServerForGameServer extends Remote {

    /**
     * Notifies the Main server when a new game server is registered.
     *
     * @param gameServer The game server that is registered at the Main server.
     * @throws RemoteException Thrown when a communication error occurs during
     * the remote call of this method.
     */
    void register(IGameServerForMainServer gameServer) throws RemoteException;

    /**
     * Notifies the Main server when a game server is deregistered.
     *
     * @param gameServer The game server that is deregistered at the Main
     * server.
     * @throws RemoteException Thrown when a communication error occurs during
     * the remote call of this method.
     */
    void deregister(IGameServerForMainServer gameServer) throws RemoteException;

    /**
     * Notifies the Main server when new session is created on a Game server.
     *
     * @param gamsServer The game server on which the session is created.
     * @param sessionData The data of the session that is created.
     * @throws RemoteException Thrown when a communication error occurs during
     * the remote call of this method.
     */
    void sessionCreated(IGameServerForMainServer gamsServer, SessionData sessionData) throws RemoteException;

    /**
     * Notifies the Main server when a session is terminated on a Game server.
     *
     * @param gameServer The game server on which the session is hosted.
     * @param sessionData The data of the session that is terminated.
     * @throws RemoteException Thrown when a communication error occurs during
     * the remote call of this method.
     */
    void sessionDestroyed(IGameServerForMainServer gameServer, SessionData sessionData) throws RemoteException;

    /**
     * Adds a given amount of goals to the given player stored in the
     * persistency service.
     *
     * @param username The username of the player whose amount of goals needs to
     * be increased.
     * @param goals The amount of goals that need to be added to the player.
     * @throws RemoteException Thrown when a communication error occurs during
     * the remote call of this method.
     */
    void addGoals(String username, int goals) throws RemoteException;

    /**
     * Adds a given amount of assists to the given player stored in the
     * persistency service.
     *
     * @param username The username of the player whose amount of assists needs
     * to be increased.
     * @param assists The amount of assists that need to be added to the player.
     * @throws RemoteException Thrown when a communication error occurs during
     * the remote call of this method.
     */
    void addAssists(String username, int assists) throws RemoteException;

    /**
     * Increments the amount of games won by a player stored in the persistency
     * service.
     *
     * @param username The username of the player whose amount of won games
     * needs to be incremented.
     * @throws RemoteException Thrown when a communication error occurs during
     * the remote call of this method.
     */
    void incrementGamesWon(String username) throws RemoteException;

    /**
     * Increments the amount of games lost by a player stored in the persistency
     * service.
     *
     * @param username The username of the player whose amount of lost games
     * needs to be incremented.
     * @throws RemoteException Thrown when a communication error occurs during
     * the remote call of this method.
     */
    void incrementGamesLost(String username) throws RemoteException;

    /**
     * Increments the amount of games played by a player stored in the
     * persistency service.
     *
     * @param username The username of the player whose amount of played games
     * needs to be incremented.
     * @throws RemoteException Thrown when a communication error occurs during
     * the remote call of this method.
     */
    void incrementGamesPlayed(String username) throws RemoteException;

}
