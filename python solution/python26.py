n = int(input())
firstnum = 0
secondnum = 1
result = 0
for i in range(n):
    for j in range(i+1):
        firstnum = secondnum
        secondnum = result
        print(result, end=" ")
        result = firstnum + secondnum
    firstnum = 0
    secondnum = 1
    result = 0
    print()