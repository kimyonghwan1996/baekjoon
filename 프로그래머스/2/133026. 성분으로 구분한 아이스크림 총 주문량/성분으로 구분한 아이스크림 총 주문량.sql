-- 코드를 입력하세요
SELECT b.INGREDIENT_TYPE, sum(a.TOTAL_ORDER) as TOTAL_ORDER
from FIRST_HALF as a
left join ICECREAM_INFO as b
on a.FLAVOR = b.FLAVOR
group by b.INGREDIENT_TYPE
order by a.TOTAL_ORDER