def solution(x):
    answer = False
    ls = list(map(int, str(x)))
    s = sum(ls)
    
    if x%s==0: answer = True
    return answer