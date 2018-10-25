Lexical Analyzer
----
Sai Karthik Padmanaban
Date: January 30, 2018

Overview
----
A lexical analyzer for a simple object-oriented programming language called Toy built using jflex and java. This program translates any input Toy program into a sequence of tokens, and creates a symbol table using the trie structure for all keywords and user-defined identifiers.

How to compile and run program
----
1. First, install jflex using the instructions provided here:  http://jflex.de/installing.html
2. Then run the following in the command line:
	
	jflex specification.jflex
	
	javac specification.java
	
	java specification test.txt
