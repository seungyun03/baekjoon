n = int(input())
arr =list(map(int,input().split()))
max1 = max(arr)
sum = 0
for i in range(n):
    arr[i] = arr[i]/max1 * 100.0 
    sum+=arr[i]
print(sum/n)
