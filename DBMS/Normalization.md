**Normalization**

Normalization is a systematic process of organizing data in a database to reduce redundancy and improve data integrity. It involves dividing large tables into smaller, related ones and defining relationships between them. The main goal of normalization is to eliminate data anomalies and ensure consistent and efficient data storage.

There are several normal forms, each with specific rules and objectives:

**First Normal Form (1NF)** ensures that each column contains atomic (indivisible) values, and each record is unique. A table is in 1NF if it has no repeating groups or arrays. For instance, if a student has multiple phone numbers, they should be stored in separate rows or a related table instead of a single field.

**Second Normal Form (2NF)** builds upon 1NF and requires that all non-key attributes are fully functionally dependent on the primary key. This means that partial dependency on a composite primary key must be eliminated. If a table's non-key attribute depends on only part of a composite key, the table should be split into smaller tables.

**Third Normal Form (3NF)** further enhances 2NF by ensuring that all attributes are not only fully functionally dependent on the primary key but also non-transitively dependent. In other words, no non-key attribute should depend on another non-key attribute. This helps remove derived or indirectly dependent data and enhances the structure's logical integrity.

**Boyce-Codd Normal Form (BCNF)** is a stronger version of 3NF. A table is in BCNF if it is in 3NF and for every functional dependency, the determinant is a candidate key. This addresses anomalies that 3NF may not eliminate when a table has more than one candidate key and some dependencies violate the normal form.

Normalization helps maintain data consistency, reduces data redundancy, and makes the database structure more efficient and easier to maintain.
