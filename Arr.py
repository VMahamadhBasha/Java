n=int(input())
for i in range(n):
    print(*sorted(list(set(list(map(int,input().split()))))))
    