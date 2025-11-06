n = int(input())
arr =list(map(int,input().split()))
max1 = max(arr)
for i in range(n):arr[i] = arr[i]/max1 * 100.0 
print(sum(arr)/n)