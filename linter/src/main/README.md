# Lab03 Methods
#First method Maps:

I was given the October Seattle weather data in the form of a 2D Array.I Iterated through all of the data to find the min and max values. 
I used a HashSet of type Integer to keep track of all the unique temperatures seen. Finally, I
iterated from the min temp to the max temp and create a String containing any temperature not seen during the month. Returnd that String.

#Second method Tally:
Wrote a metod called tally that accepts a List of Strings representing votes and returns one string to show what got the most votes.

#Third method Path:
Wrote a method that reads a JavaScript file with a given Path, and generates an error message whenever it finds a line that doesn’t end in a semi-colon.

Read through the file line by line. Create a string that contains a message such as "Line 3: Missing semicolon." if a line is missing a semicolon.

Don’t show an error if the line is empty.
Don’t show an error if the line ends with an opening curly brace {
Don’t show an error if the line ends with an closing curly brace }
Don’t show an error if the line contains if or else
Call that method in your main method on the file gates.js, and print out the resulting error message.
