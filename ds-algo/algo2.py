# Create a list of names
names = ['', '', '']

# Ask for the names of the classmates
names[0] = input("Enter the name of your first classmate: ")
names[1] = input("Enter the name of your second classmate: ")
names[2] = input("Enter the name of your third classmates: ")

# Display the names
print("The names of your classmates are: " + (", ").join(names))
