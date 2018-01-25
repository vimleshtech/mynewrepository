data = []

l = int(input('enter size of array '))

for i in range(0,l):
     d = input('enter data ')
     data.append(d) #insert to list
     #data.append(input('enter data '))
     


#print(data)
for d in data:
     print(d)
     
d = input('enter data which you want to delete :')

data.remove(d)

print('---------------')
for d in data:
     print(d)
