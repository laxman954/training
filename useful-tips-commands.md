[Go to Home Page](/training)

***

### Useful Commands

>This page documented mostly used comments.

* [Server Tips & Commands](/useful-tips-commands.md#server-relate-tips--commands)
* [Java Related Commands](useful-tips-commands.md#java-related-tips--commands)
* [Shortcuts]()
* [Database Commands]()

#### Server Relate Tips & Commands
* To run tomcat server in command line in Mac OS, under folder *tomcat/bin*

  `sh catalina.sh run`

  run - start the server and display logs
  start & stop - start as wrapper
* *To change the tomcat port number*

  in apache folder *tomcat_root_folder/conf/server.xml*, Change the `Connector port = 8080` and replace with any other port number
*

#### Java Related Tips & Commands

* Create war file in command line

  `jar cvf warproject.war *`

  Here,
  * **-c** is used to create file,
  * **-v** to generate the verbose output and
  * **-f** to specify the arhive file name.
  * The * (asterisk) symbol signifies that all the files of this directory (including sub directory).


* To extract war file use

  `jar -xvf warproject.war`

***

[Go to Home Page](/training)

***
