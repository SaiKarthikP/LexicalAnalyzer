/* The following code was generated by JFlex 1.7.0 */

import java_cup.runtime.*;
import java.util.Arrays;
import java.io.*;



/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>Project1.jflex</tt>
 */
public class Yylex implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\6\1\5\1\63\1\64\1\4\22\0\1\6\1\47\1\7"+
    "\2\0\1\43\1\50\1\0\1\55\1\56\1\41\1\37\1\53\1\40"+
    "\1\54\1\42\1\66\11\1\1\0\1\52\1\44\1\45\1\46\2\0"+
    "\4\3\1\70\1\3\21\2\1\67\2\2\1\57\1\0\1\60\1\0"+
    "\1\65\1\0\1\14\1\10\1\20\1\22\1\13\1\26\1\34\1\36"+
    "\1\27\1\2\1\17\1\12\1\30\1\15\1\11\1\31\1\2\1\16"+
    "\1\21\1\25\1\23\1\35\1\32\1\24\1\33\1\2\1\61\1\51"+
    "\1\62\7\0\1\63\u1fa2\0\1\63\1\63\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\2\3\1\0\15\2\1\4\1\5"+
    "\1\6\1\7\1\10\1\11\1\12\1\13\1\14\2\0"+
    "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24"+
    "\1\25\1\1\1\26\1\27\16\2\1\30\4\2\1\0"+
    "\1\3\1\31\1\32\1\33\1\34\1\35\1\36\1\0"+
    "\1\26\1\0\4\2\1\37\7\2\1\40\1\2\1\41"+
    "\4\2\1\0\1\26\1\0\2\2\1\42\2\2\1\43"+
    "\5\2\1\44\4\2\1\45\1\2\1\46\4\2\1\47"+
    "\5\2\1\50\3\2\1\51\1\52\1\53\1\54\3\2"+
    "\1\55\1\56\3\2\1\57\1\60\2\2\1\61\1\2"+
    "\1\62";

  private static int [] zzUnpackAction() {
    int [] result = new int[146];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\71\0\162\0\253\0\344\0\u011d\0\u0156\0\u018f"+
    "\0\u01c8\0\u0201\0\u023a\0\u0273\0\u02ac\0\u02e5\0\u031e\0\u0357"+
    "\0\u0390\0\u03c9\0\u0402\0\344\0\344\0\344\0\u043b\0\344"+
    "\0\u0474\0\u04ad\0\u04e6\0\u051f\0\u0558\0\u0591\0\344\0\344"+
    "\0\344\0\344\0\344\0\344\0\344\0\344\0\344\0\u05ca"+
    "\0\u0603\0\344\0\u063c\0\u0675\0\u06ae\0\u06e7\0\u0720\0\u0759"+
    "\0\u0792\0\u07cb\0\u0804\0\u083d\0\u0876\0\u08af\0\u08e8\0\u0921"+
    "\0\162\0\u095a\0\u0993\0\u09cc\0\u0a05\0\u0a3e\0\u0a77\0\344"+
    "\0\344\0\344\0\344\0\344\0\344\0\u0ab0\0\u0ae9\0\u0b22"+
    "\0\u0b5b\0\u0b94\0\u0bcd\0\u0c06\0\u0c3f\0\u0c78\0\u0cb1\0\u0cea"+
    "\0\u0d23\0\u0d5c\0\u0d95\0\u0dce\0\162\0\u0e07\0\u0e40\0\u0e79"+
    "\0\u0eb2\0\u0eeb\0\u0f24\0\u0f5d\0\u0ab0\0\u0ae9\0\u0f96\0\u0fcf"+
    "\0\162\0\u1008\0\u1041\0\162\0\u107a\0\u10b3\0\u10ec\0\u1125"+
    "\0\u115e\0\162\0\u1197\0\u11d0\0\u1209\0\u1242\0\162\0\u127b"+
    "\0\162\0\u12b4\0\u12ed\0\u1326\0\u135f\0\162\0\u1398\0\u13d1"+
    "\0\u140a\0\u1443\0\u147c\0\162\0\u14b5\0\u14ee\0\u1527\0\162"+
    "\0\162\0\162\0\162\0\u1560\0\u1599\0\u15d2\0\162\0\162"+
    "\0\u160b\0\u1644\0\u167d\0\162\0\162\0\u16b6\0\u16ef\0\162"+
    "\0\u1728\0\162";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[146];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\0\1\2\2\3\1\4\2\5\1\6\1\7\2\3"+
    "\1\10\1\3\1\11\1\12\1\3\1\13\1\14\1\15"+
    "\2\3\1\16\1\17\1\20\1\3\1\21\1\22\2\3"+
    "\1\23\1\3\1\24\1\25\1\26\1\27\1\30\1\31"+
    "\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41"+
    "\1\42\1\43\1\44\1\45\1\46\1\47\1\0\1\5"+
    "\1\0\1\50\2\3\1\0\1\2\52\0\1\51\11\0"+
    "\1\2\3\0\3\3\4\0\27\3\26\0\4\3\5\0"+
    "\1\5\154\0\4\6\2\0\1\6\1\52\61\6\1\0"+
    "\3\3\4\0\1\3\1\53\4\3\1\54\20\3\26\0"+
    "\4\3\1\0\3\3\4\0\2\3\1\55\11\3\1\56"+
    "\12\3\26\0\4\3\1\0\3\3\4\0\3\3\1\57"+
    "\7\3\1\60\13\3\26\0\4\3\1\0\3\3\4\0"+
    "\3\3\1\61\23\3\26\0\4\3\1\0\3\3\4\0"+
    "\2\3\1\62\24\3\26\0\4\3\1\0\3\3\4\0"+
    "\15\3\1\63\11\3\26\0\4\3\1\0\3\3\4\0"+
    "\1\3\1\64\25\3\26\0\4\3\1\0\3\3\4\0"+
    "\6\3\1\65\20\3\26\0\4\3\1\0\3\3\4\0"+
    "\1\3\1\66\2\3\1\67\22\3\26\0\4\3\1\0"+
    "\3\3\4\0\5\3\1\70\10\3\1\71\1\3\1\72"+
    "\6\3\26\0\4\3\1\0\3\3\4\0\6\3\1\73"+
    "\20\3\26\0\4\3\1\0\3\3\4\0\26\3\1\74"+
    "\26\0\4\3\1\0\3\3\4\0\1\3\1\75\25\3"+
    "\26\0\4\3\41\0\1\76\1\77\73\0\1\100\70\0"+
    "\1\101\70\0\1\102\70\0\1\103\73\0\1\104\71\0"+
    "\1\105\20\0\1\2\22\0\1\106\27\0\1\51\11\0"+
    "\1\2\1\106\2\0\1\107\11\0\1\110\52\0\1\107"+
    "\1\0\1\110\1\0\3\3\4\0\1\3\1\111\25\3"+
    "\26\0\4\3\1\0\3\3\4\0\3\3\1\112\23\3"+
    "\26\0\4\3\1\0\3\3\4\0\11\3\1\113\15\3"+
    "\26\0\4\3\1\0\3\3\4\0\15\3\1\114\11\3"+
    "\26\0\4\3\1\0\3\3\4\0\22\3\1\115\4\3"+
    "\26\0\4\3\1\0\3\3\4\0\2\3\1\116\24\3"+
    "\26\0\4\3\1\0\3\3\4\0\4\3\1\117\10\3"+
    "\1\120\11\3\26\0\4\3\1\0\3\3\4\0\4\3"+
    "\1\121\22\3\26\0\4\3\1\0\3\3\4\0\6\3"+
    "\1\122\20\3\26\0\4\3\1\0\3\3\4\0\13\3"+
    "\1\123\13\3\26\0\4\3\1\0\3\3\4\0\13\3"+
    "\1\124\13\3\26\0\4\3\1\0\3\3\4\0\6\3"+
    "\1\125\20\3\26\0\4\3\1\0\3\3\4\0\2\3"+
    "\1\126\24\3\26\0\4\3\1\0\3\3\4\0\15\3"+
    "\1\127\11\3\26\0\4\3\1\0\3\3\4\0\21\3"+
    "\1\130\5\3\26\0\4\3\1\0\3\3\4\0\17\3"+
    "\1\131\7\3\26\0\4\3\1\0\3\3\4\0\17\3"+
    "\1\132\7\3\26\0\4\3\1\0\3\3\4\0\17\3"+
    "\1\133\7\3\26\0\4\3\41\76\1\134\27\76\4\77"+
    "\2\0\55\77\2\0\4\77\1\0\1\135\1\0\1\135"+
    "\4\0\1\135\2\0\2\135\3\0\1\135\1\0\1\135"+
    "\3\0\1\135\37\0\1\135\1\0\1\135\1\0\1\107"+
    "\64\0\1\107\3\0\1\107\35\0\2\136\25\0\1\107"+
    "\3\0\3\3\4\0\2\3\1\137\24\3\26\0\4\3"+
    "\1\0\3\3\4\0\4\3\1\140\22\3\26\0\4\3"+
    "\1\0\3\3\4\0\3\3\1\141\23\3\26\0\4\3"+
    "\1\0\3\3\4\0\3\3\1\142\23\3\26\0\4\3"+
    "\1\0\3\3\4\0\4\3\1\143\22\3\26\0\4\3"+
    "\1\0\3\3\4\0\2\3\1\144\24\3\26\0\4\3"+
    "\1\0\3\3\4\0\12\3\1\145\14\3\26\0\4\3"+
    "\1\0\3\3\4\0\13\3\1\146\13\3\26\0\4\3"+
    "\1\0\3\3\4\0\11\3\1\147\15\3\26\0\4\3"+
    "\1\0\3\3\4\0\17\3\1\150\7\3\26\0\4\3"+
    "\1\0\3\3\4\0\1\151\26\3\26\0\4\3\1\0"+
    "\3\3\4\0\3\3\1\152\23\3\26\0\4\3\1\0"+
    "\3\3\4\0\11\3\1\124\15\3\26\0\4\3\1\0"+
    "\3\3\4\0\3\3\1\153\23\3\26\0\4\3\1\0"+
    "\3\3\4\0\2\3\1\154\24\3\26\0\4\3\1\0"+
    "\3\3\4\0\5\3\1\155\21\3\26\0\4\3\1\0"+
    "\3\3\4\0\2\3\1\156\24\3\26\0\4\3\1\0"+
    "\3\3\4\0\12\3\1\157\14\3\26\0\4\3\41\76"+
    "\1\134\1\5\26\76\1\0\3\3\4\0\3\3\1\160"+
    "\23\3\26\0\4\3\1\0\3\3\4\0\7\3\1\161"+
    "\17\3\26\0\4\3\1\0\3\3\4\0\5\3\1\162"+
    "\21\3\26\0\4\3\1\0\3\3\4\0\6\3\1\163"+
    "\20\3\26\0\4\3\1\0\3\3\4\0\2\3\1\164"+
    "\24\3\26\0\4\3\1\0\3\3\4\0\6\3\1\165"+
    "\20\3\26\0\4\3\1\0\3\3\4\0\11\3\1\166"+
    "\15\3\26\0\4\3\1\0\3\3\4\0\5\3\1\167"+
    "\21\3\26\0\4\3\1\0\3\3\4\0\2\3\1\170"+
    "\24\3\26\0\4\3\1\0\3\3\4\0\6\3\1\171"+
    "\20\3\26\0\4\3\1\0\3\3\4\0\3\3\1\172"+
    "\23\3\26\0\4\3\1\0\3\3\4\0\15\3\1\173"+
    "\11\3\26\0\4\3\1\0\3\3\4\0\3\3\1\174"+
    "\23\3\26\0\4\3\1\0\3\3\4\0\4\3\1\175"+
    "\22\3\26\0\4\3\1\0\3\3\4\0\12\3\1\176"+
    "\14\3\26\0\4\3\1\0\3\3\4\0\6\3\1\177"+
    "\20\3\26\0\4\3\1\0\3\3\4\0\5\3\1\200"+
    "\21\3\26\0\4\3\1\0\3\3\4\0\5\3\1\201"+
    "\21\3\26\0\4\3\1\0\3\3\4\0\24\3\1\202"+
    "\2\3\26\0\4\3\1\0\3\3\4\0\3\3\1\203"+
    "\23\3\26\0\4\3\1\0\3\3\4\0\16\3\1\204"+
    "\10\3\26\0\4\3\1\0\3\3\4\0\20\3\1\205"+
    "\6\3\26\0\4\3\1\0\3\3\4\0\2\3\1\206"+
    "\24\3\26\0\4\3\1\0\3\3\4\0\5\3\1\207"+
    "\21\3\26\0\4\3\1\0\3\3\4\0\11\3\1\210"+
    "\15\3\26\0\4\3\1\0\3\3\4\0\4\3\1\211"+
    "\22\3\26\0\4\3\1\0\3\3\4\0\4\3\1\212"+
    "\22\3\26\0\4\3\1\0\3\3\4\0\3\3\1\213"+
    "\23\3\26\0\4\3\1\0\3\3\4\0\5\3\1\214"+
    "\21\3\26\0\4\3\1\0\3\3\4\0\23\3\1\215"+
    "\3\3\26\0\4\3\1\0\3\3\4\0\10\3\1\216"+
    "\16\3\26\0\4\3\1\0\3\3\4\0\5\3\1\217"+
    "\21\3\26\0\4\3\1\0\3\3\4\0\3\3\1\220"+
    "\23\3\26\0\4\3\1\0\3\3\4\0\15\3\1\221"+
    "\11\3\26\0\4\3\1\0\3\3\4\0\11\3\1\222"+
    "\15\3\26\0\4\3";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5985];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\3\1\1\11\1\0\15\1\3\11\1\1\1\11"+
    "\4\1\2\0\11\11\2\1\1\11\23\1\1\0\1\1"+
    "\6\11\1\0\1\1\1\0\23\1\1\0\1\1\1\0"+
    "\64\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[146];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true iff the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true iff the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */

