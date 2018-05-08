#Q1
SELECT deptno, COUNT(*) AS 'Number of Employees'
FROM emp
GROUP BY deptno
HAVING COUNT(*) > 4;

#Q2
SELECT mgr, sal AS 'Lowest Paid Salary'
FROM emp
GROUP BY mgr
HAVING sal > 1000
ORDER BY sal ASC;

#Q3
SELECT e.ename, e.empno, d.deptno, d.dname
FROM emp e RIGHT JOIN dept d
ON e.deptno = d.deptno;

#Q4
SELECT d.deptno, d.dname, d.loc, e.empno, e.ename
FROM emp e RIGHT JOIN dept d
ON e.deptno = d.deptno;

#Q5
SELECT d.deptno, d.dname, e.ename
FROM emp e INNER JOIN dept d
ON e.deptno = d.deptno
ORDER BY e.deptno ASC, d.deptno ASC;

#Q6
SELECT d.deptno, d.dname, SUM(sal + IFNULL(comm,0))
FROM emp e INNER JOIN dept d
ON e.deptno = d.deptno
GROUP BY deptno;

#Q7
SELECT d.deptno, d.dname, COUNT(*)
FROM emp e INNER JOIN dept d
ON e.deptno = d.deptno
GROUP BY deptno;

#Q8
SELECT d.deptno, d.dname, COUNT(*)
FROM emp e INNER JOIN dept d
ON e.deptno = d.deptno
GROUP BY deptno
HAVING COUNT(*) > 4;

#Q9
SELECT ename, g.grade
FROM emp e INNER JOIN salgrade g
ON e.sal >= g.losal AND e.sal <= g.hisal;

#Q10
SELECT ename, g.grade, e.job, e.sal
FROM emp e INNER JOIN salgrade g
ON e.sal >= g.losal AND e.sal <= g.hisal;