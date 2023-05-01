# cn mo-3 multicasting 
* there is one source and group of destination netwroks 
* the relationship is one to many 
* in this type of communicatoin the souce address is unicast address ,but the destination address is a group of address , a group of one or more destination networks in which there is a least one member interseted in reciving the multicast datagram /packet 
* the group address define the member of the group 
* the routers are changed to muticast routers 
* in muticasting a muticast router may has to send out copies of the datagram /packet to more than one interface 

{image muticasting fig: 21.2 page : 641 }

##### note : 
* they are same router they can be configured as muticast routers or unicast routers or both 

# multicasting vs mutiple unicasting 

* ### muticasting
    * in muticasting  the source generates only one packet /datagram 
    * the packet is duplicated by the routers 
    * all the packets have the same destination address 
    * there is only one copie of the packet /datagram  tarvel between two routers 
* ### mutiple unicasting 
    * in mutiple unicastng the source produces mutiple packets /datagrams
    * the source duplicates the packets as many as there are number of destination host address 
    * the packets have diffent destination address 
    * there are one or more copies of packets tarvel between two routers 
    *  ###### eg : 
        * e-mail  { a person sending a mail to a group of people }

{image muticasting vs mutiple unicasting fig : 21.3 page: 642  }


## Emulation of Multicasting with Unicasting
 
 #### why we need muticasting when we can do mutiple unicasting 
* bandwith 
    * muticasting is more effcient , it requires less bandwidth compared to mutiple unicasting 
    * in mutiple unicasting some of the links have to handle several copis of packet 
* delay in first and last packet 
    * in muliple unicasting as several packets must be created by source there is a delay between packets 
    * in muticasting there is no delay because only one packet is created by the source 

### muticast applicatons 
 * Acces to distributed databases - Mogodb clusters 
 * infonmation disemination - Business can send all same the message to consumers {eg: software update}
 * Teleconferencing - conference call
 * Distance learing - online class 
 

    



