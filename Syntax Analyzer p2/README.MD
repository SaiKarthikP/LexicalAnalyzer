Lexical Analyzer
----
Sai Karthik Padmanaban
Date: January 30, 2018

Overview
----
A lexical and syntax analyzer for a simple object-oriented programming language called Toy build using jflex and CUP (java). This program translates any input Toy program into a sequence of tokens, and creates a symbol table using the trie structure for all keywords and user-defined identifiers.

How to compile and run program
----
1. First, install Java CUP.
2. Then run the following in the command line:
	
	javac -cp java-cup-11b-runtime.jar *.java

	java -cp ".\java-cup-11b-runtime.jar;.\" Main input.txt