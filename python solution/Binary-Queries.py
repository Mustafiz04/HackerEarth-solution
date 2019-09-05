N , Q = list(map(int , input().split()))
n = list(map(int , input().split()))
cal = 0
sum1 = 0
for i in range(Q):
    inp = list(map(int , input().split()))
    if(inp[0]==1):
        if(n[inp[1]-1]==0):
            n[inp[1]-1] = n[inp[1]-1]+1
        else:
            n[inp[1]-1] = n[inp[1]-1]-1
    else:
        if(n[inp[2]-1]==1):
            print("ODD")
        else:
            print("EVEN")