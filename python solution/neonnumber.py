def checkneon(num):
    sqr = num*num
    sum = 0
    while( sqr > 0 ):
        sum = sum + sqr%10
        sqr = sqr // 10

    if( sum == num ):
        print(f'{num} is a neon number')
    else:
        print(f'{num} is not a neon number')


num = int(input("Enter the number: "))
checkneon(num)
