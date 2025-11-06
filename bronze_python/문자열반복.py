N=int(input())
 
for i in range(N):
    T, S= input().split()
    T=int(T)
    K=''
    for i in range(len(S)):
        K=K+S[i]*T
    print(K)