# Write your MySQL query statement below

# Explicit vs implicit SQL joins
# SELECT e.name AS Employee FROM Employee AS e
# JOIN Employee AS m
# ON e.managerId = m.id
# AND e.Salary >= m.Salary

SELECT e.name AS Employee FROM Employee AS e, Employee AS m
where e.managerId = m.id
AND e.Salary >= m.Salary
