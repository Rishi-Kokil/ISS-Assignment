# Queries 2

### **INNER JOIN**

Returns only the records that match in both tables. Only employees who are assigned to a department will be shown. 

```sql
SELECT e.first_name, e.last_name, d.dept_name, d.location
FROM employee AS e
INNER JOIN department AS d
ON e.employee_id = d.employee_id;
```

### **LEFT JOIN**

Returns all employees, even if they don’t have a department. Department will be `NULL` for employees without one.

```sql
SELECT e.first_name, e.last_name, d.dept_name
FROM employee AS e
LEFT JOIN department AS d
ON e.employee_id = d.employee_id;
```

### **RIGHT JOIN**

Returns all departments, even if there is no employee assigned. Employee fields will be `NULL` for departments without an assigned employee.

```sql
SELECT e.first_name, e.last_name, d.dept_name
FROM employee AS e
RIGHT JOIN department AS d
ON e.employee_id = d.employee_id;
```

### **FULL OUTER JOIN**

Returns all records from both tables, matched where possible.

**MySQL does not support FULL JOIN directly.** Use `UNION` of `LEFT JOIN` and `RIGHT JOIN`.

```sql
SELECT e.first_name, e.last_name, d.dept_name
FROM employee AS e
LEFT JOIN department AS d
ON e.employee_id = d.employee_id

UNION

SELECT e.first_name, e.last_name, d.dept_name
FROM employee AS e
RIGHT JOIN department AS d
ON e.employee_id = d.employee_id;
```

# **UNION**

Returns combined results from two or more `SELECT` statements (removes duplicates by default).

```sql
SELECT city AS location FROM employee
UNION
SELECT location FROM department;
```

If we want to keep the Duplicate Rows then we use `UNION ALL`

```sql
SELECT city AS location FROM employee
UNION ALL
SELECT location FROM department;
```

# **SELECT INTO**

`SELECT INTO` is used to copy data into a **new table**.

```sql
SELECT * INTO employee_backup
FROM employee
WHERE city = 'New York';
```

Note: In MySQL, We use `CREATE TABLE ... AS` instead of the above query

```sql
CREATE TABLE employee_backup AS
SELECT * FROM employee
WHERE city = 'New York';
```

# **CREATE DATABASE**

```sql
CREATE DATABASE company_data;
```

# **CREATE TABLE**

Already covered in your schema, but here's an example:

```sql
CREATE TABLE sample_table (
    id INT PRIMARY KEY,
    name VARCHAR(50)
);
```

# **CONSTRAINTS**

Constraints like `NOT NULL`, `UNIQUE`, `CHECK`, `PRIMARY KEY`, `FOREIGN KEY`, etc. are added during table creation.

Example with multiple constraints:

```sql
CREATE TABLE product (
    product_id INT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    price DECIMAL(10,2) CHECK (price >= 0),
    category_id INT,
    status VARCHAR(10) DEFAULT 'Active',
    UNIQUE (name),
    FOREIGN KEY (category_id) REFERENCES category(id)
);
```

# **DEFAULT**

```sql
CREATE TABLE employees (
    id INT PRIMARY KEY,
    status VARCHAR(10) DEFAULT 'Active'
);
```

# **CREATE INDEX**

```sql
CREATE INDEX idx_email ON employee(email);
```

# **DROP**

```sql
DROP TABLE employee_backup;
DROP DATABASE company_data;
```

# **ALTER**

```sql
ALTER TABLE employee ADD COLUMN phone VARCHAR(15);
ALTER TABLE employee DROP COLUMN phone;
ALTER TABLE employee MODIFY COLUMN salary DECIMAL(12,2);
```

# **AUTO_INCREMENT**

```sql
CREATE TABLE log (
    log_id INT AUTO_INCREMENT PRIMARY KEY,
    message TEXT
);
```

# **VIEWS**

```sql
CREATE VIEW high_salary_employees AS
SELECT first_name, last_name, salary
FROM employee
WHERE salary > 80000;
```

# **NULL VALUES**

```sql
SELECT * FROM employee
WHERE employee_id NOT IN (SELECT employee_id FROM department);

SELECT * FROM employee
WHERE email IS NULL;
```

# **GROUP BY**

```sql
SELECT city, COUNT(*) AS employee_count
FROM employee
GROUP BY city;
```

# **HAVING**

Used to filter after `GROUP BY`.

```sql
SELECT city, COUNT(*) AS employee_count
FROM employee
GROUP BY city
HAVING COUNT(*) > 2;
```

# **Functions (Aggregate)**

```sql
-- Total salary
SELECT SUM(salary) FROM employee;

-- Average salary
SELECT AVG(salary) FROM employee;

-- Highest salary
SELECT MAX(salary) FROM employee;

-- Lowest salary
SELECT MIN(salary) FROM employee;

-- Count employees
SELECT COUNT(*) FROM employee;
```

# **NULL Functions**

```sql
SELECT first_name, IFNULL(email, 'No Email Provided') AS contact
FROM employee;
```

```sql
SELECT first_name, COALESCE(email, 'default@example.com') AS contact
FROM employee;
```