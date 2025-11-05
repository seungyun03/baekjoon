lis = [0]*30
count = 0
for i in range(28):#sort안쓰고 순수 정렬해보기
    num = int(input())
    lis[num-1] = num
for i in range(30):
    if(lis[i]==0):
        print(i+1)


        


 

    
    

