'''
Created on Oct 9, 2012

@author: Nitish
'''

def solve():
    levels = {}
    power = 0
    N, M = map(int, raw_input().split())
    for i in xrange(N):
        C, L = map(int, raw_input().split())
        if L in levels:
            levels[L] += C 
        else:
            levels[L] = C
    for f in xrange(M):
        C, L = map(int, raw_input().split())
        levels[L] -= C
    #print levels
    for key, value in levels.items():
        if value < 0:
            power += value
    
    print abs(power)    

if __name__ == '__main__':
    T = int(raw_input())
    while T > 0:
        solve()
        T -= 1