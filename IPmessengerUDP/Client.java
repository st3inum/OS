import java.io.*;
import java.net.*;

class Client
{
   public Client(String address,int p) throws SocketException, UnknownHostException, IOException
   {
       BufferedReader inFromUser =
         new BufferedReader(new InputStreamReader(System.in));
       try (DatagramSocket clientSocket = new DatagramSocket()) {
           InetAddress IPAddress = InetAddress.getByName(address);
           byte[] sendData = new byte[1024];
           byte[] receiveData = new byte[1024];
           String sentence = inFromUser.readLine();
           sendData = sentence.getBytes();
           DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, p);
           clientSocket.send(sendPacket);
           DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
           clientSocket.receive(receivePacket);
           String modifiedSentence = new String(receivePacket.getData());
           System.out.println("FROM SERVER:" + modifiedSentence);
       }
   }
}