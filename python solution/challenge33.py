row = int(input("Enter the length of rows: "))
col = int(input("Enter the length of columns: "))

for r in range(row):
    for c in range(col):
        if( c == 0 or (c > 0 and (r == 0 or r ==  row-1 or r == (row-1)//2)  ) ):
            print("*", end="")
        else:
            print(end=" ")
    print()