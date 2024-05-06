input_str = input().upper()
unicode_list = [ord(i) for i in input_str]
unicode_list.sort()

myDict = {}

for i in unicode_list :
    if i in myDict:
        myDict[i] += 1
    else :
        myDict[i] = 1

maxNum = max(myDict.values())
m = [key for key, value in myDict.items() if value == maxNum]

if len(m) >= 2 :
    print("?")
else :
    print(chr(m[0]))
