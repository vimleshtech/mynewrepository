emp = [[1,'raman',23],[2,'jatin',33]]


#print(emp)


print(emp[1]) #print 2nd row
print(emp[1][1]) # print 2nd row and 2nd col

for r in emp:
     #print(r)
     for c in r:
          print(c,end =' ')
     print()
          
data  = []

rs = int(input('enter row size '))
cs = int(input('enter col size '))

for i in range(0,rs):
     row = []
     for c in range(0,cs):
          d = input('enter data ')
          row.append(d)
     data.append(row)

print(data)







     








          
          









         







          
     

