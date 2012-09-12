"""
 @author Nitish Parkar
 
 Problem Statement: http://www.codechef.com/problems/HS08TEST
 Result: Accepted
 Time: 0.16s
 Memory: 4M
"""

ip = raw_input()
words = ip.split(' ')
cash = int(words[0])
if cash % 5 != 0:
    print words[1]
else:
    balance = float(words[1])
    cash += 0.50
    if cash <= balance:
        balance -= cash
    print balance