"""
 @author Nitish Parkar
 
 Problem Statement: http://www.codechef.com/problems/FCTRL2
 Result: Accepted
 Time: 0.05s
 Memory: 3.7M
"""

def fact(n):
    if n == 1:
        return 1
    else:
        return n * fact(n-1)

facts = {}
t = int(raw_input())
while t > 0:
    print fact(int(raw_input()))
    t -= 1
