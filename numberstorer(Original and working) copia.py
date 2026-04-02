managingcell = 0
action = 0
celltoact = 0
cell1 = 0
cell2 = 0
cell3 = 0
lastcelldestroyed = 0
def mainloop():
    global action, celltoact, cell1, cell2, cell3, lastcelldestroyed
    print("·What do you want to do? (1= edit, 2= delete, 3= read_specific, 4= move_data) and 5=list_everything (6=perform_operations coming soon...)")
    action = int(input())
    if action == 1:
        print("·Which cell do you want to edit?")
        celltoact = int(input())
        if celltoact == 1:
            print("·Type the data you want to store(Value will be saved as string):")
            cell1 = str(input())
        elif celltoact == 2:
            print("·Type the data you want to store(Value will be saved as string):")
            cell2 = str(input())
        elif celltoact == 3:
            print("·Type the data you want to store(Value will be saved as string):")
            cell3 = str(input())
        print("Data got modified!")
    elif action == 2:
        print("·Which cell do you want to D E S T R O Y? (deleted cells get restored to the 0 value in string)")
        celltoact = int(input())
        lastcelldestroyed = str(celltoact)
        if celltoact == 1:
            cell1 = 0
        elif celltoact == 2:
            cell2 = 0
        elif celltoact == 3:
            cell3 = 0
        print("·you ANNIHILATED " + lastcelldestroyed)
    elif action == 3:
        print("·Which cell do you want to read?")
        celltoact = int(input())
        if celltoact == 1:
            print("-Cell1 has: " + str(cell1))
        elif celltoact == 2:
            print("-Cell2 has: " + str(cell2))
        elif celltoact == 3:
            print("-Cell3 has: " + str(cell3))
    elif action == 4:
        print("··CAUTION! Moving Data will set the original source to 0 and will also overwrite the cell's data you moved the value to!")
        print("·What cell do you want to extract the data from? 1=cell1, 2=cell2, 3=cell3")
        datasource = str(input())
        print("·To which cell do you want to move the data to? 1=cell1, 2=cell2, 3=cell3")
        datalanding = str(input())
        if datasource == datalanding:
            print("-What you're trying is useless, action denied")
        elif datasource == "1" and datalanding == "2":
            cell2 = cell1
            cell1 = 0
        elif datasource == "1" and datalanding == "3":
            cell3 = cell1
            cell1 = 0
        elif datasource == "2" and datalanding == "1":
            cell1 = cell2
            cell2 = 0
        elif datasource == "2" and datalanding == "3":
            cell3 = cell2
            cell2 = 0
        elif datasource == "3" and datalanding == "1":
            cell1 = cell3
            cell3 = 0
        elif datasource == "3" and datalanding == "2":
            cell2 = cell3
            cell3 = 0
        print("·Data changed!")
    elif action == 5:
        print("·ALL VARIABLES LISTED")
        print("-cell 1: " + str(cell1))
        print("-cell 2: " + str(cell2))
        print("-cell 3: " + str(cell3))
    else:
        print("··That's not a valid action!")
while True:
    mainloop()