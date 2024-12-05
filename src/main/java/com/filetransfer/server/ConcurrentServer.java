import java.io.*;
import java.net.*;
import java.util.concurrent.*;

public class ConcurrentServer implements Runnable, Serializable {

    //PASAR A ENUMS
    private static final int MAX_THREADS = 10;
    private final int port;
    private ServerSocket serverSocket;
    private ExecutorService pool;

    public ConcurrentServer(int port) throws IOException {
        this.port = port;
        this.serverSocket = new ServerSocket(port);
        this.pool = Executors.newFixedThreadPool(MAX_THREADS);
    }

    @Override
    public void run() {
        try {
            while (true) {
                Socket clientsocket = serverSocket.accept();
                //VER QUE EJECUTAMOS POR HILO. CAMBIAR------------------
                pool.execute(new SimpleServer());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
