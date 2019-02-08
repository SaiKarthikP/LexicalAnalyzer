//Lexical analyzer using JFlex and Java 

import java.util.Arrays;

%%
%class Project1
%standalone

%{

//Enumerator for tokens 
enum token{
  _boolean(0),
  _break(1),
  _class(2),
  _double(3),
  _else(4),
  _extends(5),
  _for(6),
  _if(7),
  _implements(8),
  _int(9),
  _interface(10),
  _new(11),
  _newarray(12),
  _null(13),
  _println(14),
  _readln(15),
  _return(16),
  _string(17),
  _void(18),
  _while(19),
  _plus(20),
  _minus(21),
  _multiplication(22),
  _division(23),
  _mod(24),
  _less(25),
  _lessequal(26),
  _greater(27),
  _greaterequal(28),
  _equal(29),
  _notequal(30),
  _and(31),
  _or(32),
  _not(33),
  _assignop(34),
  _semicolon(35),
  _comma(36),
  _period(37),
  _leftparen(38),
  _rightparen(39),
  _leftbracket(40),
  _rightbracket(41),
  _leftbrace(42),
  _rightbrace(43),
  _intconstant(44),
  _doubleconstant(45),
  _stringconstant(46),
  _booleanconstant(47),
  _id(48);

  
  private final int tokenid;
  
  private token(int tokenid){
   this.tokenid = tokenid;
  }
  public int getValue(){
    return tokenid;
  }
}

//Max size of Trie Symbol & Next Array
final int MAX = 1000;
final int ALPHASIZE = 52;


//Trie Data Structure
private class Trie{
  
  private int tSwitch[] = new int[ALPHASIZE];
  private char tSymbol[] = new char[MAX];
  private int tNext[] = new int[MAX];
  private int symbolEnd = 0;
  
  public Trie(){
    //Initialize arrays
    Arrays.fill(tSwitch, -1);
    Arrays.fill(tSymbol, '-');
    Arrays.fill(tNext, -1);
    
    //Insert all reserved words into Trie first
    insert("boolean", '!');
    insert("break", '#');
    insert("class", '$');
    insert("double", '%');
    insert("else", '^');
    insert("extends", '&');
    insert("false", '>');
    insert("for", '(');
    insert("if", ')');
    insert("implements", '-');
    insert("int", '+');
    insert("interface", '=');
    insert("new", '{');
    insert("newarray", '}');
    insert("null", '|');
    insert("println", '\\');
    insert("readln", '/');
    insert("return", '?');
    insert("string", '*');
    insert("true", '<');
    insert("void", '.');
    insert("while", ',');
    
  }
  
  //Get int representation of characters
  private int getValOfSymbol(char c){
    return (Character.isUpperCase(c)) ? ((int)c - 65) : (((int)c - 97) + 26);
  }
  //Gets char representation of int based on above 
  //(anything larger than 51 returns 'z', smaller than 0 returns 'A')
  private char getSymOfVal(int c){
    if(c > 51)
      return 'z';
    if(c > 25)
      return (char)(c + 97 - 26);
    else if(c < 0)
      return 'A';
    else
      return (char)(c + 65);
  }
  
  //Returns true if c is a valid deliminator, false otherwise
  private boolean isDelim(char c){
    if(c == '!' /*boolean*/ || c == '#' /*break*/ || c == '$' /*class*/ || c == '%' /*double*/ || c == '^' /*else*/ 
         || c == '&' /*extends*/ || c == '>' /*false*/ || c == '(' /*for*/ || c == ')' /*if*/ || c == '-' /*implements*/ 
         || c == '+' /*int*/ || c == '=' /*interface*/ || c == '{' /*new*/ || c == '}' /*newarray*/ || c == '|' /*null*/
         || c == '\\' /*println*/ || c == '/' /*readln*/ || c == '?' /*return*/ || c == '*' /*string*/ || c == '<' /*true*/
         || c == '.' /*void*/ || c == ',' /*while*/ || c == '@' /*id*/ )
      return true;
    else
      return false;
  }
  
  //Creates an id, s, at index in tSymbol, if wholeWord ignores first character and sets tSwitch
  private void createId(String s, int size, int index, boolean wholeWord){
    int sInd = 0;
    if(wholeWord){
      tSwitch[getValOfSymbol(s.charAt(sInd))] = index;
      sInd++;
      size--;
    }
    
    for(int i = 0; i < size; i++){
      tSymbol[index + i] = s.charAt(sInd);
      sInd++;
    }
    //Mark new end of tSymbol
    symbolEnd = index + size;    
  }
  
  //Search through Trie and insert string s with deliminator delim if not found
  //Will return false if no insertion is needed, true if s is inserted into Trie
  public boolean insert(String s, char delim){
    s = s + delim;
    int sInd = 0;
    int ptr = tSwitch[getValOfSymbol(s.charAt(sInd))];
    if(ptr == -1){
      createId(s, s.length(), symbolEnd, true);
      return true; //succesful insertion
    }else{
      sInd++;
      boolean exit = false;
      while(!exit){
        if(tSymbol[ptr] == s.charAt(sInd)){
          if(!isDelim(s.charAt(sInd))){
            //If sInd isn't at the end of the id
            //check next symbol in tSymbol with next char in s
            ptr++;
            sInd++;
          }else{
            //If sInd is at the end of id, and it all matched & ends in Trie, id's already present, exit
            exit = true;
          }
        }else if(tNext[ptr] != -1){
          //If s.charAt(sInd) doesn't match tSymbol[ptr] check next for where to continue if it's defined.
          ptr = tNext[ptr];
        }else{
          //new id
          tNext[ptr] = symbolEnd;
          createId(s.substring(sInd, s.length()), s.substring(sInd, s.length()).length(), symbolEnd, false);
          return true; // succesful insertion
        }
      }
    }
    return false; //if insertion not needed
  }
  
  public void print(){
    System.out.println();
    
    //Print switch
    boolean labelFlag = true, symFlag;
    int counter = 0;
    int rowSize = 20;
    
    while(counter < ALPHASIZE){
      if(counter + 20 > ALPHASIZE){
        rowSize = ALPHASIZE - counter;
      }
      for(int i = 0; i < rowSize; i++){
        //For new lines
        if((i + counter) % 20 == 0){
          if(labelFlag){
            System.out.println();
            System.out.format("%-8s", "");
          }else{
            System.out.println();
            System.out.format("%-8s", "switch:");
          }
        }
        
        if(labelFlag)
          System.out.format("%5s", getSymOfVal(i + counter));
        else
          System.out.format("%5d", tSwitch[i + counter]);
      }
      //if the end of a switch[i] row add 20 to the counter and move on to the next actual row
      if(!labelFlag){
        counter = counter + 20;
        System.out.println(); 
      }
      //Flip labelFlag switch
      labelFlag = !labelFlag;
    }
    
    System.out.println();
    //Print Symbol and Next
    //reset variables for reuse
    rowSize = 20;
    counter = 0;
    labelFlag = true;
    symFlag  = true;
    
    while(counter < symbolEnd){
      if(counter + 20 > symbolEnd){
        rowSize = symbolEnd - counter;
      }
      for(int i = 0; i < rowSize; i++){
        //For new lines and row header
        if((i + counter) % 20 == 0){
          if(labelFlag){
            System.out.println();
            System.out.format("%-8s", "");
          }else if(symFlag){
            System.out.println();
            System.out.format("%-8s", "symbol:");
          }else{            
            System.out.println();
            System.out.format("%-8s", "next:");
          }
        }
        
        if(labelFlag)
          System.out.format("%5s", (i + counter));
        else if(symFlag)
          System.out.format("%5s", tSymbol[i + counter]);
        else
          System.out.format("%5d", tNext[i + counter]);
      }
      
      //if the end of a next[] row add 20 to the counter and move on to the next actual row
      if(!labelFlag && !symFlag){
        counter = counter + 20;
        System.out.println();
      }
      if(labelFlag) //end of lbl row, switch off lbl flag
        labelFlag = !labelFlag;
      else if(symFlag) //end of sym row, switch off sym flag
        symFlag = !symFlag;
      else{ //end of next row, switch on lbl and switch flags
        labelFlag = !labelFlag;
        symFlag = !symFlag;
      }
    }
    
  }
}



Trie symbolTable = new Trie(); 

%}

