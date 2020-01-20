// Coded By :: A_Asaker
package server;
import java.io.*;  
import java.net.*;  

public class Main{
	public static void main(String[] args){
		try{  
			ServerSocket sock=new ServerSocket(1211); 
			System.out.println("[+] Server Established!"); 
			Socket conn=sock.accept();//establishes connection   
			System.out.println("[+] Client Connected.");
			//DataInputStream data = new DataInputStream(conn.getInputStream())); 
			BufferedReader data = new BufferedReader(new InputStreamReader(conn.getInputStream())); 
			String str_data=""; 
			while(!str_data.equals("Done")){
				str_data=data.readLine();
				//str_data=data.readUTF();
				System.out.println("=> "+str_data);
			}
			sock.close();  
		}
		catch(Exception e){System.out.println(e);}  
	}  
	
}

