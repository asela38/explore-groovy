
@GrabConfig(systemClassLoader = true)
@Grapes([
        @Grab("mysql:mysql-connector-java:5.1.46")
]
)

import groovy.sql.Sql

def sql = Sql.newInstance("jdbc:mysql://localhost:3306/users", "root", "", "com.mysql.jdbc.Driver")

sql.dataSet("user").each {println it}

sql.dataSet("user").add([firstname: "XXX", lastname: "zzzz", email:"a@b.com"])


sql.eachRow("select * from user") {
    println "User name= ${it.firstname} ${it.lastname}"
}
sql.close()

/**
 create database users;
 use users;

 CREATE TABLE user (
 id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
 firstname VARCHAR(30) NOT NULL,
 lastname VARCHAR(30) NOT NULL,
 email VARCHAR(50),
 reg_date TIMESTAMP
 );

 INSERT INTO  user
 (firstname, lastname, email, reg_date)
 values
 ("AAA", "BBBB", "aa@bb.com", now())
 ,("CCC", "DDDD", "cc@dd.com", now())

 ;

 select * from user;


 **/