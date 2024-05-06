import sys
input = sys.stdin.readline

N = int(input())
rank = []

for i in range(N):
    rank.append(list(map(int, input().split())))

for i in range(N):
    count = 1
    for j in range(N):
        if i != j and rank[i][0] < rank[j][0] and rank[i][1] < rank[j][1]:
            count += 1
    print(count)