#!/usr/bin/env python3
import socket
s=socket.socket(socket.AF_INET,socket.SOCK_STREAM)
s.setsockopt(socket.SOL_SOCKET,socket.SO_REUSEADDR, 1)
s.bind(("",1211))
print("[+] Server Established!")
s.listen(5)
conn,addr=s.accept()
print("[+] Client Connected.")
x=""
while x!=b"Done\n":
 x=conn.recv(1024)
# print(x[2:].decode("utf-8"))
 print("=> "+x[:-1].decode("utf-8"))

