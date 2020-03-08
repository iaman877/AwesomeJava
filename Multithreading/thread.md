# Multithreading in Java
### Multitasking can be achieved by two ways:
* Process-based Multitasking (Multiprocessing)
* Thread-based Multitasking (Multithreading)
--------------------------------------------------------------------------------------
Multithreading in java is a process of executing multiple threads simultaneously.
Thread is basically a lightweight sub-process, a smallest unit of processing.
Multiprocessing and multithreading, both are used to achieve multitasking.
But we use multithreading then multiprocessing because threads share a common
memory area. They don't allocate separate memory area so saves memory, and
context-switching between the threads takes less time than process. 
### Advantages of Threading
* Better utilization of system resources, including the CPU.
* Reduces the computation time.
* Improves performance of an application.
* Threads share the same address space so it saves the memory.
* Context switching between threads is usually less expensive then between processes.
* Cost of communication between threads is relatively low.
* It doesn't block the user because threads are independent and you can perform multiple operations at same time.
*  You can perform many operations together so it saves time.
* Threads are independent so it doesn't affect other threads if exception occur in a single thread.
### Thread States or Life cycle of a Thread
The life cycle of the thread in java is controlled by JVM. When any thread is created,
it goes to different states before it completes its task and is dead. The different states
are:
1) *New/Born*: When a thread is created, it is in new state, in this state thread will
not be executed and not sharing time from processor.
2) *Runnable/Ready*: When the start() method is called on the thread object, the
thread is in runnable state. In this state the thread is executing and sharing time from
processor.
3) *Running*: If thread scheduler allocates processor to a thread it will go in Running
state OR A thread currently being executed by the CPU is in running state
4) Non-Runnable (Blocked): This is the state when the thread is still alive, but is
currently not eligible to run. A running thread may go to a blocked state due to any
of the following conditions.
* wait() or sleep() method is called
* The thread perform I/O operation.

When a blocked thread is unblocked, it goes to runnable state and not to running state
5) *Terminated*: A thread is in terminated or dead state when its run() method exits.
A thread becomes dead on two occasions.
• If a thread completes its task, exit the running state.
• run() method is aborted(due to exception etc.)
## CREATION OF THREADS
There are two ways to create a thread:
1. By extending Thread class
2. By implementing Runnable interface.
### 1. By extending Thread class:
Thread class provide constructors and methods to create and perform operations on
a thread. Thread class extends Object class and implements Runnable interface.
Commonly used Constructors of Thread class:
*  Thread()
* Thread(String name)
* Thread(Runnable r)
#### Commonly used methods of Thread class:
* *public void run()*: is used to perform action for a thread.
* *public void start(): starts the execution of the thread.JVM calls the run() method on the thread.
* *public void sleep(long miliseconds): Causes the currently executing thread to sleep(temporarily cease execution) for the specified number of milliseconds.
* *public void join(): waits for a thread to die.
* *public void join(long miliseconds): waits for a thread to die for the specified miliseconds.
* *public int getPriority(): returns the priority of the thread.
* *public int setPriority(int priority): changes the priority of the thread.
* *public String getName(): returns the name of the thread.
* *public void setName(String name): changes the name of the thread.
* *public Thread currentThread(): returns the reference of currently executing thread.
* *public int getId(): returns the id of the thread.
* *public Thread.State getState(): returns the state of the thread.
* *public boolean isAlive(): tests if the thread is alive.
* *public void yield(): causes the currently executing thread object to temporarily pause and allow other threads to execute.
* *public void suspend(): is used to suspend the thread(depricated).
* *public void resume(): is used to resume the suspended thread(depricated).
* *public void stop(): is used to stop the thread(depricated).
* *public boolean isDaemon(): tests if the thread is a daemon thread.
* *public void setDaemon(boolean b): marks the thread as daemon or user thread.
* *public void interrupt(): interrupts the thread.
* *public boolean isInterrupted(): tests if the thread has been interrupted.
* *public static boolean interrupted(): tests if the current thread has been interrupted.
