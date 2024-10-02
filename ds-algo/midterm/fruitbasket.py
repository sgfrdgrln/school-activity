basket = []


print("Catch and eat any of this fruit: ('apple', 'mango', 'guava')")
count = int(input("How many fruits would you like to catch? "))
print("Choose a fruit to catch. Press A, O, M, or G.")

for i in range(count):
    fruit = input("Fruit " + str((i + 1)) + " of " + str(count) + ": ")

    match fruit.upper():
            case "A": basket.append("apple")
            case "O": basket.append("orange")
            case "M": basket.append("mango")
            case "G": basket.append("guava")
        

print("Your basket now has: "+ str(basket))



while basket:
    action = input("Press E to eat: ")

    if action.upper() == "E":
        basket.pop()
        if len(basket) > 0:
            print("Fruit(s) in the basket: " + str(basket))
        else:
            print("No more fruits")

