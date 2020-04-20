n = int(input())

for i in range(1, n+1):
    for j in range(0, i-1):
        print(" ", end="")
    for k in range(1, i+1):
        print("*", end="")
    print()

for i in range(n-1, 0, -1):
    for j in range(i-1, 0, -1):
        print(" ", end="")
    for k in range(i, 0, -1):
        print("*", end="")
    print()