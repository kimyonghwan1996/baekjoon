#  10828번 - 스택
import sys
input = sys.stdin.readline

n = int(input())

stack = []

for i in range(n):
    x = input().split()
    if x[0] == "push":
        stack.append(x[1])
    elif x[0] == "pop":
        if stack:
            print(stack.pop())
        else :
            print(-1)
    elif x[0] == "size":
        print(len(stack))
    elif x[0] == "empty":
        if stack:
            print(0)
        else :
            print(1)
    elif x[0] == "top":
        if stack:
            print(stack[-1])
        else :
            print(-1)