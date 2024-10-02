# Ask the user input 

num1 = int(input("Enter first number: "))
num2 = int(input("Enter second number: "))

# Convert to str

num1 = str(num1)
num2 = str(num2)

# Compare the two numbers

if num1 > num2: 
    print(num1 + " is greater than " + num2)
elif num1 < num2:
    print(num1 + " is less than " + num2)
else:
    print("The first number is equal to the second number.")
    