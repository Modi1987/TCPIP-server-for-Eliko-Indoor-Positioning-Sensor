This is a netbeans program
The program is used to interface with the Eliko indoor-positioning system through the network
The program implements a TCP/IP server that listens on the port 19871, then publishes the
X,Y,Z measurments to the connected client
So to start collecting data, fill the required data in the Textboxes click APPLY then click STREAM, 
The server starts listening on the port, once connection is established, the server starts publishing
the measurments once they are available the message is formatted:

X_Y_Z+char(13)+char(10)

