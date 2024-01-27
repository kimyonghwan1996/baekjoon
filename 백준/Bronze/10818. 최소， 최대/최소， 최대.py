# N 입력 받기
N = int(input())

# N개의 정수 입력 받아 리스트에 저장
integer_list = list(map(int, input().split()))

# 최솟값과 최댓값 출력
print(min(integer_list), max(integer_list))