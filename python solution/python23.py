n = int(input())

for i in range(1,n+1):
    for j in range(1,n+1):
        if( j==1 or i==j or i ==n ):
            print("*", end="")
        else:
            print(" ", end="")
    print()