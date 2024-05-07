n = int(input())
a = list(map(int, input().split()))
a.sort()

c = a[0]
for i in range(1, n):
    c += sum(a[:i+1]) 

print(c)