n = int(input())
 
for j in range(n):
    t = 0
    st = input()
    for i in range(len(st)):
        if(st[i] == "A" or st[i] == "a" or st[i] == "E" or st[i] == "e" or st[i] == "I" or st[i] == "i" or st[i] == "o" or st[i] == "O" or st[i] == "U" or st[i] == "u"):
            t += 1
    print(t)