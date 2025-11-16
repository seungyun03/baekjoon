grades = {"A+":4.5,"A0":4.0,"B+":3.5,"B0":3.0,"C+":2.5,"C0":2.0,"D+":1.5,"D0":1.0,"F":0.0}
creditSum = 0
gpaSum = 0
for i in range(20):
    str1 = input().split()
    gpaSum += float(str1[1])*(grades.get(str(str1[2]),0))
    if(str(str1[2])=="P"):
        continue
    creditSum += float(str1[1])
print(gpaSum/creditSum)