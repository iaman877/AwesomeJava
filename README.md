# OOPs-with-JAVA
## How to Download & Install Java JDK in Windows

Following are steps to install Java in Windows
* Go to link. Click on Download JDK. For java latest version.
* [Open Link] (https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
* According to your system, configuration (64 bit/32 bit) /Operating System (Windows/Linux), download  JDK. 
* For installation - Double click on exe file -> click next -> next ->………->Finish.
* Finally, we have completed the installation of jdk. 

Write, save,compile and run my First Java program: 
 
* Open Notepad/Notepad++ , type the following program. 
* Save it as First.java in any drive or folder.  
* Please recheck the extension of saved program, it should be .java 

Open Command Prompt: 
* Launch the command prompt via All Programs -> Accessories -> Command Prompt. 
* My program location is    F:\Java Code 2020 
* Check java/javac version: 
* Compile the program: Javac is the name of Java Compiler. 
* OR  
After compilation command, either control go on next line or it can show the following error on screen:   
Problem:  'OS is not able to recognize the .java file.' 
 
```Solution 1:  Setting Temporary Path :
Copy the path of jdk/bin directory where java located    
(C:\Program Files\Java\jdk1.8.0_131\bin)  
```

Write in the command prompt:  
  

Note: In LINUX 
 
>export PATH=$PATH:/home/jdk1.6.01/bin/ 

---
 
Command for checking the values of  PATH variable 
  >echo %path% 
 
Again, compile the program: 
 
* After proper compilation, compiler will generate one intermediate code/byte code or .class file. 
* Execute the program: Java is the name java Interpreter. 

----
Solution 2:  Setting Permanent Path: 
''' 
Go to My Computer properties  advanced tab  environment variables -> new tab of user/system variable -> write path in variable name -> write path of bin folder in variable value ->ok -> ok -> ok 
'''

 ### Some Important terms of java :

``` class First 
      {
         public static void main(String args[])
           {
              System.out.print("Hello users in JAVA Programming language");
           }
      }
```

* _public_: main is called by operating system in C++ but by JVM in java, JVM can call main only when the public mode is given before main
* _static_: Since JVM is calling main which is in class, so if we want to call main, an object of class is required to call main by JVM. So JVM escape from the burden of creating an object for the purpose of calling main(). 
* _void_: indicate main(),won’t return anything to JVM. 
* _String args[]_: Known as command line arguments, String is a built in class in java,String have every facility as for making and working on char. 

## Introduction to Java 
* Java is a computer programming language. It enables programmers to write computer instructions using English based commands, instead of having to write in numeric codes. 
* It’s known as a “high-level” language because it can be read and written easily by humans. Like English, Java has a set of rules that determine how the instructions are written. These rules are known as its “syntax”. Once a program has been written, the high-level instructions are translated into numeric codes that computers can understand and execute.  
* Java is an object-oriented programming language.  


Many java versions have been released till now. The current stable release of Java is Java SE 10. 
*	JDK Alpha and Beta (1995) 
*	JDK 1.0 (23rd Jan 1996) 
*	JDK 1.1 (19th Feb 1997) 
*	J2SE 1.2 (8th Dec 1998) 
*	J2SE 1.3 (8th May 2000) 
*	J2SE 1.4 (6th Feb 2002) 
*	J2SE 5.0 (30th Sep 2004) 
*	Java SE 6 (11th Dec 2006) 
*	Java SE 7 (28th July 2011) 
*	Java SE 8 (18th March 2014) 
*	Java SE 9 (21st Sep 2017) 
*	Java SE 10 (20th March 2018) 
*	Java SE 11 (September 2018) 
*	Java SE 12 ( March 2019) 
*	Java SE 13 (September 2019) 
*	Java SE 14 (March 2020) 


Types of Java Applications  :
There are mainly four types of applications that can be created using java programming: 
* _Desktop Application_ : 
It is also known as desktop application or window-based application. An application that we need to install on every machine such as media player, antivirus etc. AWT and Swing are used in java for creating standalone applications. 
* _Web Application_  : 
An application that runs on the server side and creates dynamic page, is called web application. 
Currently, servlet, jsp, struts, jsf etc. technologies are used for creating web applications in java. 
* _Enterprise Application_  :
An application that is distributed in nature, such as banking applications etc. It has the advantage of high level security, load balancing and clustering. In java, EJB is used for creating enterprise applications. 
* _Mobile Application_ : 
An application that is created for mobile devices. Currently Android and Java ME are used for creating mobile applications. 


Java Editions/Platforms :
There are 4 platforms or editions of Java:  
* _Java Standard Edition (JSE)_: The Java Standard Edition (Java SE) is for building desktop applications and applets. These applications typically serve only a small number of users at one time. It is a Java programming platform. It includes Java programming APIs such as java.lang, java.io, java.net, java.util, java.sql, java.math etc. It includes core topics like OOPs, String, Regex, Exception, Inner classes, Multithreading, I/O Stream, Networking, AWT, Swing, Reflection, Collection, etc. 
* _Java Enterprise Edition (JEE)_: It is an enterprise platform, which is mainly used to develop web and enterprise applications. It is built on the top of the Java SE platform. It includes topics like Servlet, JSP, Web Services, EJB, JPA, etc.  
* _Java Micro Edition (JME)_: The Java Micro Edition is for applications used on mobile (e.g., cell phone, PDA) and embedded devices (e.g., TV tuner box, printers). 
* _JAVA Card_: used in SIM Cards, ATM Cards, Credit Cards, SMART Card reader programming. 

Java Virtual Machine (JVM)

JVM (Java Virtual Machine) is an abstract machine. It is called a virtual machine because it doesn't physically exist. 
It is a  specification provides runtime environment in which java bytecode can be executed.  
JVMs are available for many hardware and software platforms.  
JVM, JRE and JDK are platform dependent because configuration of each OS differs. But, Java is platform independent. 


The JVM performs following main tasks: 
*	Loads code 
*	Verifies code 
*	Executes code 
*	Provides runtime environment 

Java Runtime Environment (JRE): 


JRE is an acronym for Java Runtime Environment. It is also written as Java RTE. The Java Runtime Environment is a set of software tools, which are used for developing Java applications. It is used to provide the runtime environment. It is the implementation of JVM. It physically exists. It contains a set of libraries + other files that JVM uses at runtime. 
The implementation of JVM is also actively released by other companies besides Sun Micro Systems. 
 
```JDK=JRE + Development Tools (JAVAC, JAVA)``` 

Java Development Kit (JDK):  


JDK is an acronym for Java Development Kit. The Java Development Kit (JDK) is a software development environment, which is used to develop Java applications and applets. It physically exists. 
It contains JRE + development tools. 
JDK is an implementation of any one of the below given Java Platforms released by Oracle Corporation: 
* Standard Edition Java Platform 
* Enterprise Edition Java Platform 
* Micro Edition Java Platform 


The JDK contains a private Java Virtual Machine (JVM) and a few other resources such as an interpreter/loader (java), a compiler (javac), an archiver (jar), a documentation generator (Javadoc), etc. to complete the development of a Java Application. 


Example: 
JDK 1.5,JDK 1.6 ,JDk 1.8 


Note: The JRE is contained within the JDK (i.e., if you just download the JDK you will be able to create and run java programs.).  



