
package elikoclient;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This is a TCPIP client used to acquire the position data from the Eliko_TCPIP_Server
 * program, using sockets.
 * 
 * TO test the programs:
 * **********************
 * 1- Run the project (Eliko_TCPIP_Server) in Netbeans
 * 2- From the (Eliko_TCPIP_Server) interface fill the right data in the white boxes
 * 3- From the (Eliko_TCPIP_Server) interface click APPLY button
 * 4- From the (Eliko_TCPIP_Server) interface click Stream button
 * 5- Run the project (Eliko_TCPIP_Client)
 * 
 * @author Mohammad SAFEEA 19th-september-2017
 */
public class ElikoClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            Socket soc=new Socket("127.0.0.1",19871);
            Scanner scan=new Scanner(soc.getInputStream());
            while(true)
            {
            if(scan.hasNextLine())
                System.out.println(scan.nextLine());
            }
        } catch (IOException ex) {
            Logger.getLogger(ElikoClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
