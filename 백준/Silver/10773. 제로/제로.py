import sys

input = sys.stdin.readline

x = int(input())
result = []
for _ in range(x):
    a = int(input())
    if a != 0:
        result.append(a)
    else :
        result.pop()

print(sum(result))