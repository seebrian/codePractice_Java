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

you can not use target table in where clause with delete or update sentence.<br>
In order to resolve this problem, you can package select sentence's result as a new table<br>
-->DELETE P1
```
DELETE P1 
FROM Person AS P1, Person AS P2 
WHERE P1.email = P2.email and P1.Id > P2.Id
```
