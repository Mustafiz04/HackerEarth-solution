def reverseNum(x): 
	s = str(x) 
	s = s[::-1] 
	return int(s) 
	
def isMysteryNumber(n): 
	for i in range(1, n // 2 + 1): 
		j = reverseNum(i) 
		if i + j == n: 
			print(i, j) 
			return True
	return False


num = int(input("Enter the number: "))
if(isMysteryNumber(num) ):
    print(f'{num} is a muystery number')
else:
    print(f'{num} is not a mystery number')

