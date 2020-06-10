num = int(input("Enter the number: "))
flag = False

for n in range(num):
    if( n*(n+1) == num ):
        flag = True
        break

if(flag):
    print(f'{num} is the pronic number as it is product of {n} and {n+1}.')
else:
    print(f'{num} is not the pronic number.')