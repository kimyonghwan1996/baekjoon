
input_str = input()  # 입력 문자열을 받습니다.
stack = []           # 스택을 초기화합니다.
str2 = ""            # 결과 문자열을 초기화합니다.
found_open_tag = False  # '<'를 찾았는지 여부를 나타내는 플래그 변수를 추가합니다.

for i in input_str:  # 입력 문자열을 순회합니다.
    if i == "<":      # 만약 '<' 문자를 만나면
        if stack:  # 스택에 문자가 있을 경우
            while stack:  # 스택<이 비어있지 않을 때까지
                str2 += stack.pop()  # 스택에서 문자를 꺼내어 결과 문자열에 추가합니다.
        found_open_tag = True  # '<'를 찾았음을 표시합니다.
        str2 += "<"  # '>' 문자를 결과 문자열에 추가합니다.
    elif i == ">":    # 만약 '>' 문자를 만나면
        str2 += ">"
        found_open_tag = False  # '<'와 '>' 사이의 문자열을 모두 추가했으므로 플래그를 False로 설정합니다.
    elif found_open_tag:  # '<'를 찾은 후에는
        str2 += i  # '<'와 '>' 사이의 문자열을 결과 문자열에 추가합니다.
    elif i == " " :
        if stack:  # 스택에 문자가 있을 경우
            while stack:  # 스택<이 비어있지 않을 때까지
                str2 += stack.pop()  # 스택에서 문자를 꺼내어 결과 문자열에 추가합니다.
        str2 += " "
    else:  # 그 외의 경우
        stack.append(i)  # 문자를 스택에 추가합니다.

# 스택에 남아있는 문자열을 모두 꺼내어 결과 문자열에 추가합니다.
while stack:
    str2 += stack.pop()

print(str2)  # 결과 문자열을 출력합니다.
