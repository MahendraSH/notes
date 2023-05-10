# Delivery at Data-Link Layer
* in muticasting the packet is devlivery at the intrnet level is done using network layer mulicast address (ip address alocated for mutlicasting    )
* but at data-link layer the multicast address are needed for devlivery of the packet encapsulated in the frame 
* in unicasting the corossponding mac address for the ip is found using ARP
* but in muticasting the ARP cannot find the MAC address  to forward a muticast address packet 

``` main point is as we have mulicast address at network layer then we have some 
  thing at data-link layer for forwarding it 

  there are two types 
  1) muticast pysical address 
  2) and not supported for muticasting 
  
  ```
#### the forwarding of muticast paket throught the data-link depends on weather the underlying data-link layer supports physical  muticast address or not    

### network with muticast support 
* most LAN`s support the muticast address 
* mac address or ethernet-address is use for muticasting here 
* mac address in TCP/IP contains 48bits in which 25bits are use and are same for all 01:00:5E the reaming 23 bits are used for to idenfiy muticast address 
* the in 28bit of multicast address the 5 bits are unused the 23 bits are use which is use by reouter and maps to 23 bits of mac address by adding 01:00:5E
* the range of 
 *An Ethernet multicast physical address is in the range         :--------------------------- ``` 01:00:5E:00:00:00 to 01:00:5E:7F:FF:FF. ```

### network without muticast support 
* most WAN`s don`t support the muticast address 
* so the packet send using tunneling 
* tunneling : 
  * the muticast packet is encapsulated in a unicast packet 


### Question on converting multicast address to mac address (ethernet address )
### Q1) 232.43.14.7
#### steps 

* given ip address must be in the range of muticast address  (224 .0.0.0/24 to 239.255.255.255/24)
*  take ip address last three  bytes  convent to hexadecimal remove 8 from the right most if it is grater then or equal to 8 
  * eg : 232.43.14.7 =>> 2B.0E.07
* the result is added with the 01.00.5E+3bytes 
  eg :  01.00.5E.2B.0E.07

### Q2) 238.212.24.9 

### steps 
1) ip address in muticast address range 
2) 212.24.9 =>> D4.18.09 -8 =>> 54.18.09
3) result =01.00.5E.54.18.09







