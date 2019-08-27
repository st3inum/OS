import java.net.*;
import java.io.*;
import java.util.Scanner;



class IPmessenger {
	public static void main(String args[]) throws UnknownHostException, IOException {
		System.out.println("1)send");
		System.out.println("2)receive");
		System.out.println("3)exit");
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		if (id == 1) {
			Client client = new Client("127.0.0.1", 5000);
		} else if (id == 2) {
			Server server = new Server(5000);
		} else return;
	}
}