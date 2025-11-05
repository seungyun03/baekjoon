n,m = map(int,input().split())
nums = [0] * n
for p in range(m):
    i,j,k  = map(int,input().split())
    for x in range(i,j+1):
        nums[x-1] = k
print(*nums)