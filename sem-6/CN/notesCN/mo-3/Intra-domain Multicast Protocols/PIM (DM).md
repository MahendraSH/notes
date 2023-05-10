# PIM (DM)

- ### intro :

  - protocol independent muticast (PIM)
  - does not depend on weather the network uses distance vector or link state protocol for unicasting
  - there are two types based on the number of members
  - PIM -DM --dense mode (the number of router are less and member active vary large number)
  - PIM -SM --sparse mode (the number of member are spared somewhere in the internet )

- ### PIM (DM) (protocol independent muticast - dense mode )

  - #### intro

    - when the number of router is less and the number of members in each netwrok are much more then larger then the number of routers this is called the PIM (DM)
    - simlar to DVMRP but uses only RPF and RPM
    - the forwarding is not suspended till the first sub tree is formed

- ### Steps two

  - #### step 1

    - the router that revives the muticast paket form the source S to a group G
    - it uses RPF stategy , to avoid reciving the duplicate packet it see the underling router table of unicasting 
    - if the packet has not arrived from the next router in the reverse dirction it discads the packet and sends the  prune message to stop receving  the packet related to 
    (S, G)
  - #### step 2 
    
    - the router if the packet has arrived from the next router then the packet is broudcast from all the interfaces accept the intreface from which the packet was revived 
    - if the router that recives the packet does not need the packet sends a prune message converting the brodcasting to muticasting 
    - in this it assumes that most of the networks are intrested in the group packet 
    - and the second message is muticasted as the infomation has arrived using prune message 

    {image PIM (DM) page : 656 figure : Figure 21.14}
    