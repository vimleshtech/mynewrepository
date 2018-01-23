data = open(r'C:\Users\vkumar15\Desktop\Python Session -1.txt','r')
#print(data.read())

#print(data.readline())
d = data.readlines()

#print(d[10])
rc = 0
wc = 0

for l in d:
     rc=rc+1
     col = l.split(' ')
     for w in col:
          print(w)
          
          if w.replace('?','')=='Python':
               wc=wc+1
               

print('row count : ',rc)
print('python word count : ',wc)

     





