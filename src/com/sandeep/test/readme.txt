These directory is created for testing few things
- how compilation of different classes & linking happens after compile.
- package behaviour

I wrote main program which sort's the Array (by taking numbers from user)
- quicksort.java depends on JDK library Classes and My own Library Class (/lib/dsaLib.java)

- when try to run quicksort.java, first I had to compile it using :
  > javac quicksort.java ---> these compiles the dependant classes also like (/lib/dsaLib.class)
    & for internal classes like "Scanner", "Arrays" these's classes bytecode is already present at JVM- (like it's internal)

  > More important is - quicksort.java ---> quicksort.class (it only consists part of its code, the dependant classes don't added in these file- JVM takes care of dependant file while running, JVM automatically fetches and use dependant classes.