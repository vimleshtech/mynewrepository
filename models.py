# -*- coding: cp1252 -*-
# Load libraries
import pandas       
from pandas.plotting import scatter_matrix 
import matplotlib.pyplot as plt

from sklearn import model_selection  # apply dynamic model 

from sklearn.metrics import classification_report # distribuation of dataset 
from sklearn.metrics import confusion_matrix #
from sklearn.metrics import accuracy_score # mean, std dev 

from sklearn.linear_model import LogisticRegression  # 
from sklearn.tree import DecisionTreeClassifier  #
from sklearn.neighbors import KNeighborsClassifier 
from sklearn.discriminant_analysis import LinearDiscriminantAnalysis  #
from sklearn.naive_bayes import GaussianNB
from sklearn.svm import SVC

# Load dataset
url = "https://archive.ics.uci.edu/ml/machine-learning-databases/iris/iris.data"
names = ['sepal-length', 'sepal-width', 'petal-length', 'petal-width', 'class']
dataset = pandas.read_csv(url, names=names)

## details and description about data frame 
print(dataset)
print(dataset.shape)
print(dataset.head(n=3))
print(dataset.tail(n=2))
print(dataset.describe())


#d = dataset.where('class'=='Iris-setosa')
#print(d.groupby('class').size()) # group by count

#d = dataset.sort_index('speal-length',ascending=True)
                       

#classification
print(dataset.groupby('class').size()) # group by count
print(dataset.groupby('class').sum()) # group by sum
print(dataset.groupby('class').max()) # group by max
print(dataset.groupby('class').min()) # group by min
print(dataset.groupby('class').mean()) # group by avg



##visualization

# box and whisker plots
#dataset.plot(kind='box', subplots=True, layout=(2,2), sharex=False, sharey=False)
#plt.show()

# histograms
#dataset.hist()
#plt.show()

#scatter_matrix(dataset)
#plt.show()

#print(dataset.values) # convert to list 

array = dataset.values

X = array[:,0:4]  # ['sepal-length', 'sepal-width', 'petal-length', 'petal-width']
Y = array[:,4] #, 'class'

#print(X)
#print(Y)


validation_size = 0.20
seed = 7
X_train, X_validation, Y_train, Y_validation = model_selection.train_test_split(X, Y, test_size=validation_size, random_state=seed)


#print(X_train)
#print(X_validation)
#print(Y_train)
#print(Y_validation)

models = []
models.append(('LR', LogisticRegression()))
models.append(('LDA', LinearDiscriminantAnalysis()))
models.append(('KNN', KNeighborsClassifier()))
models.append(('CART', DecisionTreeClassifier()))
models.append(('NB', GaussianNB()))
models.append(('SVM', SVC()))

# evaluate each model in turn
results = []
names = []

seed = 7
scoring = 'accuracy'

for name, model in models:
	kfold = model_selection.KFold(n_splits=10, random_state=seed)
	cv_results = model_selection.cross_val_score(model, X_train, Y_train, cv=kfold, scoring=scoring)
	results.append(cv_results)
	names.append(name)
	msg = "%s: %f (%f)" % (name, cv_results.mean(), cv_results.std())
	print(msg)
	# Test options and evaluation metric


#print(results)
#print(names)




















