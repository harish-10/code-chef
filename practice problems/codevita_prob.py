def decimalToBinary(n):
    return bin(n).replace("0b", "")


t = int(input())
while t > 0:
    n = int(input())
    print(len(decimalToBinary(n)))
    t -= 1
