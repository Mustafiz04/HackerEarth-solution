import math

n = int(input("Enter the number: "))
x = math.sqrt(n+1)

if( (x - math.floor(x)) == 0 ):
    print(f'{n} is a sunny number')
else:
    print(f'{n} is not a sunny number')