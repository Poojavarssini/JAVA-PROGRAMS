package advance;

import java.io.*;
import java.net.*;

public class PingServer{
	public static void main(String args[]) {
		try {
			String str;
			System.out.println("Enter IP address/Domain name: ");
			BufferedReader buf1 = new BufferedReader(new InputStreamReader(System.in));
			String ip = buf1.readLine();
			Runtime rt = Runtime.getRuntime();
			Process p = rt.exec("ping "+ ip);
			InputStream in = p.getInputStream();
			BufferedReader buf2 = new BufferedReader(new InputStreamReader(System.in));
			while((str = buf2.readLine()) != null) {
				System.out.println(" "+str);
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
