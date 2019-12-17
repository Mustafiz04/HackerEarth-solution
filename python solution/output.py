a= [1, 2, 3, 4, 5]
for i in range(1, 5):
    a[i-1] = a[i]
print(a)