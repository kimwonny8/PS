def solution(s):
    answer = True
    tmp = 0
    arr=list(s)
    for i in arr:
        if i=="p" or i=="P":
            tmp += 1
        elif i=="y" or i=="Y":
            tmp -= 1
    
    if tmp!=0: answer=False
    
    return answer