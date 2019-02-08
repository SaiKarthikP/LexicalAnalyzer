
import java_cup.runtime.*;
import java.util.Arrays;
import java.io.*;


%%
%public
%line
%column

%cup

%{

private Symbol symbol(int type) {
    return new Symbol(type, yyline, yycolumn, yytext());
}

%}

DIGIT=[0-9]
LETTER=[A-Za-z]
HEX=[0-9]|[A-Fa-f]
NL=\r|\n|\r\n
WS= {NL}|[" "\t\f]
SL=[^\r\n\"] //String Literal characters

%% 
boolean { return symbol(sym._boolean);}
break   { return symbol(sym._break );}
class   { return symbol(sym._class );}
double  { return symbol(sym._double );} 
else   { return symbol(sym._else );}
extends { return symbol(sym._extends );}  
false   { return symbol(sym._booleanconstant );}
for   { return symbol(sym._for );}
if   { return symbol(sym._if );}
implements { return symbol(sym._implements );}
int   { return symbol(sym._int );}
interface   { return symbol(sym._interface );}
new { return symbol(sym._new );}
newarray   { return symbol(sym._newarray );}
null   { return symbol(sym._null );}
println   { return symbol(sym._println );}
readln   { return symbol(sym._readln );}
return   { return symbol(sym._return );}
string   { return symbol(sym._string );}
true   { return symbol(sym._booleanconstant );}
void   { return symbol(sym._void );}
while { return symbol(sym._while );}
"+" { return symbol(sym._plus );}
"-" { return symbol(sym._minus );}
"*" { return symbol(sym._multiplication );}
"/" { return symbol(sym._division );}
"%" { return symbol(sym._mod );}
"<" { return symbol(sym._less );}
"<=" { return symbol(sym._lessequal );}
">" { return symbol(sym._greater );}
">=" { return symbol(sym._greaterequal );}
"==" { return symbol(sym._equal );}
"!=" { return symbol(sym._notequal );}
"&&" { return symbol(sym._and );}
"||" { return symbol(sym._or );}
"!"  { return symbol(sym._not );}
"=" { return symbol(sym._assignop );}
";" { return symbol(sym._semicolon );}
"," { return symbol(sym._comma );}
"." { return symbol(sym._period );}
"(" { return symbol(sym._leftparen );}
")" { return symbol(sym._rightparen );}
"[" { return symbol(sym._leftbracket );}
"]" { return symbol(sym._rightbracket );}
"{" { return symbol(sym._leftbrace );}
"}" { return symbol(sym._rightbrace );}


{NL} {}

{WS} {}

"//".* {}
"/*" ~"*/" {}

{LETTER}({LETTER}|{DIGIT}|_)* {
   return symbol(sym._id );}

{DIGIT}+ { return symbol(sym._intconstant );}

("0x"|"0X")({HEX})+ { return symbol(sym._doubleconstant );}

{DIGIT}+"."({DIGIT}*|((E|e)("+"|"-")?{DIGIT}+)) { return symbol(sym._doubleconstant );}

\"{SL}*\" { return symbol(sym._stringconstant );}






