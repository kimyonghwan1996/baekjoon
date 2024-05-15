import sys
input=sys.stdin.readline

n = int(input())
swi = list(map(int,input().split()))
stu = int(input())

def switch(swi, index):
    swi[index] = 1 if swi[index] == 0 else 0


for _ in range(stu) :
    a, b = map(int,input().split())
    if a == 1 :
        for i in range(b - 1, n, b):
            switch(swi, i)
    
    if a == 2 :
        b -= 1  # 0부터 시작하는 인덱스로 조정
        switch(swi, b)
        x = 1
        while b - x >= 0 and b + x < n and swi[b - x] == swi[b + x]:
            switch(swi, b - x)
            switch(swi, b + x)
            x += 1
            
for i in range(0, n, 20):
    print(' '.join(map(str, swi[i:i + 20])))