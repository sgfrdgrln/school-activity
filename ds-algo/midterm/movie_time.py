from collections import deque

class MovieTime:

    movies = deque()
    snacks = deque()

    movieCount = 0
    snackCount = 0

    while movieCount < 3:
        chosenMovies = input("Enter movie "+  str(movieCount + 1) +" of 3: ")
        
        if not chosenMovies:
            print("Please enter a movie title.")
        else:
            movies.append(chosenMovies)
            movieCount += 1
    
    while snackCount < 3:
        chosenSnacks = input("Enter snack " + str(snackCount + 1) + " of 3: ")

        if not chosenSnacks:
            print("Please enter a snack.")
        else:
            snacks.append(chosenSnacks)
            snackCount += 1
    
    print("Movies to watch are: " + str(movies))
    print("Snacks available are: " + str(snacks))

    while snacks:
         action = input("Press S each time you finish a snack.\n")

         if action.upper() == "S":
            snacks.popleft()
            
            if len(snacks) == 0:
                print("No more snacks")
            else:
                print(str(snacks))




   

    