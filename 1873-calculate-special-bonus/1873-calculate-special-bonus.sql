# Write your MySQL query statement below
/*SELECT employee_id,
iF (employee_id%2=1 AND name NOT LIKE 'M%', salary, 0 )
AS bonus 
FROM Employees;*/


SELECT employee_id , 
IF(employee_id % 2 = 1 AND name NOT LIKE 'M%',salary,0 )
AS bonus 
FROM Employees ORDER BY employee_id;

/*The format of the IF statement is
IF( condition , value_if_true , value_if_false)*/