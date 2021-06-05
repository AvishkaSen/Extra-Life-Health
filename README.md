# Extra-Life-Health

The purpose of this application is to provide health based information and medical recommendation through a Java Swing GUI, with the use of the Gang of Four (GoF) Design patterns.

Created a Java Swing based GUI application with the heavy use of Object Oriented Programming that recommends medication and information based on selected ailment to registered users of the application.  

The main goal of this application was to create as many tasks as possible with the use of the Gang of Four (GoF) Design Patterns.
Singleton, Facade, Factory, Decorator, Proxy, Template patterns were used to bring this project to fruition with its feature set.

* Singleton - Database connection for certain features
* Facade - Sign up GUI
* Factory - Medicine recommendation
* Decorator - Medicine pricing with base cost and taxes
* Proxy - Restrict certain feature access to regular users and Admin account holders
* Template - Provide information on common health based ailments

## _GUI Design_ 

### ~ Login 
![Login page](https://i.imgur.com/54p5dN1.png)
* After registering, users enter their login information to use the application's facilities


### ~ Sign up (FACADE PATTERN)
![sign up](https://i.imgur.com/3v1E4Le.png)
* User will be able to register an account and login in order to use the application's features in in the mainpage. 

## _Mainpage Features_

### ~ Medical Recommendation (FACTORY PATTERN)
![medical recommendation](https://i.imgur.com/A3qzfw6.png)
* After selecting from a series of choices and pressing enter, user will be given a recommendation of medication or action depending on the choices. 


### ~ Ailment Information (TEMPLATE PATTERN)
![Ailment Information](https://i.imgur.com/wAxcTpk.png)
* Selecting from a list of ailments in the combo/drop down selection will display information of the ailment to the user.


### ~ Medicine Purchases (DECORATOR PATTERN)
![Medicine Purchases](https://i.imgur.com/JJinmt1.png)
* User can select the medicine they require, the milligram amount per tablet, and the quantity they require. Information on the medicine, price per individual box, and final cost with quantity will be displayed.


### ~ Application Users List (PROXY PATTERN)

![Application Users List1](https://i.imgur.com/oVXQqXj.png)

![Application Users List2](https://i.imgur.com/guu1zR3.png)

* If the user logs in with the username and password 'admin' and 'admin123' respectively, information from the List of users in the SQL database will be displayed here for the admin to view. First image shows if the user that logged in is not an admin. 2nd image shows if the logged in user is an admin.


### ~ About Section 
![About Section](https://i.imgur.com/BBnidLV.png)
* Displays information on the application's goal and sources for medical information used. 



Other patterns used include: 
* Singleton pattern for Database connection where necessary.


For user control and registration a MySQL database was used with MySQL Workbench application along with XAMPP to host its web server and phpmyadmin when necessary. 
