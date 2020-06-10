MAX_ITERATIONS = 20
def isLychrel(number): 
	for i in range(MAX_ITERATIONS): 
		number = number + reverse(number) 
		if (isPalindrome(number)): 
			return False
	return True

def isPalindrome(number): 
	return number == reverse(number)


def reverse(number): 
	reverse = 0
	while (number > 0): 
		remainder = number % 10
		reverse = (reverse * 10) + remainder
		number = int(number / 10)
	return reverse 

number = int(input("Ente the number: ")) 
if( isLychrel(number) ):
    print(f'{number} is Lychrel Number')
else:
    print(f'{number} is not Lychrel Number')
