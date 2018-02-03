#break	: to terminate the loop interation 
#============================
i <-1
  while (i<10){
    
    if(i%%3==0){
      break
    }
    print(i)
    
    i=i+1
    
  }
  

#contiue/next	: to skip current itreration 
#================================
i <-0
while (i<10){
  
  i=i+1
  
  if(i%%3==0){
    next
  }
  print(i)
  
  
}




#switch		: return value from given list/items based on index 
#===============================
ch = readline(prompt = "enter data ")
ch = as.numeric(ch)

switch(ch,"red","green","blue")



##############vector : is collection of data, multiple values can be stored on one variable, one column can be considere as one vector 

age <- c(1,2,34,55,43)
age #print age

##
id <- c(1:5)

##operation 
age <- age +2

age<- age*2

##sum of two vector 
c <- age+id

############# data frame :  combination of multiple vector 
id <- c(1:5)
name <- c("raman","nidhi","rahul","divya","jatin")

emp <- data.frame(id,name)

###cbind 
cbind(id,name)

#####matrix 
d <- c(1:9)
d

matrix(d,nrow = 3,ncol = 3)
matrix(d,nrow = 3,ncol = 3,byrow = TRUE)




#packages	: is set inbuilt functions / is also known as library 
#===========================================================
#-how to install package 
#install.packages("pkgname")		# one time installation required on every pc/device 
#-how to load package to our program or session 
#library(pkgname)			# in every session 

install.packages("RMySQL")
install.packages("xls2")
library(RMySQL)
#return list of all packages 
installed.packages()
  
  

################################################################
################################################################
################ dicision tree 
#install package
install.packages("party")

#load library 
library(party)


#dataset / table 
readingSkills

#print / show top 5-6 rows with headings 
print(head(readingSkills))

#return column count
length(readingSkills)

#return row count
length(readingSkills$age)



##copy required no.of rows 
# Create the input data frame.
input.dat <- readingSkills[c(1:105),]

#set out file name 
png(file = "decision_tree.png")

# Create the tree.
output.tree <- ctree( nativeSpeaker ~ age + shoeSize + score,   data = input.dat)

# Plot the tree.
plot(output.tree)

# Save the file.
dev.off()







