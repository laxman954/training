Find the below for JAVA/J2EE References, concepts, best practices

Study java basic concepts thoroughly -syntax not important
	(e.g)Diff string,string buffer, string builder
		 Diff interface, Intheritance, Abstrace class (example !)
		 Collection framework - Basics (Diff important)
		 equals,hashcode (!)
		 static (why use)
		 Exception (diff types, which time use, if not what happen)
		 memory allocation java(heap, stack..)
		 serialization-deserialization, why needed
		 some basics abt garbage collection, finally
		 use of annotation
		 final,inner class,UUID
		 Array and methods
		 Collection class and methods, map and entryset,iterator
		 basic abt thread
		 object class and methods
Java EE
	Diffferent http methods - diff,why
	servlet life cycle,servlet container
	cookie -(how store,why needed,example)
	session -(default timeout, how works, session maintain), why session
	filters,chain
	deployment descriptor-web.xml [how working, what are the attributes and why e.g load-on-startup]
	JSTL -not use jsp
	Validator-
	Different context,scope
Design patterns
  	MVC pattern - How works, how implemented in any framework (eg.spring), Factory, Builder, Singleton
  	etc..

Other things need to know for Java Developer

Need to know
1)basic concepts Any one of framework (spring..)
2)basics html attibutes (refer w3c - https://play.google.com/store/apps/details?id=org.w3c.mwi.cheatsheet&hl=en)
3)Some basics javascript (Form validation, ajax call-response handling)
4)follow any java blog , study already written also(http://www.javaadvent.com/, http://www.programcreek.com/)
5)Study AJAX -not much -do simple sample using js and java
6)Different data exchange format - XML, JSON (how use it in Java)
7)Any of version control tool (subversion, Git! -just go through-http://readwrite.com/2013/09/30/understanding-github-a-journey-for-beginners-part-1#awesm=~oqsECj4Wyy51Ut)
8)Know how to understand and draw architecture,class,sequence,use case diaram (see some sample in websites and understand)
9)know some third praty API (e.g -recaptcha, social login,
10)how to do unit testing (Junit)
11)What is maven,apache ant
12)SEO tages how to use..?,schema.org
13)Logger (log4j)
14)Use PMD,checkstyle in eclipse
15)Code debugging in eclipse

References

Study java on this site (Trails Covering the Basics) - http://docs.oracle.com/javase/tutorial/index.html


Pgm concepts
http://www.ntu.edu.sg/home/ehchua/programming/
Enum- http://www.ntu.edu.sg/home/ehchua/programming/java/JavaEnum.html
http://stackoverflow.com/questions/1612334/difference-between-dto-vo-pojo-javabeans
http://sourcemaking.com/design_patterns
http://www.w3resource.com/java-tutorial/java-object-oriented-programming.php

Ajax Basics - http://courses.coreservlets.com/Course-Materials/ajax-basics.html [Just go through how handle Ajax]

High Level - http://www.javaranch.com/gramps/SCJPLinks.jsp
High level about java -    http://www.artima.com/insidejvm/ed2/introarch.html [study if possible]

Blog
	Study Frequently  (some problem and interview Experience) - http://www.geeksforgeeks.org/

Some Question and language fundamentals
	http://www.javaprepare.com/index.html [study frequent]
	http://www.javaprepare.com/quests/question.html

Interview Questions http://howtodoinjava.com/category/core-java/java-interviews-questions/ -

Learn basic about unix http://www.ee.surrey.ac.uk/Teaching/Unix/index.html

Servlet in depth - https://jira.sakaiproject.org/secure/attachment/16135/servlet-2_4-fr-spec.pdf

Best Practices in JAVA
Java
-----
Use Intention-Revealing Names
Classes should be small
Don't Repeat Yourself (Avoid Duplication)
Explain yourself in code with comments
Make sure the code formatting is applied
Use Exceptions rather than Return codes
Don't return Null. Return empty arrays or collections, not nulls
Minimize the accessibility of classes and members
Avoid excessive logs for unusual behavior
Do not log highly sensitive information
Avoid creating unnecessary objects
Keep Synchronized Sections Small
Don't ignore exceptions
Refer to objects by their interfaces
Code that has been "commented out" should be explained or removed.
Code that needs to be reworked should have a TODO comment and a clear explanation of what needs to be done.
