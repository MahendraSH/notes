# String Handling

# String Constructors

```java
String s = new String(); // Empty string

char []c = {'a','b','c'};
String s -new String(c); // String  using char  array

String =new String ("abc")// String using String

char chars[] = { 'a', 'b', 'c', 'd', 'e', 'f' };
String s = new String(chars, 2, 3);
// This initializes s with the characters cde.


String s ="mahendra"

String s1 -new String(s);  // using another string

byte [ ]arr ={65, 66, 67, 68, 69, 70}; using byte array
String s = new (arr); // ABCDEF
String s =new (arr,2,3) CDE

```

# String Length

```java
s.length();//returns lenght or string in int

```

# special String operations

## String Literals

```java

String s = "mahendra"// here "mahendra" is String Literals u can call all the String functions on the String Literals

```

# String Concatenation

```java
String age = "9";
String s = "He is " + age + " years old.";
System.out.println(s);// “He is 9 years old.”

```

```java
int age = 9;
String s = "He is " + age + " years old.";
System.out.println(s); //“He is 9 years old.”

```

## String Concatenation with other Data types

```java

String s="sum of 2+2 is "+2+2
System.out.println(s);// "sum of 2+2 is 2+2


// but
String s="sum of 2+2 is "+(2+2)
System.out.println(s);// "sum of 2+2 is 4


```

# String Convetion and toString()

- when we concatenate other data types which String it calles a object class fuction valueOf() which is human readable

- toString() in also gives the human readable formate

```java
//toString() can be easly overloder for any object for example

class Human {
    String name ;
    int age ;
    String gender ;

    Human(name,age,gender)
    {
        this.name =name ;
        this.age=age;
        this.gender=gender ;
    }

    String toString(){
        return "human name : "+name "/t human age : "+age"/t human gender : "+gender;
    }
    class Main
    {
        public static void main(String []args){
            System.out.println( new Human("mahendra",21,"male").toString());
        }

    }

}


    output:
    human name : mahendra   human age : 21  human gender : male


    // this toString of Human class is called automatically when we Concatenate human obj with String
```

# Character Extraction

## charAt( )

```java
String s ="mahendra"
char c = s.charAt(0); // c='m'

char c ="maahi".charAt("maahi".length()-1 );// c='i'

```

## getChars()

```java
void getChars(int sourceStart, int sourceEnd, char target[ ], int targetStart)


String s ="mahendra"
char []c = new char[s.length()]
s.getChars(0,s.length(),c,0);

// c=['m','a','h' .... 'r','a']

```

## getBytes( )

- convets string to byte array ( used in network to convert 16 bit unicode to 8 bit byte formate )

```java
 byte[] getBytes();
```

## toCharArray( )

- convert string to char array

```java
char[] toCharArray();

```

# String Comparison

## equals( ) and equalsIgnoreCase( )

```java
s1.equals(s2);
s1.equalsIgnoreCase(s2);

//Hello equals Hello -> true
//Hello equals Good-bye -> false
//Hello equals HELLO -> false
//Hello equalsIgnoreCase HELLO -> true

```

## regionMatches( )

- checking reagions in string

```java
boolean regionMatches(int startIndex, String str2, int str2StartIndex, int numChars)

boolean regionMatches(boolean ignoreCase, int startIndex, String str2, int str2StartIndex, int numChars)

```

## startsWith( ) and endsWith( )

```java
boolean startsWith(String str)
boolean startsWith(String str, int startIndex)
boolean endsWith(String str)

```

equals( ) Versus ==

- equals checks two string contents
- where as == checks the string refernce

```

String s ="maahi"
String s1 = new String(s);

s==s2  // gives false
s.equals(s1) //gives true

```

## compareTo() and compareToIgnoreCase( )

```java
s.comapreTo(s1) .// returns int

less then zero --> s is less then s1
zero then --> equal
grater then zero -->  s is grater then s1

```

- it can be used for sorting of strings
- compareToIgnoreCase( ) ignore case

## Searching in Strings

```java
int indexOf( char ) // serach firt occurence
//  variabtions
int indexOf( string /char ,starting_index)
int lastIndexOf(char) // last occurence
// variations
int lastIndexOf( string /char ,starting_index)// search from start to 0


```

## modifiing string

# substring()

```java
String substring(int startIndex)  // starting to end on the string
String substring(int startIndex ,int endIndex) // starting to end-1
```

## concat()

```java
String concat(String)

```

## replace()

```java
String replace(char original, char replacement) // only one char replace ment
String replace(CharSequence original, CharSequence replacement)  // sqquence of chars replacement
```

## trim()

```java
string.trim() //used to remove spaces from last and end of string
```

# valueOf()

```java

string valueOf(anything ) // gives it string
eg valueOf(19.43982)   = "19.43982"
```

## changing the case in string

```java

String toLowerCase( )
String toUpperCase( )
```

# soeme others

```java

split()
String[ ] split(String regExp)
String[ ] split(String regExp, int max) // max length of array of strings split

replaceFirst() //
replaceALl () //

```
