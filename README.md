# This is a TCPIP client/server programs for acquiring position data from Eliko sensors.
 
 * Eliko: is an indoor positioning system, it implements four fixed anchors and tags, 
 * using this system the utilizer can acquire the position data of the tag 
 * (attached to a moving object). For data acquisition the anchors or tags 
 * are connected to the computer through a USB port, due to length limitation of
 * USB cables, this makes it impossible to acquire position data from a remote 
 * station.
  
 * In this package you find the following three projects:
 
 # 1- Eliko_TCPIP_Server:
 * This is a netbeans project, it is used to aquire data from the Eliko system 
 * using the USB, then analyze the raw data to get the position, then it relays the
 * position into a client through TCPIP connection. 
  
 * In such a way the user can acquire the position of the tag in a remote computer
 * using Wifi or Ethernet connection.
  
 * The position message is relayed through the network as a string with the format:
 * "Xposition_Yposition_Zposition\n"
 
 * The XYZ position are in meters.
  
 * This project requires the (java-simple-serial-connector) to be added to the netbeans.
 * To do this, download the librarry, available online.
 * Then from the meneu bar of the netbeans, go to (Tools) then choose (Libraries)
 * Add jssc librarry as (JSSC in capitals).
  
 # 2- Eliko_TCPIP_Client:
 * This is a netbeans project, it is used to read the position data published by the server
 * Eliko_TCPIP_Server.
  
  # 3- MATLAB_TCPIP_Client:
 * This is a matlab script, it is used to read the position data published by the server
 * Eliko_TCPIP_Server.
 
 # To test the programs:
 
 # a) At th server machine (connected to the eliko system)
 * 1- Run the project (Eliko_TCPIP_Server) in Netbeans
 * 2- From the (Eliko_TCPIP_Server) interface fill the right data in the white boxes
 * 3- From the (Eliko_TCPIP_Server) interface click APPLY button
 * 4- From the (Eliko_TCPIP_Server) interface click Stream button
 
 
 # b) At th client machine (where the data are to be sent)
 *******************************************************
 * Make sure, that the client and the server machines are connected through ethernet.
 
 * Make sure that the (ip) of the client is the same as (ip) of the server machine 
   where the eliko is connected
 
 * Make sure that the (port) of the client is the same as (port) of the server machine 
    where the eliko is connected
 
 * Run the project (Eliko_TCPIP_Client) in netbeans, or Matlab_TCPIP_Client in Matlab.
 
