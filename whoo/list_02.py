cnt = int(input())

num = list(map(int, input().split()))
max = num[0]
min = num[0]


for i in num:
    if max < i:
        max = i

        

    if i < min:
        min = i
        
    
print(min, max)

