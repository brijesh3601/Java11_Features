Java 11 Features
---
1. isBlank(): This is a boolean method. It just returns true when a string is empty and vice-versa.
2. lines(): This method is to return a collection of strings which are divided by line terminators.
3. repeat(n): Result is the concatenated string of original string repeated the number of times in the argument.
4. stripLeading(), stripTrailing(), strip(): remove white-spaces before, after, both respectively.
5. toString(int): makes process more convenient without throwing incompatible type error message. Example : Character.toString(65)


JDK11 Features on JSHELL
---

1. lines() : "Line1\nLine2\nLine3".lines().map(String::toUpperCase).toArray()
2. repeat() : var numOne = "1"; IntStream.range(0, 10).forEach(i -> System.out.println(numOne.repeat(i))); // check use of var instead of String
3. isBlank(): var halfSpace = "\u0020"; var fullSpace = "\u3000" ; halfSpace.isBlank(); fullSpace.isBlank();
4. Write text into file: Files.writeString(Path.of("c:\\temp\\a.txt"), "SomeText");
5. Create Methods: void echo() { System.out.println("heloo"); }
6. Edit methods: /edit echo :: this will open jshell edit pad
7. Teminate shell :  /exit 
8. isEmpty() : Optional.ofNullable(null).isEmpty()
9. Easy character conversion : Character.toString(65)

File Operation on JShell
---
1. Write: Files.writeString(Path.of("c:\\temp\\a.txt"), "SomeText");
2. Read: Files.readString(Path.of("c:\\temp\\a.txt"));


Execute .java file on JSHELL
---
1. On Command Prompt Execute below command so that JDK12 version of jshell can be run. Make sure your path specified points to jdk12 bin folder correctly
    - set path=%path%;C:\project\software\openjdk-12.0.2\bin
2. Now go to 'src' folder of this project using command prompt
3. Open JshTest.java file on JSHell: /open JshTest.java
3. Execute to run main method: JshTest.main(new String[0])

JSHELL Commands
---
/list : list commands
/save : use /list then /save somedata.jsh to save 
/methods : prints methods
/vars : prints variable
/history : prints history
/env : setting env variable like setting jars. -class-path C:\somelocation\code\core_java\Java11_Features\jars\ojdbc6-11.2.0.3.jar

Benefits of var
---

no need to import the return type (less code)
no need to spell out types (less code, much easier to write)
easier readability


Vscode Settings:
---
- CRTL + SFT + P > Java: Create Project > Give Project Name
- CRTL + SFT + P >  Open User Setting > Edit > Add line to change JDK :: "java.home":"C:\\project\\software\\openjdk-12.0.2"

References
https://dzone.com/articles/java-11-api-changes-so-far
https://medium.com/@adambgoode/scripting-with-java-10-and-jshell-497d6fdbf8b5
http://cr.openjdk.java.net/~rfield/tutorial/JShellTutorial.html


