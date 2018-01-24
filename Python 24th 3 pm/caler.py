import product


flag = 'y'

items=[]


while flag == 'y':

     flag = input('enter 1 for add, 2 for details 3 for search 4 for delete 5 for update  6 for exit ')
     if flag == '1':
          o = product.product()
          o.add()
          items.append(o)
          flag = 'y'
     elif flag =='2':
          for item in items:
               item.details()

          flag ='y'
     elif flag =='3':
          pid = int(input('enter pid to be search :'))

          for item in items:
               if item.search() == pid:
                    item.details()

          flag = 'y'
          
          
     elif flag=='4':
          pid = int(input('enter pid to be deleted :'))

          for item in items:
               if item.search() == pid:                    
                    items.remove(item)


          flag ='y'
          
     elif flag =='6':
          flag= 'n'
          
     
     else:
          print('you have entered invalid input ')
          flag ='y'





          
          


     
          
     
