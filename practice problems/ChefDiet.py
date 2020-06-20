# Link to the problem statement : https://www.codechef.com/problems/DIET

for _ in range(int(input())):
    N,K=[int(x) for x in input().split()]
    a=[int(x) for x in input().split()]
    c=0
    for i in range(N):
        if a[i]>=K:
            if i+1 != N :
                a[i+1]=a[i+1]+(a[i]-K)
        else:
            print("NO "+str(i+1))
            c+=1
            break
    
    if c==0:
        print("YES")