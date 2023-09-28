package com.ttipl.utility;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetworkUtility {
	
	 public static String IPAddress() {
		 String hostAddress = "";
		 try {
			InetAddress localHost = InetAddress.getLocalHost();
			hostAddress = localHost.getHostAddress();
			if(hostAddress!=null && !hostAddress.isEmpty()) {
				 return hostAddress ;
			} 		
			
		} catch (UnknownHostException e) {			 
			e.printStackTrace();
		}		 
		 return hostAddress ;
	 }
	 
}
