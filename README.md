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

 Some Important keywords of java are :

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

