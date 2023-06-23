# ICANN ranges

- the 16 bit port number is divided into three ranges

  1. well know prort number - ` 0 to 1023` controlled by ICANN
  2. resgistered port number - `1024 to 49,151` not controlled but they are resgistered to avoid dupicaton
  3. dynamic port number (private) - `49,152 to 65,535` neither controlled nor resgistered used as temp or private port numbers

- ## note :

* in unix all the well know port are stored in etc/service file
  we can use grep command to find the required port number

```bash
 $grep name_protocol_or_service/etc/service

```

# Socket Addresses:

- the comibination of port address and ip adress is called socket addresss of the node in the internet
- to use the services in the transprt laryer we need a pair of socket address
- the four infomations are the part of the network layer packet header and transprot layer packet header the first one contains the ip address and the second one cotains the port address

