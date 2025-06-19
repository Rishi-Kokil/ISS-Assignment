# Queries 1

# Create Database

```sql
CREATE DATABASE iss;
```

# Create Table

Used to define the structure of a Table. 

```sql
CREATE TABLE employee (
    employee_id CHAR(36) PRIMARY KEY,       
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    age TINYINT UNSIGNED CHECK (age <= 120),
    weight DECIMAL(5,2),
    height DECIMAL(4,1),
    dob DATE NOT NULL,
    city VARCHAR(30),
    gender CHAR(1),
    email VARCHAR(100) UNIQUE,
    salary DECIMAL(10,2),
    joining_date DATE
);

CREATE TABLE department (
    dept_id CHAR(5) PRIMARY KEY,
    dept_name VARCHAR(50) NOT NULL,
    location VARCHAR(30),
    budget DECIMAL(12,2),
    employee_id CHAR(36),
    FOREIGN KEY (employee_id) REFERENCES employee(employee_id)
);
```

# Displaying the Structure of the Table

```sql
DESCRIBE employee;
```

```sql
DESCRIBE department;
```

# Insert

Best Practice : Always specify column names in production code  avoids breakage if schema changes.

```sql
INSERT INTO employee 
(employee_id, first_name, last_name, age, weight, height, dob, city, gender, email, salary, joining_date) 
VALUES
('2001SE23ABSK', 'John', 'Smith', 26, 78.5, 186.2, '2001-03-14', 'New York', 'M', 'john@gmail.com', 75000.00, '2021-06-01'),
('2002CS45DELR', 'Alice', 'Johnson', 24, 65.2, 170.1, '2000-06-12', 'Los Angeles', 'F', 'alice.johnson@example.com', 68000.00, '2022-01-15'),
('2003IT67MNTY', 'Robert', 'Lee', 30, 85.0, 175.4, '1994-11-02', 'Chicago', 'M', 'robert.lee@example.com', 82000.00, '2020-09-10'),
('2004EC21PLOS', 'Sophia', 'Brown', 28, 60.5, 162.0, '1996-07-21', 'Houston', 'F', 'sophia.brown@example.com', 70000.00, '2021-03-05'),
('2005ME89QWEZ', 'David', 'Wilson', 35, 90.3, 180.2, '1989-02-14', 'Phoenix', 'M', 'david.wilson@example.com', 91000.00, '2019-11-20'),
('2006CE09NMKL', 'Emma', 'Davis', 22, 55.1, 158.9, '2002-05-10', 'San Diego', 'F', 'emma.davis@example.com', 64000.00, '2023-02-17'),
('2007CS33PKRT', 'James', 'Taylor', 27, 77.0, 178.0, '1997-09-09', 'Dallas', 'M', 'james.taylor@example.com', 71000.00, '2020-08-03'),
('2008IT44LKJD', 'Isabella', 'Clark', 25, 59.8, 164.5, '1999-03-29', 'San Jose', 'F', 'isabella.clark@example.com', 67500.00, '2022-04-12'),
('2009EC78POIU', 'Michael', 'Lewis', 29, 82.4, 176.3, '1995-01-18', 'Austin', 'M', 'michael.lewis@example.com', 80000.00, '2021-07-08'),
('2010ME12HJGF', 'Olivia', 'Walker', 23, 54.6, 160.0, '2001-08-26', 'Jacksonville', 'F', 'olivia.walker@example.com', 66000.00, '2023-01-01'),
('2011SE34ABCD', 'William', 'Hall', 31, 88.2, 183.0, '1993-04-05', 'Fort Worth', 'M', 'william.hall@example.com', 83000.00, '2020-06-22');

```

```sql
INSERT INTO department 
(dept_id, dept_name, location, budget, employee_id) 
VALUES
('D101', 'Engineering', 'New York', 1500000.00, '2001SE23ABSK'),
('D102', 'Finance', 'Los Angeles', 1200000.00, '2002CS45DELR'),
('D103', 'HumanRes', 'Chicago', 800000.00, '2003IT67MNTY'),
('D104', 'Marketing', 'Houston', 950000.00, '2004EC21PLOS'),
('D105', 'Sales', 'Phoenix', 1100000.00, '2005ME89QWEZ'),
('D106', 'Operations', 'San Diego', 1050000.00, '2006CE09NMKL'),
('D107', 'IT Support', 'Dallas', 980000.00, '2007CS33PKRT'),
('D108', 'R&D', 'San Jose', 1300000.00, '2008IT44LKJD'),
('D109', 'Admin', 'Austin', 750000.00, '2009EC78POIU'),
('D110', 'Logistics', 'Jacksonville', 870000.00, '2010ME12HJGF');
```

# Select

## Selecting all the entries

```sql
SELECT * FROM employee;
```

## Selecting specific columns

```sql
SELECT emp_id, first_name, gender, email FROM employee;
```

# SELECT DISTINCT

Only unique values for the column are chosen when we use **`DISTINCT`** keyword before column name. 

```sql
SELECT DISTINCT first_name FROM employee;
```

# WHERE Clause

Used to apply conditions on the selected data from the table. Output of the query is the data that satisfy the condition mentioned in the where clause.

```sql
SELECT * FROM emplyee
WHERE age < 30;
```

Using **`BETWEEN`** & **`AND`** Keyword. Further Examples of AND Keyword Later.

