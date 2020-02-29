n = int(input())

for i in range(1,n+1):
    for j in range(1,n+1):
        if(i == j or i+j == n+1):
            print("X", end=" ")
        else:
            print("O", end=" ")
    print()