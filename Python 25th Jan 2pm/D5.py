data = []

l = int(input('enter size of array '))

s = 0
avg = 0

for i in range(0,l):
     d = input('enter data ')
     data.append(int(d)) #insert to list
     s = s+ int(d)


avg = s / l

for e in data:
     if e>avg:
          print(e)
          
    
     
