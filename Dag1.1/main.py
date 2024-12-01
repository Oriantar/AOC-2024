input_file = open("input.txt", "r")
x = []
y = []
diff = 0
with input_file as f:
    fileRead = f.read()
    splitSpaces = fileRead.split("\n")
    
    for i in splitSpaces:
        x.append(i.split("   ")[0]) 
        y.append(i.split("   ")[1])
        
sortedX = x.sort()
sortedY = y.sort()

for i in range(len(x)):
    diff += abs(int(x[i]) - int(y[i]))

print(diff)
    
    
    