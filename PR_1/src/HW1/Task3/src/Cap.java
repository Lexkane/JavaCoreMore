
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cap {

	public static void main(String[] args) throws IOException {
		

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
				System.out.println("What is your name?");
				String name = br.readLine();
				System.out.println("Where are you live," + name + "?");
				String address = br.readLine();
				System.out.println(name + " you are live at " + address + " st.");
				System.out.println("-Your Cap)");

	}

}
