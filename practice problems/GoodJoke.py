# Link to the problem statement : https://www.codechef.com/problems/RRJOKE

t=int(input())
while(t>0):
  n=int(input())
  a=[[0]*2 for i in range(n)]
  x=0
  for i in range(0,n):
    j,k=input().split(" ")
    a[i][0]=int(j)
    a[i][1]=int(k)
  for i in range(1,n+1):
     x^=i
  print(x)
  t-=1