private Symbol symbol(int type) {
    return new Symbol(type, yyline, yycolumn, yytext());
}



  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Yylex(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 186) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return symbol(sym._intconstant );
            } 
            // fall through
          case 51: break;
          case 2: 
            { return symbol(sym._id );
            } 
            // fall through
          case 52: break;
          case 3: 
            { 
            } 
            // fall through
          case 53: break;
          case 4: 
            { return symbol(sym._plus );
            } 
            // fall through
          case 54: break;
          case 5: 
            { return symbol(sym._minus );
            } 
            // fall through
          case 55: break;
          case 6: 
            { return symbol(sym._multiplication );
            } 
            // fall through
          case 56: break;
          case 7: 
            { return symbol(sym._division );
            } 
            // fall through
          case 57: break;
          case 8: 
            { return symbol(sym._mod );
            } 
            // fall through
          case 58: break;
          case 9: 
            { return symbol(sym._less );
            } 
            // fall through
          case 59: break;
          case 10: 
            { return symbol(sym._assignop );
            } 
            // fall through
          case 60: break;
          case 11: 
            { return symbol(sym._greater );
            } 
            // fall through
          case 61: break;
          case 12: 
            { return symbol(sym._not );
            } 
            // fall through
          case 62: break;
          case 13: 
            { return symbol(sym._semicolon );
            } 
            // fall through
          case 63: break;
          case 14: 
            { return symbol(sym._comma );
            } 
            // fall through
          case 64: break;
          case 15: 
            { return symbol(sym._period );
            } 
            // fall through
          case 65: break;
          case 16: 
            { return symbol(sym._leftparen );
            } 
            // fall through
          case 66: break;
          case 17: 
            { return symbol(sym._rightparen );
            } 
            // fall through
          case 67: break;
          case 18: 
            { return symbol(sym._leftbracket );
            } 
            // fall through
          case 68: break;
          case 19: 
            { return symbol(sym._rightbracket );
            } 
            // fall through
          case 69: break;
          case 20: 
            { return symbol(sym._leftbrace );
            } 
            // fall through
          case 70: break;
          case 21: 
            { return symbol(sym._rightbrace );
            } 
            // fall through
          case 71: break;
          case 22: 
            { return symbol(sym._doubleconstant );
            } 
            // fall through
          case 72: break;
          case 23: 
            { return symbol(sym._stringconstant );
            } 
            // fall through
          case 73: break;
          case 24: 
            { return symbol(sym._if );
            } 
            // fall through
          case 74: break;
          case 25: 
            { return symbol(sym._lessequal );
            } 
            // fall through
          case 75: break;
          case 26: 
            { return symbol(sym._equal );
            } 
            // fall through
          case 76: break;
          case 27: 
            { return symbol(sym._greaterequal );
            } 
            // fall through
          case 77: break;
          case 28: 
            { return symbol(sym._notequal );
            } 
            // fall through
          case 78: break;
          case 29: 
            { return symbol(sym._and );
            } 
            // fall through
          case 79: break;
          case 30: 
            { return symbol(sym._or );
            } 
            // fall through
          case 80: break;
          case 31: 
            { return symbol(sym._new );
            } 
            // fall through
          case 81: break;
          case 32: 
            { return symbol(sym._for );
            } 
            // fall through
          case 82: break;
          case 33: 
            { return symbol(sym._int );
            } 
            // fall through
          case 83: break;
          case 34: 
            { return symbol(sym._else );
            } 
            // fall through
          case 84: break;
          case 35: 
            { return symbol(sym._null );
            } 
            // fall through
          case 85: break;
          case 36: 
            { return symbol(sym._booleanconstant );
            } 
            // fall through
          case 86: break;
          case 37: 
            { return symbol(sym._void );
            } 
            // fall through
          case 87: break;
          case 38: 
            { return symbol(sym._break );
            } 
            // fall through
          case 88: break;
          case 39: 
            { return symbol(sym._class );
            } 
            // fall through
          case 89: break;
          case 40: 
            { return symbol(sym._while );
            } 
            // fall through
          case 90: break;
          case 41: 
            { return symbol(sym._readln );
            } 
            // fall through
          case 91: break;
          case 42: 
            { return symbol(sym._return );
            } 
            // fall through
          case 92: break;
          case 43: 
            { return symbol(sym._string );
            } 
            // fall through
          case 93: break;
          case 44: 
            { return symbol(sym._double );
            } 
            // fall through
          case 94: break;
          case 45: 
            { return symbol(sym._boolean);
            } 
            // fall through
          case 95: break;
          case 46: 
            { return symbol(sym._extends );
            } 
            // fall through
          case 96: break;
          case 47: 
            { return symbol(sym._println );
            } 
            // fall through
          case 97: break;
          case 48: 
            { return symbol(sym._newarray );
            } 
            // fall through
          case 98: break;
          case 49: 
            { return symbol(sym._interface );
            } 
            // fall through
          case 99: break;
          case 50: 
            { return symbol(sym._implements );
            } 
            // fall through
          case 100: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
