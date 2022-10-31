<p><strong style="color: black;">Creational Design Patterns.</strong></p>
<p><span style="color: black;"> </span></p><p><span style="color: black;"> </span><strong style="color: black;">Course: TMPS</strong></p>
<p><span style="color: black;"> </span></p><p><span style="color: black;"> </span><strong style="color: black;">Task: Laboratory work</strong></p>
<p><span style="color: black;"> </span></p><p><span style="color: black;"> </span><strong style="color: black;">Author: Vladimir Russu</strong></p>
<p><strong style="color: black;">&nbsp;</strong></p><p><strong style="color: black;">&nbsp;</strong></p>
<p><strong style="color: black;">Overview</strong></p><p><br></p>
<p>In this laboratory work project 4 creational design patterns are being implemented: Singleton, Builder, Prototype and Abstract Factory.
The project are separated into 2 packages: "designPatterns" package and "company" pattern.</p>
<p>In the "designPatterns" package there are interfaces and classes in which the implementations of design patterns are being created.
In that package there is a class which implements the Singleton principle and contains the title of the company. There is another class which implements the Builder 
pattern in order to further build the list of employees of the company. There is another class which implements the Prototype principle in order to further create a list of the employees of the company. And there are interconnected classes ("abstractFactory" class and all classes ending on "AF") which together implement the Abstract factory principle in order to further display parameters of devices produced by the company.
</p>
<p> In the "company" package all the design patterns from the "designPatterns" package are being used in order to obtain the information about the company. In the "company" 
package in all classes the Singleton principle is used to get the company name. 
Builder pattern is used to create list of the employees of the Smartphone production department of the company. 
Prototype pattern is used to create list of the employees of the Smartwatch production department of the company.
And Abstract Factory pattern is used to specify parameters of smartphones and smartwatches which are produced by the company.
</p>