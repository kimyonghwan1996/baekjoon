-- 코드를 작성해주세요
select a.ID, case when a.RANKS/CNTS <= 0.25 then 'CRITICAL'
                  when a.RANKS/CNTS <= 0.5 then 'HIGH'
                  when a.RANKS/CNTS <= 0.75 then 'MEDIUM'
                  else 'LOW'
            end as COLONY_NAME
from (select *, RANK() OVER(ORDER BY SIZE_OF_COLONY DESC) AS RANKS, 
            COUNT(*) OVER() AS CNTS FROM ECOLI_DATA) a
order by 1