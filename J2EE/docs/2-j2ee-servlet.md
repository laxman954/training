J2EE

1.Application Server
2.Servlet
  Servlet
    - Interfae b/w Appln Server, Web Server
    -Receive Request and generates dynamic Response
    Web Container
      -Managing life cycle of servlet
      -mapping incoming request to servlet (base on access)
    -Servlet exceutes on web container which provides multithreaded environment
      -so servlet can handle multiple request at same time
    -we mostly use HttpServlet
  Deployment Descriptor
    -web.xml file present in webapp --WEB-INF in maven project  or webcontent-WEB-INF folder in the dynamic web project.
    * servlet mapping defined here
    *
