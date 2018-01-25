a =111 # auto memory allocation
print(type(a))

a ='111'
print(type(a))


a = True
print(type(a))


a =[11,2,2,3,'aaa']
print(type(a))



data = open(r'C:\Users\vkumar15\Desktop\GIT Log.txt','r')

#data.read() # read entire file

#data.readline() # read first line

rc  = 0

for row in data.readlines(): #read line by line
     #print(row)
     rc = rc+1

print('row count :',rc)

     
     
     
