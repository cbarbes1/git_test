# This test program plays a game 
#import needed libraries
import random

print("Hello Welcome to the game")
gameStatus = False
randomNumber = random.randint(2, 4)
print(randomNumber)
while(not gameStatus):
    userGuess = int(input("Enter a guess between 1 and 10"))
    if userGuess==randomNumber:
        gameStatus = True
        print("Correct! Have a good day!")
# end of code
