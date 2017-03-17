### J2EE

##### Servlet
* Interfae b/w Appln Server, Web Server
* Receive Request and generates dynamic Response
  * Web Container
* Managing life cycle of servlet
* mapping incoming request to servlet (base on access)
* Servlet exceutes on web container which provides multithreaded environment
* so servlet can handle multiple request at same time
* we mostly use HttpServlet

  ##### Deployment Descriptor
* web.xml file present in webapp --WEB-INF in maven project  or webcontent-WEB-INF folder in the dynamic web project.
* servlet mapping defined here

#### Servlet Container
  > Part of web server interacts with servlet for handling for dynamic web pages from client

  ###### Contaner States
* Standalone - Java Based server, servlet container and web server as single (Tomcat running itself)
* In-Process - Separate from web server (Tomcat running inside JBoss)
* Out-of Process -Web server uses plugin provided by the servlet container (both are different pgms)
  ##### Operations
* Security, Object Polling, Life cycle management of servlet, multithreaded support
