n1=int(input('enter initial number'))
n2=int(input('enter last number'))
sum1=0
avg=0

i=0

while n1<=n2:
     sum1=sum1+n1
     
     
     i=i+1
     n1=n1+1

print('sum of numbers',sum1)

avg=sum1/i

print('average of numbers',avg)
