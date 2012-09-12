"""
 @author Nitish Parkar
 
 Problem Statement: http://www.codechef.com/problems/INTEST
 Result: Accepted
 Time: 46.50s
 Memory: 3.7M
"""

ip = raw_input().split(' ')
n = int(ip[0])
k = int(ip[1])
count = 0
while n > 0:
    num = int(raw_input())
    if num % k == 0:
        count += 1
    n -= 1
print count
