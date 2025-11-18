row = 0
col = 0
max = 0
arr = [[-1]*9 for i in range(9)]
for i in range(9):
    stor = list(map(int,input().split()))
    for k in range(9):
        arr[i][k] = stor[k]
        if(arr[i][k]>max):
            max=arr[i][k]
            row = i
            col = k
print(max)
print(f"{row+1} {col+1}")