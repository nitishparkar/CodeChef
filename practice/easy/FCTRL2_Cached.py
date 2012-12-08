"""
 @author Nitish Parkar
 
 Problem Statement: http://www.codechef.com/problems/FCTRL2
 Result: Accepted
 Time: 0.03s
 Memory: 4M
"""

def cached_exec(num):
    if num not in cache:
        #print cache
        cache[num] = cached_fact(num)
    return cache[num]
        

def cached_fact(n):
    if n == 1:
        return 1
    else:
        return n * cached_exec((n-1))

cache = {}
t = int(raw_input())
while t > 0:
    print cached_exec(int(raw_input()))
    t -= 1
