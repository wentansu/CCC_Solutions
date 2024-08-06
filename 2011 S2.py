N = int(input())
response = [""] * N
answer = [""] * N
C = 0 #Number of correct answers

for i in range(N): response[i] = str(input())
for i in range(N): answer[i] = str(input())

for i in range(N):
    if response[i] == answer[i]: C+=1

print(C)
