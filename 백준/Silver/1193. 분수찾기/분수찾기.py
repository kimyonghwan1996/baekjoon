x = int(input())

line = 1
end = 1

# 대각선 그룹 찾기
while x > end:
    line += 1
    end += line

# 대각선에서의 위치 찾기
diff = end - x

if line % 2 == 0:
    numerator = line - diff
    denominator = 1 + diff
else:
    numerator = 1 + diff
    denominator = line - diff

print(f"{numerator}/{denominator}")
