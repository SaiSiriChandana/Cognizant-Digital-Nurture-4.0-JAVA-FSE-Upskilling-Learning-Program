import java.io.*;
import java.net.*;

public class ChatServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(1234);
        System.out.println("Server started. Waiting for client...");
        Socket socket = serverSocket.accept();
        System.out.println("Client connected.");

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

        String line;
        while (!(line = in.readLine()).equalsIgnoreCase("exit")) {
            System.out.println("Client: " + line);
            System.out.print("Server: ");
            out.println(userInput.readLine());
        }

        socket.close();
        serverSocket.close();
    }
}
