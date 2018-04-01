#https://gawron.sdsu.edu/python_for_ss/course_core/book_draft/web/web_crawling.html
#https://www.geeksforgeeks.org/twitter-sentiment-analysis-using-python/
#https://www.crummy.com/software/BeautifulSoup/bs4/doc/

import urllib2
import BeautifulSoup


url = "https://www.yahoo.com"
data = urllib2.urlopen(url).read()

d= data.split('href')
print(len(d))

    

f = open(r'C:\Users\hp\Desktop\ABProject\out.txt','w')

for l in d:
    #print(l[:5])
    d = l.split('.com')
    
    if l[:6] == '="http':        
        #print(d[0].replace('="','')+'.com')
        f.write(d[0].replace('="','')+'.com\n')
    else:
        continue
    
f.close()


bs = BeautifulSoup.BeautifulSoup(data)
d = bs.find('input')
print(d)


'''
#print(data)
bs = BeautifulSoup.BeautifulSoup(data)

ingreds = bs.find('li', {'class': 'D(ib) Mstart(22px) Mend(8px)'})
#print(ingreds )

    
#ingreds = [s.getText().strip() for s in ingreds.findAll('a')]
#print(ingreds )
'''
