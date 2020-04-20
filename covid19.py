name = input('Name: ')
age = int(input('age: '))

print('\nDo you have any of these symptoms?')
fever = int(input('Fever (0 = no, 1 = yes): '))
cough = int(input('Cough (0 = no, 1 = yes): '))
sob = int(input('Shortness of breadth (0 = no, 1 = yes): '))
sore = int(input('Sore throat or runny nose (0 = no, 1= yes): '))
vomit = int(input('Vomating (0 = no, 1 = yes): '))
ill = int(input('diabetes, kidney, or heart disease (0 = no, 1 = yes): '))
epi = int(input('Have you been in epidemic region, or in contact with person \
                from that region in last 14 days (0 = n0, 1 = yes): '))

risk = fever*2 + cough*2 + sob*2 + sore + vomit + ill

print(f'\nOk, Dear {name}')
if epi == 0:
    if risk > 4:
        print("You don't have high risk of COVID 19, it's probabaly flu. ")
    else:
        print("You have low risk of COVID 19 infection.")
if epi == 1:
    if risk > 4:
        print("You have risk of infection, you should wear surgical mask and be isolated until make the test. ")
    else:
        print("You don't have COVID 19 sign, but may you have risk because of epidemic region. ")

if -1<age<41:
    rate = "0.2%"
if 41<age<51:
    rate = "0.4%"
if 50<age<61:
    rate = "1.3%"
if 60<age<71:
    rate = "3.6%"
if 70<age<81:
    rate = "8%"
if 80<age:
    rate = "14.8%"

print(f'According to your age, if you have infected, the fatality rate is: {rate}.')