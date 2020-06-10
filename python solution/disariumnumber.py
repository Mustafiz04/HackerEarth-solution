import math 

def check(n) : 
	count_digits = len(str(n)) 
	total = 0 
	x = n 
	while (x !=0) : 
		r = x % 10
		total = int(total + math.pow(r, count_digits)) 
		count_digits = count_digits - 1
		x = x/10
		
	if(total == n): 
		return 1
	else: 
		return 0
		

n = int(input("Enter the number: "))
if (check(n) == 1) : 
	print(f"{n} is a Disarium Number")
else : 
	print(f"{n} is not a Disarium Number")

