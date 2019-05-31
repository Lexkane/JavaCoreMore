import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class My implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder s = new StringBuilder() ;
//		s = new StringBuilder(br.readLine());
		s.replace(0, s.length(), br.readLine()) ;
	}
	
	

}
