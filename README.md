This program decrypts and encrypts the string specified above by
hiding the self-defined characters.

Solution to the following task:

Write two methods encrypt and decrypt with which a string s is to be encrypted or decrypted.
The string s is to be encrypted character by character by swapping.
The swapping process is described by an encryption string x:
If the character to be encrypted is contained inx , 
it should be replaced by the following character in.
If the character to be encrypted is the last character in x, 
it is replaced by the first character in x.
If the character is not contained in x, it remains unchanged.


Example: (German Example)

s="Hallo Herr Müller!"

x="aKurHüII"

Encrypted string: "ÜK!!o üeHH MI!!eHa"


The decryption function reverses the exact opposite.
The encrypt method has the two string parameters s and x and a return value of the string type.
The decrypt method also has two string parameters and x and a return value of the string type.
