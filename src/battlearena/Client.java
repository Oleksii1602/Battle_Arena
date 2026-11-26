package battlearena;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    private final String host;
    private final int port;

    public Client(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public boolean sendResult(MatchResult result) {
        try (Socket socket = new Socket(host, port);
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true)) {
            out.println(result.toFileLine());
            return !out.checkError();
        } catch (IOException e) {
            System.out.println("Could not send the match results: " + e.getMessage());
            return false;
        }
    }
}
