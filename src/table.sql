create table emp(EmpID int NOT NULL, FirstName varchar(20),LastName varchar(20),department varchar(20),PRIMARY KEY (EmpID),FOREIGN KEY (department) REFERENCES dept(department));

create table dept(department varchar(20) NOT NULL, DeptDesc VARCHAR(100), PRIMARY KEY(department));