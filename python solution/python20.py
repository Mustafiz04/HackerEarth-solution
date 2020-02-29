# PYTHON CODE
n = int(input())
z = 1
evenmul = 0
evensum = 1
oddmul = 1
oddsum = 2
for i in range(n):
    for j in range(n-1, i, -1):
        print(" ",end="")
    if( i%2 == 0 ):
        num = i*evenmul+evensum
        evenmul+=1
        evensum+=1
    else:
        num = i*oddmul+oddsum
        oddmul+=1
        oddsum+=2
    for k in range(1,z+1):
        if( i%2 == 0 ):
            if( k%2 != 0 ):
                print(num, end="")
                num+=1
            else:
                print("*",end="")
        else:
            if( k%2 != 0 ):
                print(num, end="")
                num-=1
            else:
                print("*", end="")
    z+=2;
    print()
