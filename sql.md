## 595. Big Countries
[Leetcode](https://leetcode.com/problems/big-countries/)

## 627. Swap Salary
[Leetcode](https://leetcode.com/problems/swap-salary/description/)

## 620. Not Boring Movies
[Leetcode](https://leetcode.com/problems/not-boring-movies/)

## 596. Classes More Than 5 Students
[Leetcode](https://leetcode.com/problems/classes-more-than-5-students/submissions/)

'Having' with 'group by'

## 182. Duplicate Emails
[Leetcode](https://leetcode.com/problems/duplicate-emails/)

```
SELECT email FROM Person 
GROUP BY email 
HAVING COUNT(*)>1
```

## 196. Delete Duplicate Emails
[Leetcode](https://leetcode.com/problems/delete-duplicate-emails/description/)

you can not use target table in where clause with delete or update sentence.<br>
In order to resolve this problem, you can package select sentence's result as a new table<br>
-->DELETE P1
```
DELETE P1 
FROM Person AS P1, Person AS P2 
WHERE P1.email = P2.email and P1.Id > P2.Id
```

## 175. Combine Two Tables
[Leetcode](https://leetcode.com/problems/combine-two-tables/description/)

```
SELECT firstName, lastName, city, state 
FROM Person
LEFT JOIN Address 
ON Person.personId = Address.personId
```

## 181. Employees Earning More Than Their Managers
[Leetcode](https://leetcode.com/problems/employees-earning-more-than-their-managers/description/)
rename name to employee in result table (using AS)
```
# Explicit vs implicit SQL joins
SELECT e.name AS Employee FROM Employee AS e
JOIN Employee AS m
ON e.managerId = m.id
AND e.Salary >= m.Salary

SELECT e.name AS Employee FROM Employee AS e, Employee AS m
where e.managerId = m.id
AND e.Salary >= m.Salary

```


## 183. Customers Who Never Order
[Leetcode](https://leetcode.com/problems/customers-who-never-order/)
```
SELECT c.name AS Customers 
FROM Customers AS c
LEFT JOIN Orders AS o
on c.id = o.customerid
WHERE o.id IS NULL
```

## 184. Department Highest Salary
[Leetcode](https://leetcode.com/problems/department-highest-salary/)
```
SELECT d.name AS Department, A.name AS Employee, A.salary
FROM 
	Employee A,
	Department D   
WHERE A.DepartmentId = D.Id 
  AND NOT EXISTS 
  (SELECT 1 FROM Employee B WHERE B.Salary > A.Salary AND A.DepartmentId = B.DepartmentId) 
 ```
