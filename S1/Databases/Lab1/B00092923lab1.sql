DESCRIBE student;

SELECT *
FROM student;

#Q1
SELECT *
FROM emp;

#Q2
SELECT empno, ename, job
FROM emp;

#Q3
SELECT ename, deptno
FROM emp;

#Q4
SELECT empno, ename, job
FROM emp
WHERE job = "clerk";

#Q5
SELECT ename, sal
FROM emp
WHERE sal > 2850;