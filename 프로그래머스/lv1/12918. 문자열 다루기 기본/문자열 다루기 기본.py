def solution(s):
    ls = list(s)
    
    answer = True
    
    if len(ls)==4 or len(ls)==6:
        for i in ls:
            if i.isdigit()==False:
                answer = False
                break
                
    else : answer = False 
    return answer