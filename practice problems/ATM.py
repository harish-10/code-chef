# Link to the problem statement : https://www.codechef.com/problems/HS08TEST

amt,balance=[float(x) for x in input().split()]
if int(amt)%5==0 and amt+0.5<=balance:
  balance-=amt+0.5

print ("%.2f" % balance)