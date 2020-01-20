// Coded By :: A_Asaker
package client;
import java.io.*;  
import java.net.*;  
import java.util.Scanner;

public class Main{
        public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		try{
			Socket sock=new Socket("",1211);
			System.out.println("[+] Connected.");
			//DataOutputStream data=new DataOutputStream(sock.getOutputStream());  
			PrintWriter sender = new PrintWriter(sock.getOutputStream(), true);
			String d="";
			while(!d.equals("Done")){
				System.out.print(">> ");
				d=input.nextLine();
				sender.print(d+"\n");
				sender.flush();
				//data.writeUTF(d);
				//data.flush();
			}
			sender.close();
			//data.close();  
			sock.close(); 
		}
		catch(Exception e){System.out.println(e);}  
        }
}

