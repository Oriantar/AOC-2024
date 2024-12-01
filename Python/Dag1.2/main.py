input_file = open("input.txt", "r")
x = []
y = []
aantal = 0
with input_file as f:
    fileRead = f.read()
    splitSpaces = fileRead.split("\n")
    
    for i in splitSpaces:
        x.append(i.split("   ")[0]) 
        y.append(i.split("   ")[1])

for index1 in range(len(x)):
    ver = 0
    for index2 in range(len(y)):
        if(x[index1] == y[index2]):
            ver += 1
    som = int(x[index1]) * ver
    aantal += som
print(aantal)
    
