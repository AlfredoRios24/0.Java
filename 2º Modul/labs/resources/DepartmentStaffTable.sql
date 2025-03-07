# JavaDB Database setup
# JDBC URL: jdbc:derby://localhost:1527/EmployeeDB
# User: public
# Password: tiger

DROP TABLE DEPARTMENT;
DROP TABLE STAFF;

CREATE TABLE DEPARTMENT (
	DEPTID VARCHAR(10) NOT NULL,
	MGRID INTEGER NOT NULL,
	DEPTNAME VARCHAR(40) NOT NULL,
	PRIMARY KEY (DEPTID)
);

CREATE TABLE STAFF (
	MGRID INTEGER NOT NULL,
	EMPID INTEGER NOT NULL
);

# Three departments
INSERT INTO DEPARTMENT VALUES ('A34-108', 190, 'Global Marketing');
INSERT INTO DEPARTMENT VALUES ('A45-901', 130, 'Sales');
INSERT INTO DEPARTMENT VALUES ('E101-902', 102, 'Engineering');

# Global Marketing
INSERT INTO STAFF VALUES (190, 110);
INSERT INTO STAFF VALUES (190, 123);
INSERT INTO STAFF VALUES (190, 201);
INSERT INTO STAFF VALUES (190, 101);
INSERT INTO STAFF VALUES (190, 120);

# Sales
INSERT INTO STAFF VALUES (130, 129);
INSERT INTO STAFF VALUES (130, 133);
INSERT INTO STAFF VALUES (130, 211);
INSERT INTO STAFF VALUES (130, 151);
INSERT INTO STAFF VALUES (130, 200);

# Engineering
INSERT INTO STAFF VALUES (102, 111);
INSERT INTO STAFF VALUES (102, 124);
INSERT INTO STAFF VALUES (102, 202);
INSERT INTO STAFF VALUES (102, 121);
INSERT INTO STAFF VALUES (102, 191);
