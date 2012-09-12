"""
 @author Nitish Parkar
 
 Problem Statement: http://www.codechef.com/problems/LEBOMBS
 Result: Accepted
 Time: 0.96s
 Memory: 4M
"""

t = int(raw_input())
while t > 0:
    n = int(raw_input())
    s = raw_input()
    prev = '-1'
    count = n
    for x in range(0,count):
        if s[x] == '1':
            count -= 1
            if prev == '0':
                count -= 1
            prev = '1'
        elif prev == '1':
            count -= 1
            prev = '2'
        else:
            prev = '0'
    print count
    t -= 1