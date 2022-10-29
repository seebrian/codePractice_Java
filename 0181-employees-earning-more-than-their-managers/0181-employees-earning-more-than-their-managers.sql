# Write your MySQL query statement below
SELECT e.name AS Employee FROM Employee AS e
, Employee AS m
where e.managerId = m.id
AND e.Salary >= m.Salary
