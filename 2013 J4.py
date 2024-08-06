T = int(input()) #Amount of time in minutes
C = int(input()) #Number of chores
chores = [0] * C
total = 0 #Total time needed
num = 0 #Number of chores

for i in range(C): chores[i] = int(input())

chores.sort() #Sort from smallest to largest

while True:
    total+=chores[0]
    if total > T: break
    del chores[0]
    num+=1

print(num)
