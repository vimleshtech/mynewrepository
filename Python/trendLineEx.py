import pandas as pd
import quandl as qdl   # dataset 
from scipy.stats import linregress
import numpy as np

'''
data = np.array([['','date_id','Adj. High','Adj. Low'],
                [0,2010,10,5],
                [1,2011,12,7],
                 [2,2012,15,10],
                 [3,2013,16,12],
                 [4,2014,17,13],
                 [5,2015,18,12],
                 [6,2016,20,11],
                 [7,2017,25,18]                 
                 ])
                
print(pd.DataFrame(data=data[1:,1:],
                  index=data[1:,0],
                  columns=data[0,1:]))



data = pd.DataFrame(data=data[1:,1:],
                  index=data[1:,0],
                  columns=data[0,1:])
'''                  
# get AAPL 10 years data

data = qdl.get("WIKI/AAPL", start_date="2007-01-01", end_date="2017-05-01")

data0 = data.copy()

print(data0.shape)
print(data0.head(n=10))
print(data0.columns)


data0['date_id'] = ((data0.index.date - data0.index.date.min())).astype('timedelta64[D]')
data0['date_id'] = data0['date_id'].dt.days + 1


# high trend line

data1 = data0.copy()
'''
while len(data1)>3:
    reg = linregress(
                    x=data1['date_id'],
                    y=data1['Adj. High'],
                    )
    
    data1 = data1.loc[data1['Adj. High'] > reg[0] * data1['date_id'] + reg[1]]

reg = linregress(
                    x=data1['date_id'],
                    y=data1['Adj. High'],
                    )

data0['high_trend'] = reg[0] * data0['date_id'] + reg[1]
'''
# low trend line

data1 = data0.copy()
'''
while len(data1)>3:

    reg = linregress(
                    x=data1['date_id'],
                    y=data1['Adj. Low'],
                    )
    data1 = data1.loc[data1['Adj. Low'] < reg[0] * data1['date_id'] + reg[1]]

reg = linregress(
                    x=data1['date_id'],
                    y=data1['Adj. Low'],
                    )

data0['low_trend'] = reg[0] * data0['date_id'] + reg[1]
'''
# plot
 
#data0['Adj. Close'].plot()
data0['high_trend'].plot()
data0['low_trend'].plot()




