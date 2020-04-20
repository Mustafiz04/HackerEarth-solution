height = int(input("Enter the height: "))
width = int(input("Enter the width: "))
wH = height-1
x = wH

for i in range(0, wH+1):
    for j in range(0, width*wH*2+1 ):
        if( j% (wH*2) == x or j%(wH*2) == wH + i ):
            print("*", end="")
        else:
            print(" ", end='')
    x -= 1
    print()
