
data = [333,33323,22,323,21,2233,4,33333333,4444]


#get max value
#print (max(data))

m  = 0
ind  = 0


for i in range(0,len(data)):  # for i in range(0,10)
  
     if m<data[i]:
          m = data[i]
          ind = i+1

     

print('max value is \n',m,' at position ',ind)

