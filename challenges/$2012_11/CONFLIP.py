'''
Created on Nov 11, 2012

@author: Nitish
'''

t = int(raw_input())
for x in range(t):
    g = int(raw_input())
    for y in range(g):
        i, n, q = map(int, raw_input().split(" "))
        if n % 2 == 0:
            print n / 2
        else:
            if i == q:
                print (n - 1) / 2
            else:
                print (n + 1) / 2


