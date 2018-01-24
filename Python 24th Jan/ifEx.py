n1 = 24

#check even no.
#if condition 
if n1 % 2 == 0:
     print('even no.')


#if else
if n1 % 2 == 0:
     print(n1,' even no.')
else:
     print(n1,' odd no.')
     

#if elif elif ......
#print day name
d = int(input('enter day no. '))

if d ==1:
     print('monday')
elif d == 2:
     print('tuesday')
elif d==3:
     print('wednesday')
elif d == 4:
     print('thursday')
elif d ==5:
     print('friday')
else:
     print('weekend ')


#nested if else : if inside if
a = int(input('enter data '))
b = int(input('enter data '))
c = int(input('enter data '))

#print greater no.
if a>b and a>c:
     print('a is gt')
elif b>a and b>c:
     print('b is gt')
else:
     print('c is gt')

####
if a>b:
     if a>c:
          print('a is gt')
     else:
          print('c is gt')
else:
     if b>c:
          print('b is gt')
     else:
          print('c is gt')


          



     













     
     

     
     

     



     




     








     


