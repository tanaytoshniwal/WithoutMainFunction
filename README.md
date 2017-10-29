# WithoutMainFunction
A JAVA Program that runs without a main function
## Description
These Programs will run without the need of the main function in JAVA.

**Note** - The Programs will only run in JDK 6 or older versions.
### Reason
While running the JAVA program in JDK 6 or older versions the existance of main function was not checked.
So if we use static block, the controls will first enter that block and the lines in static block will execute first.
While exiting the static block we will exit the program explicitly so that the controls won't check the presence of main function.

And it's done.
