# Collecting Information about Groups

- creating routing table in both unicasting and muticasting is two steps
  1. router needs to know which destination is it connected
     2)and to tranfer the info that is collected in the 1st step to all others routers so that is router knows to which router each other router is connected
- ### in unicasting
  - the 1st step collecton of information is automatic each network knows to which network each router is connected and the prifix of the network
  - the routing protocols (distance vector or link state ) are responible for tranfering of info collected to other routers
- ### in muticasting

  - the 1st step collecton of information is not automatic ,because of two reasons :
    a) which host in the attached network is the member of which group
    b) the membership of a host is not fixed it may change
  - so the router needs the help to collect the info which host in the intface belongs to which group
  - after collecting the info it uses some muticasting protocol to transfer the info to others routers

- ### the advertisement in muticasting and unicasting

  - #### in unicasting there is no need of help for advertisement
    - eg: router R1 connected to there networks n1,n2,n3 => the advertisment is router R1 (I am connected to n1,n2,n3)
  - #### in muticasting it needs the help for advertisment
    - eg: router R2 connnected to there networks n1(with group g1 and g2) n2( g2 g3) n3(g1 and g3) => the advertisment is router R2 (I am interseted in G1 , G2 ,G3)

- in muticasting we need two protocols which
  - one for collecting the pieces of information
  - one for tranfering the collected information
- the collecting information is done using IGMP ( internet group message protocol )


{image usincasing vs muticasting advertisment  page :648  fig : 21.8 }