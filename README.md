# javaguesser

## main
```
keepGoing=true
while (keepGoing)
  menu()
  int num = userinput
  if(num=1)
    human()
  if(num=2)
    computer()
  if(num=0)
    keepGoing=false
```

## menu
```
print "0) Exit"
print "1) Human Guesser"
print "2) Computer guesser"
print "\nPlease enter 0-2: "
```

## human
```
bool keepGoing=true
int i=0
int humGuess
print "human guesser"
get a random number somehow called randNum
while (keepGoing)
  i++
  print i + ") Please enter a number: "
  humGuess = userinput
  if (randNum < humGuess)
    print "To high"
  if (randNum > humGuess)
    print "To low"
  if (randNum == humGuess)
    print "Good Job"
    keepGoing = false
```

## computer
```
bool keepGoing=true
int i=0
int comGuess=50
String humHint
print "computer guesser"
while(keepGoing)
  i++
  print i + ") I guess " + comGuess
  print "Too (H)igh, too (L)ow, or (C)orrect? "
  humHint = userinput
  if(humHint==H)
    comGuess = comGuess * .5
  if(humHint==L)
    comGuess = comGuess * 1.5
  if(humHint==C)
    print"Good job robot"
    keepGoing=false
```
