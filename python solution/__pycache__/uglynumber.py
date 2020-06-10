    
x = False
number = int(input("Enter the number: "))
num = number
while(num != 1):
    if( num % 5 == 0):
        num /= 5
    elif( num % 3 == 0) :
        num /= 3
    elif( num % 2 == 0 ):
        num /= 2
    else:
        print(f'{number} is not an ugly number')
        x = True
        break
if( not x ):
    print(f'{number} is an ugly number')
