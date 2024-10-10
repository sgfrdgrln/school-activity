from collections import deque

class QueueSample:

    foods = deque()

    # I add food to the queue
    foods.append("Tapsilog")
    foods.append("BBQ")
    foods.append("Siomai Rice")
    foods.append("Sisig")
    foods.append("Burger Steak")

    # I display the available foods
    print("Available foods: " + str(foods))

    # I check the first food in the queue
    print("The first food to be served is: " + str(foods[0]))

    # I will remove until the queue is empty

    while foods:
        print("The food " + str(foods.popleft()) + " has been removed frin the queue.")
    
    # I display the list to check if the queue is empty 
    print("Available foods: " + str(foods))

    if not foods:
        print("No more foods!!!")
    else:
        print("There is more foods!")


    