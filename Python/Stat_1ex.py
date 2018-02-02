import numpy as np

expenditure = np.random.normal(25000, 15000, 10000)

print(expenditure)

max(expenditure)
min(expenditure)
len(expenditure)
sum(expenditure)


np.mean(expenditure)

expenditure = np.append(expenditure, [1000000000])
np.median(expenditure)
np.mean(expenditure)

from scipy import stats
stats.mode(expenditure)



