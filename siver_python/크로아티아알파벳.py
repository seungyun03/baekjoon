s =input()
a = ["c=","c-","dz=","d-","lj","nj","s=","z="]
for i in range(len(a)):
    if s.find(a[i])!=-1: s=s.replace(a[i],"*")
print(len(s))
