# DVMRP ( Distance vector muticast routing protocol)

- ### intro:

  - it is an extention of Routing information protocol (RIP) which is used in unicast routing
  - uses source based muticasting routing apporch
  - each router in the protocol use the three steps to sitmutate the creation of optimal routing tree for it

- ### steps in creating a optimal routing tree by router are:

  - RPF (reverse path forwarding ) algo for stimaulate the creation of optimal source tree between the source and itself
  - RPB (reverse path broudcasting) algo to create scanning (broadcasting) the tree in which the router itself is the root and all other networks in the internet are the leaves of the tree
  - RPM (reverse path muticasting ) algo to create a muticast tree by cutting the branches to the networks with no member in the group

- ### RPF (reverse path forwarding)

  - forces the router to forward the packet from only one interface : the one that has come form the shortest path from the source to the router
  - if the router does not have the shortes routing tree ,it uses the first property of shortest path
    if A TO B is shortest path then B to A is shortest path from B , the router pretends to send a message in the reverse path using the router table to the next router and the router uses this information to accept the packet only if the routing packet arrives from this interface
  - the same routing packet may arrive to the same router leading to duplicates in the network
  - this can be prevented using tag but RPF is simple

- ### RPB (reverse path broudcasting)

  - reverse path broudcasting helps the router to forward only one copy of the packet recived from the source and descards the rest
  - there broudcasting means destinations are all the networks (all LANs)
  - only one packet is forwarded to a network
  - if a network is connect to two or more router the packet is only forwarded to one router called as `desinated router or parent router `
  - parent router is choose among the router using -one of the methods
  - select the router based on shortest path
  - select based on smallest ip address of the router
  - RPB creates a shortest path tree from the graph formed in 1st step using RPF
  - it removes the cycle paths from the graphs and convert it into a shortest path tree

- ### RPM(reverse path muticasting)

  - RPB doesnot muticast but brodcast to all the networks ,including the networks which donot have the active group member
  - RPM it on formads the packet to the network that contains at least one active member of the group
  - it converts the brocast shortest path tree to muticast shoretest path tree
  - convertiion is done from buttom to up
  - router desnated for the for each netwrok in the leaves of the tree check for the active member of the group using protocol like IGMP
  - this infomation is tranmited to upwords using reverse shortest path tree from router to source by this router comes to know which interface to we transmeted only
  - this infomation is tramited priodically if a new member is added to the same group or a member left the group
  - only member containing networks or networks that are intermidiate for network containg members recive the muticast packet

  {image RPF versus RPB page :652 Figure 21.11 }
  {image RPB versus RPM page :653 Figure 21.12}

  ———————————————––––•°²”””””“““”“‶″‟„_⁗‷‴%‰‣☆_‱‰⁖⁞⁛⁙⁑⁜※⁂⁙⁖⁚⁐⁔‿⁀⁁▥▨▬▦▣▩▮▧▤◍○▽⨌⨠⨠⨳⨰⨮⨱⨴⩶⩵⩸⁖⁞⁛⁙🚀
