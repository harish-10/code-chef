# Link to the problem statement : https://www.codechef.com/problems/LECANDY

noOfTestCases=int(input())
while(noOfTestCases>0):
        noOfElephants,noOfCandies=[int(x) for x in input().split()]
        a=[int(x) for x in input().split()]
        if sum(a)<=noOfCandies:
            print("Yes")
        else:
            print("No")
        noOfTestCases-=1