def isFascinating(n):
    strNum = str(n) + str(n*2) + str(n*3)
    freq = [0]*11
    
    for i in range( len(strNum) ):
        digit = int(strNum[i])
        freq[digit] += 1

    for i in range(1, 10) : 
        if freq[i] == 0 : 
            return False
    return True


num = int(input("Enter the 3 digit number: "))
if(isFascinating(num)):
    print(f'{num} is a fascinating number.')
else:
    print(f'{num} is a not fascinating number.')
