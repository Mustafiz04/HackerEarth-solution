n, m = input().split()
n = int(n)
m = int(m)
arr = list(map(int, input().split()))
 
 
def search(a, x):
    for i in range(n):
        if(arr[n-i-1] == m):
            return n-i
            break
    return -1
    
print(search(arr, m))