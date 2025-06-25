# **Callable Statement, Prepared Statement, Stored Procedure**

### **Callable Statement**

A Callable Statement is used to call a Stored Procedure. In most programming languages like Java or Python, the **`CallableStatement`** object is used to execute procedures from backend code. In SQL, it is invoked using the `CALL` keyword.

```sql
CALL procedure_name(parameters);
```

This can only be done after the procedure has been created.

### **Prepared Statement**

Prepared Statements are used to execute parameterized SQL statements multiple times safely and efficiently.

They use three commands:

- `PREPARE` – defines the SQL statement
- `EXECUTE` – runs the prepared statement with parameters
- `DEALLOCATE PREPARE` – frees up the statement from memory

Example 1: Calculate hypotenuse of a right-angled triangle

```sql
SET @s = 'SELECT SQRT(POW(?, 2) + POW(?, 2)) AS hypotenuse';
SET @a = 6;
SET @b = 8;
PREPARE stmt FROM @s;
EXECUTE stmt USING @a, @b;
DEALLOCATE PREPARE stmt;
```

Example 2: Select all records from the `employee` table

```sql
SET @table = 'employee';
SET @s = CONCAT('SELECT * FROM ', @table);
PREPARE stmt FROM @s;
EXECUTE stmt;
DEALLOCATE PREPARE stmt;
```

### **Stored Procedure**

A Stored Procedure is a group of SQL statements stored in the database under a name. It can accept parameters and be executed repeatedly.

To define a stored procedure in MySQL, use the `DELIMITER` command to temporarily change the delimiter for defining the procedure block.

Example 1: Get employees by city

```sql
DELIMITER //

CREATE PROCEDURE GetEmployeesByCity(IN city_name VARCHAR(30))
BEGIN
    SELECT first_name, last_name, city, salary
    FROM employee
    WHERE city = city_name;
END //

DELIMITER 
```

To call the procedure:

```sql
CALL GetEmployeesByCity('New York');
```

Example 2: Count employees in each department

```sql
DELIMITER //

CREATE PROCEDURE CountEmployeesByDepartment()
BEGIN
    SELECT d.dept_name, COUNT(e.employee_id) AS emp_count
    FROM department d
    LEFT JOIN employee e ON d.employee_id = e.employee_id
    GROUP BY d.dept_name;
END //

DELIMITER ;
```

To call the procedure:

```sql
CALL CountEmployeesByDepartment();
```