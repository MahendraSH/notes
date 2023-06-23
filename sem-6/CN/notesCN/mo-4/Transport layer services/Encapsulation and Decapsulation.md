# Encapsulation and Decapsulation

- when the process what to send the message form one process to another , the trasnport layer protocol encapulation and decapsulation the message
- enacpuslation happens at the sender site , when a process has a message to send , it passes the message to the tarsprot layer wtth a pair of socket address and some other informations , the transprot layer takes the message and addes the message with trasport layer header . The packet at trasprot layer is called
  `user datagram ,segement or packet`
- the decapsulation occurs at the reciver side , when packet arives at the destination transprot layer ,the header is droped and the message is passed to the process running in appication layer with senders socket address
