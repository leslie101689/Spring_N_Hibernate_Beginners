Web browswer 1-> Customer Controller 2<-> Customer Service 3<-> Customer DAO 4<-> Database
       A            5|
      6|             V
       --------  JSP Page

Part 1
1. Set up sample database
- use localhost:3306
a. run sql scripts 01 and 02

2. Test Database Connection
Create Dynamic Web project
- update WEB-INF lib
- Create package com.luv2code.testdb
- create servlet TestDbServlet.java
  only need inherit abstract methods and doGet
- add JDBC driver for MySQl
- run Sanity test

3. Set up Dev Env
a. Copy start config files
- web.xml and spring-mvc-demo-servlet.xml
b. Copy over JSTL libs
c. Copy latest Spring JAR files
d. Copy latest Hibernate JAR files
- copy optional c3p0 jar file too
e. Define database dataSource/connection pool
f. Setup Hibernate session factory
g. Setup Hibernate transaction manager
h. Enable configuration of transactional annotations

4. Test Spring MVC Controller
- create package com.luv2code.springdemo.controller
- create CustomerController.class
- create WEB-INF/view Folder
- create list-customer.jsp

Part 2
1. List Customers
a. create customer.java
2. Develop Hibernate DAO
- create interface CustomerDAO.java and class CustomerDAOImpl.java
- DAO (Data Access Object)
a. define DAO interface
b. Define DAO implementation
c. Update for DAO implementation

3. Injecting DAO into Controller
a. update CustomerController.java

4. Developing JSP view page
a. update JSP page: list-customer.jsp
b. add support for JSTL core tags
c. making pretty with CSS
d. adding welcome file in web.xml

Part 3
User Get Method
Refactor Add a Service layer
1. Define Service Interface
2. Define Service implementation

Part 4
Add Customer
1. Update list-customer.jsp
a. New "Add Customer" button
2. Create HTML form for new customer
3. Process Form Data
a. Controller -> Service -> DAO

Part 5
Update Customer
1. Update list-customers.jsp
a. New "Update" link

2. Create customer-form.jsp
a. Prepopulate the form

3. Process form data
a. Controller -> Service -> DAO

Part 6
1. Add "delete" link on JSP

2 Add code for "Delete"
a. Controller -> Service -> DAO