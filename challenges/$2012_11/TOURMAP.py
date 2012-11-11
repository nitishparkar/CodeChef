'''
Created on Nov 11, 2012

@author: Nitish
'''


t = int(raw_input())
for x in range(t):
    endpts = {}
    paths = {}
    cost = 0

    n = int(raw_input())
    for y in range(n-1):
        src, dest, price = raw_input().split(" ")
        if src in endpts:
            del endpts[src]
        else:
            endpts[src] = 1
        if dest in endpts:
            del endpts[dest]
        else:
            endpts[dest] = 2
        paths[src] = (src, dest, price)
    
    source = ""
    
    for key, val  in endpts.items():
        if val == 1:
            source = key
            break
    
    while True:    
        tmp = paths.get(source)
        if not tmp:
            break
        print " ".join(tmp)
        cost += int(paths[source][2][:-1])
        card = paths.get(source)
        source = card[1]

    print str(cost) + "$"
