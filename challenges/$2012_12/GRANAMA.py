'''
Created on Dec 7, 2012

@author: Nitish
'''

t = int(raw_input())

while t > 0:
    r, s = map(list, raw_input().split(" "))
    chef_declaration = None 
    if set(r) == set(s):
        chef_declaration = True
    else:
        chef_declaration = False
    
    recipe = [0] * 26
    for i in r:
        recipe[ord(i)-97] += 1
        
    for i in s:
        recipe[ord(i)-97] -= 1
        
    is_granama = True
    for i in recipe:
        if i != 0:
            is_granama = False
            break
    
    if is_granama == chef_declaration:
        print "YES"
    else:
        print "NO"  
    t -= 1

