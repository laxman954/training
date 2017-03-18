[Go to Home Page](/training)

***

### Web Terminology

* Static vs Dynamic
* HTTP - data communication protocol, estailish connection b/w Client and server
* HTTP Request - Request send client machine to communicate with webserver
* Get Vs POST
* Content Type
* Web vs Application Server

#### HTTP
  * TCP/IP based communication protocol
  * Allow webserver and browser to exchange data over the web
  * It is stateless protocol means each request is considered as the new request. In other words, server doesn't recognize the user by default.
  * Uses TCP Connection by default port 80

> HTTP is request/response protocol which is based on client/server based architecture. In this web browser, search engines, etc behaves as a HTTP clients, and the Web server like Servlet behaves as a server.

#### HTTP Requests:

  * Client sends the request to the server in the form of request message includes
      * Request, CLient IP address, destination IP, host, Port, Requested URL, Request Method & Content, User-Agent, Connection Control Header, Cache Header
      * The particular resource identified using Uniform Request Identifier in header
  * Request Method [Reference](https://www.w3.org/Protocols/rfc2616/rfc2616-sec9.html)
      * GET - limited amount of data, not secure (Data exposed in url),bookmarked,
      * POST - large amount of data, secure,
      * HEAD - Only ask Header part of whatever GET return, (Same as GET with no body)
      * TRACE -  loopback of the request message, for testing or troubleshooting.
      * DELETE - Delete resources at the requested url
      * PUT
      * OPTIONS - Asks for list of HTTP methods request url can respond.

    [HTTP Header REF  1](https://www.w3.org/Protocols/HTTP/HTRQ_Headers.html)
    [HTTP Header REF 2](https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html)

#### Web vs Application server
  * Web Server
      * It is a computer where the web content can be stored. In general web server can be used to host the web sites but there also used some other web servers also such as FTP, email, storage etc.
      * E.g Tomcat
      ![Web Server ](images/server-web-vs-application1.png)
  * Application Server
      * It is a component based product that lies in the middle-tier of a server centric architecture.
      * It provides the middleware services for state maintenance and security, along with persistence and data access.
      * JBOSS, Glassfish, Weblogic, Websphere

#### Content Type
  * Also Know as MIME (Multipurpose internet Mail Extension)
  * You can find in http header- provides the description of what sending to browser
  * [REF - MIME_types] (https://developer.mozilla.org/en-US/docs/Web/HTTP/Basics_of_HTTP/MIME_types)
