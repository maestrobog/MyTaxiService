![-----------------------------------------------------](https://raw.githubusercontent.com/andreasbm/readme/master/assets/lines/rainbow.png)

<!-- ABOUT THE PROJECT -->
<h2 id="about-the-project"> :pencil: About The Project</h2>

<p align="justify"> 
  Basic implementation of a taxi service. Using a database to store all data.
Includes functionality for creating new users, authorizing them, and updating all the necessary information.
</p>

![-----------------------------------------------------](https://raw.githubusercontent.com/andreasbm/readme/master/assets/lines/rainbow.png)

<!-- OVERVIEW -->
<h2 id="overview"> :cloud: Overview</h2>

<p align="justify"> 
  In this project, you can enter the car into the database, with all the necessary information such as manufacturer, model, year of manufacture. Including all its drivers. You will be redirected to the registration page first, where you can create a new driver.Because of the filter.
</p>

### **Technologies used**

- [x] Java 11
- [x] JDBC
- [x] JSP/JSTL and Java Servlets
- [x] MySQL
- [x] Apache Tomcat


![-----------------------------------------------------](https://raw.githubusercontent.com/andreasbm/readme/master/assets/lines/rainbow.png)

## [Installation](#installation)

### **Apache Tomcat**

You need to install [Apache Tomcat](https://tomcat.apache.org/download-90.cgi)® version 9.0.54 or latest on your computer as a web server.

### **MySQL**

Second things what you need is relational database like MySQL or PostgreSQL.
All the needed resources you can find in

```
src/main/resources/init_db.sql
```
![-----------------------------------------------------](https://raw.githubusercontent.com/andreasbm/readme/master/assets/lines/rainbow.png)

## [Other information and helpfull tips](#otherinformationandhelpfulltips)

- You can test this project online on [Heroku](https://glacial-hamlet-03399.herokuapp.com/login).

⚠️ If you wanna connect my project to your database, just add all the necessary information in the

```
src/main/java/util
```

```java
public class ConnectionUtil {
    private static final String URL = "YOUR CONNECTION URL";
    private static final String USERNAME = "YOUR LOGIN";
    private static final String PASSWORD = "YOUR PASSWORD";
    private static final String JDBC_DRIVER = "JDBC DRIVER";
}
```

![-----------------------------------------------------](https://raw.githubusercontent.com/andreasbm/readme/master/assets/lines/rainbow.png)

### **See you on the road :)**
