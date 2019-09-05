n = int(input())
 
for i in range(n):
    a = int(input())
    total = 0
    for j in range(1,a):
        if( a%j == 0):
            total+=j
    print(total) 