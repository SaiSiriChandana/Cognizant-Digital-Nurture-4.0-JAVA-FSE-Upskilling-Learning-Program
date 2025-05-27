import java.io.*;
import java.net.*;

public class ChatClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 1234);

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

        String line;
        while (true) {
            System.out.print("Client: ");
            line = userInput.readLine();
            out.println(line);
            if (line.equalsIgnoreCase("exit")) break;
            System.out.println("Server: " + in.readLine());
        }

        socket.close();
    }
}
