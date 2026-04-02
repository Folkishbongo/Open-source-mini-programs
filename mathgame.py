import random #variables and imports
x = 0
y = 0
solution = 0
continuegame = True
correct = 0
mathmode = 0
clientinput = 0

def serverlogic(): #this function creates the logic for the question and solution
    global x, y, solution, mathmode
    mathmode = random.randint(1, 3)
    x = random.randint(1, 10)
    y = random.randint(1, 10)
    if mathmode == 1:
        solution = x + y
        print("What is " + str(x) + " + " + str(y) + "?")
    elif mathmode == 2:
        solution = x - y
        print("What is " + str(x) + " - " + str(y) + "?")
    elif mathmode == 3:
        solution = x * y
        print("What is " + str(x) + " x " + str(y) + "?")
    else:
        print("???")

def clientlogic(): #this fuction collects the user data and processes it
    global clientinput, solution, correct, continuegame
    clientinput = int(input())
    if clientinput == solution:
        print("Correct!")
        correct = correct + 1
    else:
        print("WRONG")
        continuegame = False

while continuegame == True: #loop
    serverlogic()
    clientlogic()

print("You got " + str(correct) + " right!") #end