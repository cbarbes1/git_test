# Oden Project Fundamentals
## My First github repo using linux
### Hello Odin!
![Odin Project](https://www.theodinproject.com/assets/og-logo-022832d4cefeec1d5266237be260192f5980f9bcbf1c9ca151b358f0ce1fd2df.png) 

`The Odin Project provides a free open source coding curriculum that can be taken entirely online. Since its inception, it has helped many students get hired as developers and has assisted countless others in learning enough programming to work on their own personal projects.`<br>
<br>
`Below is some example code of what I have placed in this repository`<br>

```python
import random

print("Hello Welcome to the game")
gameStatus = False
randomNumber = random.randint(0, 10)
print(randomNumber)
while(not gameStatus):
    userGuess = int(input("Enter a guess between 1 and 10"))
    if userGuess==randomNumber:
        gameStatus = True
        print("Correct! Have a good day!")
```
```html
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>My First Webpage</title>
    </head>

    <body>
        After starting the omen project, I have begun to learn a lot.
        I hope to be done by the end of the week.
    </body>
</html>
```
