#Q1
SELECT ename, sal
FROM emp
WHERE sal > 2850;

#Q2
SELECT ename, sal
FROM emp
WHERE sal < 2500;

#Q3
SELECT ename, deptno
FROM emp
WHERE empno = 7566;

#Q4
SELECT ename, sal
FROM emp
WHERE sal < comm;

#Q5
SELECT ename, sal
FROM emp
WHERE sal BETWEEN 1500 AND 3000;

#Q6
SELECT ename, sal
FROM emp
WHERE sal NOT BETWEEN 1500 AND 2850;

#Q7
SELECT ename, job, hiredate
FROM emp
WHERE hiredate BETWEEN '1981-02-20' AND '1981-05-01';

#Q8
SELECT ename, deptno
FROM emp
WHERE deptno IN (10,30);

#Q9
SELECT *
FROM emp
WHERE job NOT IN ('clerk', 'manager', 'salesman');

#Q10
SELECT *
FROM emp
WHERE ename LIKE 'B%' AND job NOT IN ('clerk', 'manager', 'salesman');

#Q11
SELECT ename, sal, (sal*12) 'Annual Salary'
FROM emp;

#Q12
SELECT ename, job, deptno, hiredate
FROM emp
ORDER BY ename ASC;

#Q13
SELECT deptno, ename, job, hiredate
FROM emp
ORDER BY deptno ASC, ename;

#SINGLE ROW FUNCTIONS
#Q1
SELECT curdate();

#Q2
SELECT ename, FLOOR (DATEDIFF(curdate(),hiredate)/365) 
FROM emp;

#GROUP FUNCTIONS
#Q3
SELECT sum(sal)
FROM emp;

#Q4
SELECT Min(sal) AS 'Minimum Salary'
FROM emp;

#Q5
SELECT Max(sal) AS 'Maximum Salary', Min(sal) AS 'Minimum Salary', AVG(sal) AS 'Average Salary'
FROM emp;

#Q6
SELECT COUNT(mgr) as 'Number of Managers'
FROM emp
WHERE job = 'MANAGER';

#Q7
SELECT COUNT(ename)
FROM emp;

#Q8
SELECT COUNT(*)
FROM emp
WHERE deptno = 20;