i =1 # init
while i<10: #condition

     print(i)
     

     i = i+1#incrementer

#print in reverse
i =10
while i>0:
     print(i,end=',')
     i = i - 1

print('------------------')
#pirnt table of 4

i = 1
while i<=10:
     print(i*4)
     i=i+1
     
print('------------------')
#or
i = 4
while i<=40:
     print(i)
     i = i+4


print('------------------')
#print all odd numbers between two given input
n1 = int(input('enter start no. '))
n2 =input('enter end no. ')


#print(type(n1))
#print(type(n2))


n2 = int(n2)


if n1%2 ==0:
     n1 = n1+1
     
while n1<=n2:

     print(n1)
     n1 = n1+2

print('---------')

#### for loop
for i in range(1,11): # from 1 to 10 (last index -1) , default incrementer is 1
     print(i)
     

     
for i in range(1,11,2): # from 1 to 10 (last index -1) , default incrementer is 1
     print(i)

for i in range(10,0,-1):
     print(i)






     









     
