#dict
a = {1:'one',2:'two',3:'three'}

s = input('enter key : ')
print a[s]

word = {'a':'alpha','b':'betaa'}
s = raw_input('enter key : ')
print word[s]
word ['c']='cal'

s = raw_input('enter key : ')
print word[s]


country_key={'IND':'india','US':'united state','PAK':'paskistan'}

o = open('C:\Users\Tech Vision\Desktop\mydata.txt','r')

for row in o.readlines():
    
    c = row.split(',')
    
    print(c[0],c[1],c[2], country_key[c[4].replace('\n','')])
    
          










