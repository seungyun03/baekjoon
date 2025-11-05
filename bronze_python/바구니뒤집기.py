n,m = map(int,input().split())
arr = [i for i in range(1,n+1)]
for i in range(m):
    i,j = map(int,input().split())
    if(i !=j):arr[i-1:j] = arr[i-1:j][::-1]
for i in range(n):print(arr[i],end=" ")