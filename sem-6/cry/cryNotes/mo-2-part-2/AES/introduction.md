# AES (advanced Encryption standard )

# intro:

- AES is advanced Encrytion standard which is a Symmetric-key block cipher
  publihed by NIST

# IN this section:

- ### History -- not so important
- ### Criteria
- ### Rounds
- ### Data units
- ### structure of each round

---

### Criteria : why AES ?

- #### security :

  - use of 128 bit key for resitance to cryptanlysis attacks other then brute force attack

- #### cost :

  - computation efficiency and stoarge requirement for different implimetatons

- #### implimentation :

  - algorithem must be flexibility and simplicity

### Rounds :

- Aes is non feistal cipher
- encrypts and decrypts data block of 128 bits
- it uses 10 ,12 or 14 rounds with respective key sizes 128 , 192,256 bits

**_ note: AES uses 10 ,12 or 14 rounds with respective key sizes 128 , 192,256 bits but the round keys are 128 bits always _**

{ image fig:7.1 General design of AES encryption cipher }

_* the number of keys that can be genrated by the key expantion alog is always one or more then hte number of rounds ( number of rounds +1)keys *_

### units used in Aes:

- #### bits ,bytes ,words , blocks , state

- #### bits :
  - bit is binary digit with 0 or 1 (b1)
- #### bytes :
  - byte a group of 8 bits (b)
- #### words :
  - a group of 32bits or row of 4 bytes
- #### block :
  - a group of 128 bits or row matrix of 16 bytes
- #### state:
  - in Aes block of data used it is refered a block of data in the starting and ending only in between the transitions it is called state
    state is 16bytes - with 4x4 bytes - each row conatins 8 hex chars
  - block to state and state to block
    { image : figure 7.2 Data units used in Aes }

### structure of each round :

{iamge : fig 7.5 structure of each round at the encryption side }

- there are four transformations
  1. sub Bytes
  2. shift rows
  3. mixcolumns
  4. AddRoundKey
- one Round Key is applied before round one (pre Round section )
- last round has only there transformations mixcolumns is missing
- in decryption side inverse transformations are applied :
  1. Inv sub Bytes
  2. Inv shift rows
  3. Inv mixcolumns
  4. AddRoundKey( which is selft invertable)
