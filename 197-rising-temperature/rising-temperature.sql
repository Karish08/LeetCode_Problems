# Write your MySQL query statement below
select e1.id from Weather e1
where e1.temperature > (
      select e2.temperature from Weather e2
      where e2.recordDate = e1.recordDate - INTERVAL 1 day
);