%eof{
  symbolTable.print();
%eof}

DIGIT=[0-9]
LETTER=[A-Za-z]
HEX=[0-9]|[A-Fa-f]
NL=\r|\n|\r\n
WS= {NL}|[" "\t\f]
SL=[^\r\n\"] //String Literal characters

%% 
boolean {System.out.print("boolean "); return token._boolean.getValue();}
break   {System.out.print("break "); return token._break.getValue();}
class   {System.out.print("class "); return token._class.getValue();}
double  {System.out.print("double "); return token._double.getValue();} 
else   {System.out.print("else "); return token._else.getValue();}
extends {System.out.print("extends "); return token._extends.getValue();}  
false   {System.out.print("booleanconstant "); return token._booleanconstant.getValue();}
for   {System.out.print("for "); return token._for.getValue();}
if   {System.out.print("if "); return token._if.getValue();}
implements {System.out.print("implements "); return token._implements.getValue();}
int   {System.out.print("int "); return token._int.getValue();}
interface   {System.out.print("interface "); return token._interface.getValue();}
new {System.out.print("new "); return token._new.getValue();}
newarray   {System.out.print("newarrray "); return token._newarray.getValue();}
null   {System.out.print("null "); return token._null.getValue();}
println   {System.out.print("println "); return token._println.getValue();}
readln   {System.out.print("readln "); return token._readln.getValue();}
return   {System.out.print("return "); return token._return.getValue();}
string   {System.out.print("string "); return token._string.getValue();}
true   {System.out.print("booleanconstant "); return token._booleanconstant.getValue();}
void   {System.out.print("void "); return token._void.getValue();}
while {System.out.print("while "); return token._while.getValue();}
"+" {System.out.print("plus "); return token._plus.getValue();}
"-" {System.out.print("minus "); return token._minus.getValue();}
"*" {System.out.print("multiplication "); return token._multiplication.getValue();}
"/" {System.out.print("division "); return token._division.getValue();}
"%" {System.out.print("mod "); return token._mod.getValue();}
"<" {System.out.print("less "); return token._less.getValue();}
"<=" {System.out.print("lessequal "); return token._lessequal.getValue();}
">" {System.out.print("greater "); return token._greater.getValue();}
">=" {System.out.print("greaterequal "); return token._greaterequal.getValue();}
"==" {System.out.print("equal "); return token._equal.getValue();}
"!=" {System.out.print("notequal "); return token._notequal.getValue();}
"&&" {System.out.print("and "); return token._and.getValue();}
"||" {System.out.print("or "); return token._or.getValue();}
"!"  {System.out.print("not "); return token._not.getValue();}
"=" {System.out.print("equal "); return token._equal.getValue();}
";" {System.out.print("semicolon "); return token._semicolon.getValue();}
"," {System.out.print("comma "); return token._comma.getValue();}
"." {System.out.print("period "); return token._period.getValue();}
"(" {System.out.print("leftparen "); return token._leftparen.getValue();}
")" {System.out.print("rightparen "); return token._rightparen.getValue();}
"[" {System.out.print("leftbracket "); return token._leftbracket.getValue();}
"]" {System.out.print("rigthbracket "); return token._rightbracket.getValue();}
"{" {System.out.print("leftbrace "); return token._leftbrace.getValue();}
"}" {System.out.print("rigthbrace "); return token._rightbrace.getValue();}


{NL} {System.out.println();}

{WS} {}

"//".* {System.out.print("comment ");}
"/*" ~"*/" {System.out.print("multi-line-comment ");}

{LETTER}({LETTER}|{DIGIT}|_)* {symbolTable.insert(yytext(), '@');
  System.out.print("identifier "); return token._id.getValue();}

{DIGIT}+ {System.out.print("intconstant "); return token._intconstant.getValue();}

("0x"|"0X")({HEX})+ {System.out.print("doubleconstant "); return token._doubleconstant.getValue();}

{DIGIT}+"."({DIGIT}*|((E|e)("+"|"-")?{DIGIT}+)) {System.out.print("doubleconstant "); return token._doubleconstant.getValue();}

\"{SL}*\" {System.out.print("stringconstant "); return token._stringconstant.getValue();}






