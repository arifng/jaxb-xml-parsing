JAXB XML Parsing
================

Overview
--------
A very basic project to show xml parsing using JAXB. This project shows marshalling and unmarshalling xml.
 * Marshalling: Generate xml according to model/data.
 * Unmarshalling: Generate model/data from xml.
 
Here, we show how to mapping model and their fields to represent right format of xml. All models in `com.learning.model` 
package are designed to represent the xml format as shown in `resources/sample.xml` file.
 
Testing
--------
* For unmarshalling, we used defined xml file which is in `resources/sample.xml`
* For marshalling, we used the exact model returned by `unmarshalling()` method in `Main` class to show marshalling of 
correct model will prints exact xml as like as `sample.xml`. If we create model with different data, and marshall it,
it will create our desired xml. For, setter and getter we use `lombok` library.
* Run the main program, it will parse `sample.xml` and create `Company` object and using this object, it will generate xml
file and print in console. Cheers!
 
Links
-----
* [JAXB Project](https://github.com/javaee/jaxb-v2)
* [Architecture of JAXB](http://www.oracle.com/technetwork/articles/javase/index-140168.html)