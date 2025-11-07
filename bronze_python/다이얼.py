a = input()
sum = 0
for i in range(len(a)):
    if(ord(a[i])>64 and ord(a[i])<=79):sum+=int(((ord(a[i])-59)/3))+1
    elif ord(a[i])>79 and ord(a[i])<=83: sum+=8
    elif ord(a[i])>83 and ord(a[i])<=86: sum +=9
    else: sum+=10
print(int(sum))