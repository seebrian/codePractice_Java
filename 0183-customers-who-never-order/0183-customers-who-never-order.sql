# Write your MySQL query statement below
SELECT c.name AS Customers 
FROM Customers AS c
LEFT JOIN Orders AS o
on c.id = o.customerid
WHERE o.id IS NULL
