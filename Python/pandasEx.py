import pandas as pd

ar = [21,2,2,3,2,22]

print ar
df = pd.DataFrame(data=ar)
print(df)


ar = [ [100,'nitin',28], [1001,'nitin',28],[300,'abcd',38]]
df = pd.DataFrame(data=ar)
print(df)

#print name
print df[1]

print df.columns

###
dd = pd.read_csv(r'C:\Users\Tech Vision\Desktop\testdata.csv')
print(dd)
print(dd['name'])

print dd.groupby(by='gender').count()

print dd.groupby(by='gender').count()['name']

print dd.groupby(by='gender').sum()

print dd.groupby(by='gender').max()

print dd.groupby(by='gender').min()


## describe : show basics stat
print dd.describe()
'''
count
avg/mean
std dev
min
25%
50%
75%
max

'''
print df.head(n=2)
print df.tail(3)

















