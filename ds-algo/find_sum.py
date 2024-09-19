def find_sum(num):
    
    # Returns the number
    
    if num <= 1:
       return num
    
    # Recursion process
    else:
        return num + find_sum(num - 1)
        
# Ask the user to input a number

num = int(input("Enter a number: "))

# Display the result

print("The sum of the first " + str(num) + " integers is equal to " + str(find_sum(num)))




    