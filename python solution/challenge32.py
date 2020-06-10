row = int(input("Enter the length of row: "))
col = int(input("Enter the length of column: "))

for r in range(row):
    for c in range(col):
        if( (c == 0) or ((c == col-1) and ( r != 0 and r != row-1 )) ):
            print("*", end=" ")
        elif( (r == 0  or r == row-1) and ( c > 0 and c < col-1 ) ):
            print("*", end=" ")
        else:
            print(" ", end=" ")
    print()