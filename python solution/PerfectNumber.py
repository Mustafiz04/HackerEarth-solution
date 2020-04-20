def isPerfect(n):
    sum = 1
    i = 2
    while i*i <= n:
        if( n%i == 0 ):
            sum = sum + i + n/i
        i += 1
    return (True if sum == n and n!=1 else False) 


number = int(input("Enter the number: "))
if( isPerfect(number) ):
    print(f"The number {number} is perfect number ")
else:
    print(f"The number {number} is not perfect number ")
