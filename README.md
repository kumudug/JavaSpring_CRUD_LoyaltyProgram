# JavaSpring_CRUD_LoyaltyProgram
__CRUD operation demo using spring__

1. Download **_MariaDB_** (Same as MySQL but open source)

    1.1 Start it by  `bin\mysqld --console`

    1.2 Create a db
    + Go to bin folder in another command prompt
    + `mysql -u root -p`
    + Just enter for password
    + Once connected use the below command to create the db
    + `create database friends;`
    
    1.3 Create template project using spring initializer
    + Go to [https://start.spring.io/](https://start.spring.io/)  
    + Create a project with __Web__, __JPA__ [Java presistance api], __MySQL__ as dependencies
    ![IMG](https://github.com/kumudug/JavaSpring_CRUD_LoyaltyProgram/blob/master/SpringInitFriends.png)

    1.4 Open the project in Intelij by selecting
    + Import project
    + Choose the .gradle build file
    
    1.5 Run the application
    + You can run the application using `./gradlew bootRun` or `gradlew bootRun` in windows
    
    1.6 After you run it for the first time hibrenate is going to create the tables. To see this
    + Start the MariaDB server if you haven't already done so `bin\mysqld --console`
    + Connect to MariaDB `mysql -u root -p` [Just enter for password. MariaDB doesn't have passwords]
    + `use friends`
    + `show tables;`
    + You shoud see somethng like below
    
    ![IMG](https://github.com/kumudug/JavaSpring_CRUD_LoyaltyProgram/blob/master/MariaDBOutput1.png)

    + To see table details `describe friend;`
    
    1.7 Insert a few records
    + `insert into friend values(null, 'FName2', 'LName2');`