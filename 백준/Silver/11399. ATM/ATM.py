n = int(input())
a = list(map(int, input().split()))
a.sort()

c = 0
for i in range(n):
    c += sum(a[:i+1])

print(c)