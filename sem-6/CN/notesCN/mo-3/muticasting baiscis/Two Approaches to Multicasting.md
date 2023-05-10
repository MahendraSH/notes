# Two Approaches to Multicasting

- as muticast routing depends and source and destination address both , there are two
  approches to achive this

- ### source based tree Approach
  - each router needs to create a separate tree for each source-group combination (if there are n sources and m groups the router has to create m x n routing tree)
  - in each tree the source is the root and the other member of of the group are the leaf the router it self is some where on the tree
- ## grouped shared tree Approach
  - in this each group is designated with a router to act as a phony source for each group
    is alos called `core router or rendezvouspoint router`
  - when the source needs to send a packet to the group it sends the packet to the core router
  - the core router muticast the packet to all the group 
  - the core router contains/ creates  routing tree with core router as the root and other routers in the group as the leaf of the tree 
  - in this the source use tunneling.
  - if there are m groups there are m routers and m trees 
  - the disadvantage of this approach is the overhead of selecting the router among all the routers as core router 
  

