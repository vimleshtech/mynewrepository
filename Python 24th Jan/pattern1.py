#(3)	1, -4, 7, -10……………-40**
for i in range(1,41,3):
     if i % 2 ==0:
          print('-',i,end=',')
     else:
          print(i,end=',')

#(5)	(1)+(1+2)+(1+2+3)+(1+2+3+4)…………..up to n terms**

'''
(1)
(12)
(123)
1234
12345

'''
print()

for r in range(1,10):
     print('(',end='')
     for c in range(1,r+1):
          if c<r:
               print(c,'+',end='')
          else:
               print(c,end='')

     print(')+',end='')


     
