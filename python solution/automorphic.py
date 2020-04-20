def automorphicnumber(n):
    sq = n*n
    while(n > 0): 
        if(n % 10 != sq % 10):
            return False
        n = n // 10
        sq = sq // 10
    return True 


number = int(input("Enter the number to be check: "))
if( automorphicnumber(number) ):
    print(f'Enter {number} is automorphic number')
else:
    print(f'Enter {number} is not automorphic number')