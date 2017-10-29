# WithoutMainFunction
Some Programs that runs without a main function
## Description
These Programs will run without the need of the main function.
### C
  **Note** - Compile the C Program using this command:
  ```bash
      $ gcc -nostartfiles filename.c
  ```
  #### Reason
  The method **_ _start_** is the entry point of the C program. This method is in a file **_crt0.o_**.
  We enter in this function firstly and then after execution of some code **_exit_** method is called.
### JAVA
  **Note** - The Programs will only run in JDK 6 or older versions.
  #### Reason
  While running the JAVA program in JDK 6 or older versions the existance of main function was not checked.
  So if we use static block, the controls will first enter that block and the lines in static block will execute first.
  While exiting the static block we will exit the program explicitly so that the controls won't check the presence of main function.

And it's done.
