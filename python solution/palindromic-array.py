<<<<<<< HEAD

def palArray(arr, n):
    yes = True
    for i in range(n):
        if( arr[i] == reverse(arr[i])):
            yes = True
        else:
            yes = False
            break
    return yes

def reverse(num):
    rev = 0
    while( num > 0):
        l = num % 10
        rev = rev*10 + l
        num = num//10
    return rev

t = int(input())
for i in range(t):
    n = int(input())
    arr = list(map(int, input().strip().split()))
    if palArray(arr, 3):
        print("Yes")
    else:
        print("No")


=======

def palArray(arr, n):
    yes = True
    for i in range(n):
        if( arr[i] == reverse(arr[i])):
            yes = True
        else:
            yes = False
            break
    return yes

def reverse(num):
    rev = 0
    while( num > 0):
        l = num % 10
        rev = rev*10 + l
        num = num//10
    return rev

t = int(input())
for i in range(t):
    n = int(input())
    arr = list(map(int, input().strip().split()))
    if palArray(arr, 3):
        print("Yes")
    else:
        print("No")


>>>>>>> 366dafd5b5dc1ecafc996d94ea1eeb0ac45229e6
