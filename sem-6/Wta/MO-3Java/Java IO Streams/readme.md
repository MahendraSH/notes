# I/o baiscs

- ## streams - An abstact i/o system all implented in` Pacakage java.io`
- ## byte and char steams - `binary files ` and `char files or unicode` respactively
- byte steam - output stream and input stream to main abstract class
- to main methods in these classes are `read() and write()`

### some imporatant byte I/O steram class

1.  - bufferInputStream() - bufferOutputStream() `buffer is used`
2.  - PrintStream() `contian println() and print()  out of lang package is objectof this class `
3.  - DataInputStream() - DataOutputStream() `Data type  of java`
4.  - ByteArrayInputStream() - ByteArrayOutputStream() `array is use`
5.  - FileInputStream() - FileOutputStream() `used with files`
6.  - ObjectInputStream() - ObjectOutputStream() `used with objects`
7.  -FilterInputStream() - FileOutputStream() `implments inputStream and outputstream classes`

### some imporantant char I/O stream

1. - BufferReader() and BufferWriter `buffer is used`
2. - charArrayReader() and CharArrayWriter `array is used `
3. - FileReader() and FileWriter() `used with files`
4. - FilterReader() and FileWriter() `Filtered Reader and FIltered Writer`
5. - InputStreamReader() and OutputStreamReader() ` inputStreamReader converts bytes to char` and `outputSteamReader  chars to bytes `
6. - PrintWriter `contian println() and print() mainly used in Production and debugging `
7. - StringReader() and StringWriter() `used with Strings`

### Predefined Streams

- in java.lang package there are three public ,static and final variable called
  - out --> System.out is object of printSteam
  - in --> System.in is object of inputStream
  - err --> System.err is object of printSteam

# Reading Console

## _BufferedReader br =new BufferedReader(new InputStreamReader(System.in));_

#### two constructor are used :

```

1.  BufferedReader(Reader inputStreamReaderObj)
2.  InputStreamReader(InputStream InputStreamObj)

```

### bufferedReader has two methods for reading from cnsole

1. #### Reading char and Reading String

```
br.read()      // prototype -> int read( ) thorws IOException
br.readLine()  // prototype -> String readLine() throws IOException
// read () only reads on char  and used as (char)br.read()
 // among these two readLine is used as it reads complete line till enter
```

### programs on reading from console

```
1. _____________________ pro1.java___________ br.read() ___________

2. _____________________ pro2.java_____________br.readLine()_________


```

# Writting console output

## using PrintStream class

```
System.out.println();
System.out.print();
System.out.write(); // it prints only one char
System.out
```

## using PrintWriter class

```
Pritwriter pw = new PrintWriter( System.out .true)
pw.println();
pw.print();

 // PrintWriter constructor prototype
//PrintWriter(OutputStream outputStream, boolean flushOnNewline)
```

### program on PrintWriter class

```

3. _____________________ pro3.java___________ PrintWriter ___________

```

# reading and writing files

```
FileInputStream()
FileOutputStream()
FileNotFoundException

```

### program on reading input from file

```

4. _____________________ pro4.java___________reading file  using FileReader increaing its effeciency using char buffer


5. _____________________ pro5.java___________ reading file using FileReader with BufferedReaderclass


6. _____________________ pro6.java___________ using FileOutStream and FileInputstream ___________
```
