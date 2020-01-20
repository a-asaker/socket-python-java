#!/usr/bin/env python3
# Coded By :: A_Asaker
import socket
s=socket.socket(socket.AF_INET,socket.SOCK_STREAM)
s.connect(("",1211))
print("[+] Connected.")
data=""
while data!="Done":
 data=input(">>")
 s.send(data.encode()+b"\n")
s.close()
