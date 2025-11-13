n = int(input())
count = n
for i in range(n):
    a = input()
    before = a[0]
    arr = [0]*len(a)
    for k in range(0,len(a)):
        if(before!=a[k]and a[k] in arr):
            count-=1
            break
        arr[k] = a[k]
        before = arr[k]
print(count)
    