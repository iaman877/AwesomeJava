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
1) *New/Born*: When a thread is created, it is in new state, in this state thread will
not be executed and not sharing time from processor.
2) *Runnable/Ready*: When the start() method is called on the thread object, the
thread is in runnable state. In this state the thread is executing and sharing time from
processor.
