hs = int( input('enter mark in hs :'))
es = int( input('enter mark in es :'))
cs = int( input('enter mark in cs :'))
ms = int( input('enter mark in ms :'))


total = hs+es+cs+ms
avg = total/4

print('Total score is : ',total,' Avg :',avg,end=' ')


if avg>=70:
     print('A')
elif avg>=60 : #and avg<70
     print('B')
elif avg>=50:
     print('C')
else:
     print('D')

     
 









