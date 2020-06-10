row = int(input("Enter the row length: "))
col = int(input("Enter the column length: "))

for r in range(row):
    for c in range(col):
        if( (c ==0) or (((r == 0) or r == row-1) and c > 0 ) ):
            print("*",end="")
        else:
            print(" ", end=" ")
    print()
