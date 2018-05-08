#Q1
SELECT *
FROM orders;

#Q2
SELECT custID, cName, IndustryType
FROM customer;

#Q3
SELECT DISTINCT city
FROM customer;

#Q4
SELECT sName, age, salary
FROM salesperson
WHERE salary < 40000;

#Q5
SELECT *
FROM salesperson
ORDER BY salary DESC;

#Q6
SELECT *
FROM customer
WHERE city NOT IN ('New York', 'Chicago');

#Q7
SELECT *
FROM salesperson
WHERE sName LIKE 'B%';

#Q8
SELECT amount
FROM orders
WHERE orderdate BETWEEN 01/08/2000 AND 31/08/2000;

#Q9
SELECT orderNo AS 'Number of Orders', amount AS 'Total Amount'
FROM orders
WHERE salespersonID = 8;

#Q10
SELECT o.salespersonID, s.sName
FROM orders o RIGHT JOIN salesperson s
ON o.salespersonID = s.salespersonID
WHERE custID = 9;

#Q11
SELECT o.orderNo, o.amount, s.sName
FROM orders o RIGHT JOIN salesperson s
ON o.salespersonID = s.salespersonID
ORDER BY s.salespersonID DESC, o.amount DESC;

#Q12
SELECT avg(o.amount) AS 'Average Amount', max(o.amount) AS 'Maximum Amount', min(o.amount) AS 'Minimum Amount'
FROM orders o RIGHT JOIN customer c
ON o.custID = c.custID
GROUP BY c.IndustryType;

#Q13
SELECT s.sName, COUNT(o.salespersonID)
FROM salesperson s INNER JOIN orders o
ON s.salespersonID = o.salespersonID
GROUP BY o.salespersonID
HAVING COUNT(o.salespersonID) > 2;