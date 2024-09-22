import sys
from collections import deque

input = sys.stdin.readline

x = int(input())
result = []
for _ in range(x):
    a, b = map(int, input().split())
    c = list(map(int, input().split()))
    queue = deque([(i, p) for i, p in enumerate(c)])
    print_order = 0

    while queue:
        # 현재 가장 앞에 있는 문서
        current = queue.popleft()

        # 현재 문서보다 중요도가 높은 문서가 있으면 뒤로 보냄
        if any(current[1] < q[1] for q in queue):
            queue.append(current)
        else:
            print_order += 1  # 인쇄 순서 증가
            if current[0] == b:  # 목표 문서가 인쇄된 경우
                print(print_order)
                break