N = int(input())
n = N
cnt = 0

if N < 10 :
    N * 10

while True : 
    a = N//10
    b = N%10
    N = b * 10 + (a + b) % 10
    cnt += 1
    if n == N :
        break

print(cnt)