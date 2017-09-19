%% Mohammad SAFEEA 19th-9-2017

% This script is a MATLAB client that is used with the program
% Eliko_TCPIP_CLient.
% This program establishes a TCPIP connection to the server, then it prints
% the received position of the Eliko Tag in matlab concole.

close all; clear all; clc;

ip='172.31.15.15'; % IP of the Eliko server machine
port=19871; % port of the server

global x;
%% Open the connection
t=tcpip(ip,port,'NetworkRole','Client');
t.Terminator=char(13);
fopen(t); % connect

%% A loop for reading the position of the tag, through the TCPIP network
s=[]; % X_Y_Z position measurments
while true % the loop runs for ever, to turn off the script press (Ctrl+C)
	x=fread(t,1,'int8');
	if (x==44) % 44 is ascii of ','
        s=[s,char(x)];
    elseif(x==46) % 46 is ascii of '.'
        s=[s,char(x)];
     elseif(x==95) % 95 is ascii of '_'
        s=[s,char(x)];
    elseif((x<58) && (x>47)) % integers in interval [48,57] are the ascii of '0 up to 9'
        s=[s,char(x)];
    else
        fprintf(s); % print position of eliko tag in the console,
        % position is printed as X_Y_Z
        fprintf('\n'); % print new line
        s=[]; 
    end 
end
