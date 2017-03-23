[Go to Home Page](/training)

***

### Java Issues and Resolutions
>This page covers issues we faced and troubleshoot of that issues, references.

#### Server Issues
* **Servlet : SEVERE: Allocate exception for servlet**

  * This was a problem caused by the eclipse build. Since the build was not proper, the class files where corrupted. I cleaned up the whole project, took a fresh build, now its working fine. [Reference](http://stackoverflow.com/a/12368397/2168384


* **HTTP Status 405 - HTTP method POST is not supported by this URL**
  * The problem we here is, we are calling servlet doPost method, from there forward the request to another servlet class. That class intially contain only doGet method. But from doPost if you forward to another servlet it make post call. So we changed doPost instad of doPost in forwarded serlvet class. Now issue got fixed.
  * Verify the methods properly

* **Classpath resource not found when running as jar**
  * resource.getFile() expects the resource itself to be available on the file system, i.e. it can't be nested inside a jar file. This is why it works when you run your application in STS but doesn't work once you've built your application and run it from the executable jar. Rather than using getFile() to access the resource's contents, I'd recommend using getInputStream()
  * Ref: http://stackoverflow.com/a/25873705/2168384

#### Environment Issues


***

[Go to Home Page](/training)

***
