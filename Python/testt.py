import pandas as pd

dd=pd.read_csv(r'C:\Users\Tech Vision\Desktop\super.csv')
print(dd.columns)
#print(dd['City'])
print dd.groupby(by='Category').sum()["Profit"]

