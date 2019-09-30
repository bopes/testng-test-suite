#1 Check Selenium dependency is in the pom

#2 Following the guide for Java (https://www.browserstack.com/automate/java)
		No need to add the Selenium Java bindings, done through Maven and setting the dependency in the pom
		
#3 add the Java sample class to the project and test.
 	View result on the console and on BrowserStack Dashboard (https://automate.browserstack.com/dashboard)
 	image console
 	image dashboard
 	![alt text](http://url/to/img.png)
 	My first automated test
	![alt text](./img/({imagename}).png)
#4 Following the automatation guide (https://www.browserstack.com/automate/testng)
	
	Create Test Resource folder to hold test configuration files and file for single test


	Update single.testng.xml file with config and environment parameters

	run maven profile for single test:
	mvn test -P single