```sql
SELECT * FROM employee 
WHERE age BETWEEEN 30 AND 40;
```

Using **`AND`** Keyword

```sql
SELECT * FROM employee
WHERE age <= 50 AND age > 40;
```

Using **`LIKE`** Keyword. Used for pattern matching for string data. 

```sql
SELECT * FROM employee 
WHERE first_name LIKE "A%";
```

# ORDER BY Clause

Used to Sort the Result into Ascending or Descending Order. 

```sql
SELECT emp_id, first_name, age, gender
FROM employee
ORDER BY age DESC;
```

Using Order By Multiple Time of Different Attributes. In the below Example first the Result is Sorted in Ascending order of the **`first_name`** and then that result if ordered in Descending Order of the Age Retaining the Initial Order of the **`first_name`**.  

1. **`first_name`** in **ascending order (A → Z)**
2. If two or more employees have the **same `first_name`**, then among those, it sorts by **`age`** in **descending order (high → low)**.

```sql
SELECT * FROM employee
ORDER BY first_name ASC, age DESC;
```

# AND

it is used as a Logical AND operator to match two conditions. The `AND` operator displays a record if *all* the conditions are TRUE. 

The below Query Returns all the entries where age is 30 and the **`first_name`** starts with the letter **`s`. Both Conditions has to satisfy.**

```sql
SELECT * FROM employee
WHERE age = 30 AND first_name LIKE "s%";
```

# OR

It is used as a Logical OR Operator between two conditions. 

The below Query Returns all the entries where age is 30 and the **`height`**  is less than or equal to **`180.0`.  Either of the two conditions has to satisfy.**

```sql
SELECT * FROM employee
WHERE age = 30 OR height <= 180.0; 
```

# Combination of AND  & OR

```sql
SELECT * FROM employee
WHERE age = 30 OR (weight > 50.0 AND first_name LIKE "s%" ); 
```

# NULL Values

A field with a NULL value is a field with no value. It is not possible to test for NULL values with comparison operators, such as **`=, <, or <>`**

So we use two operators **`IS NULL` and `IS NOT NULL` .**

```sql
SELECT * FROM employee
WHERE city IS NULL;
```

```sql
SELECT * FROM employee
WHERE city IS NOT NULL;
```

# UPDATE

The `UPDATE` statement is used to modify the existing records in a table. Below query updates the values of the salary for all the employee where the afe is above 40 years.

```sql
UPDATE employee
SET salary = salary * 10
WHERE age > 40;
```

# DELETE

The `DELETE` statement is used to delete existing records in a table. When you don’t specify conditions then all the values of the table gets deleted.

```sql
DELETE FROM employee;
```

```sql
DELETE FROM employee
WHERE first_name = "John";
```

# INJECTION

SQL Injection is a **security vulnerability** where an attacker manipulates a query to **run malicious SQL code** by injecting it through user input fields.

This is a Vulnerable Query where an SQL Injection Attack May Retrieve all the Data. 

```sql
SELECT * FROM employee WHERE email = 'user_input';
```

If the User in the email field types this **`‘ OR ‘1’ = ‘1` . The Query becomes as below. The Output of the below query is all the data from the employee table as the where condition is always true.** 

```sql
SELECT * FROM employee WHERE email = '' OR '1'='1';
```

# LIKE

## Wildcards

In SQL We have two commonly used Wild Cards **`%`** and **`_`.** 

**`%`**-  Matches zero or more characters

**`_` -**  Matches **exactly one character.**

Below code Looks for Strings that have an in the between somewhere. So basically it looks for strings that have an as substrings. 

```sql
SELECT * FROM employee
WHERE city LIKE '%an%';
```

Below code looks for Strings that are of length 5 because the Wild Card **`_` matches exactly 1 instance.** 

```sql
SELECT * FROM employee
WHERE first_name LIKE '_____';
```

Below code searches for cities that have second letter as a, are of at-least length 3 and that ends with n. 

```sql
SELECT * FROM employee
WHERE first_name LIKE '_a%n';
```

# IN Operator

The `IN` operator allows you to specify multiple values in a `WHERE` clause. The `IN` operator is a shorthand for multiple `OR` conditions.

```sql
SELECT * FROM employee
WHERE city IN ('New York', 'Chicago', 'Dallas');
```

# BETWEEN Keyword

```sql
SELECT * FROM employee
WHERE age BETWEEN 26 AND 40;
```

```sql
SELECT * FROM employee
WHERE DOB BETWEEN '2000-01-01' AND '1980-01-01';
```

# `AS` (Aliases)

Aliases are used to give a table, or a column in a table, a temporary name. Aliases are often used to make column names more readable. An alias only exists for the duration of that query. An alias is created with the `AS` keyword.

```sql
SELECT first_name AS name, age , salary 
FROM employee
WHERE age > 30;
```

```sql
SELECT e.first_name, e.surname, d.dept_name 
FROM employee AS e , department AS d
WHERE e.emp_id = d.emp_id;
```

# SELECT TOP - Using LIMIT

Selecting top 3 youngest employee. 

```sql
SELECT * FROM employee
ORDER BY age ASC
LIMIT 3;
```

Selecting top 5 most paid employees.

```sql
SELECT * FROM employee
ORDER BY salary ASC
LIMIT 5;
```