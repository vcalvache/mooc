Write a program that recognizes the following users:

username	password
alex	    sunshine
emma	    haskell

The program either shows a personal message or informs of an incorrect username or password.

    Sample output
        Enter username: alex
        Enter password: sunshine
        You have successfully logged in!

    Sample output
        Enter username: emma
        Enter password: haskell
        You have successfully logged in!

    Sample output
        Enter username: alex
        Enter password: thunderstorm
        Incorrect username or password!

NB! You can't compare strings with ==!

NB! Logins should not be implemented like this in real life! You can become familiar with safer ways to implement logins on courses focusing on web programming.