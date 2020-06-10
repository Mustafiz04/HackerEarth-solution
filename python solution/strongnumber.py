f = [None] * 10

def preCompute() : 
    f[0] = f[1] = 1
    for i in range(2,10) : 
        f[i] = f[i-1] * i 
   

def isStrong(x) : 
    factSum = 0
    temp = x 
    while (temp) : 
        factSum = factSum + f[temp % 10] 
        temp = temp // 10
    return (factSum == x) 

num = int(input("Enter the number: "))
preCompute()
if( isStrong(num) ):
    print(f'{num} is a strong number. ')
else:
    print(f'{num} is not a strong number. ')

