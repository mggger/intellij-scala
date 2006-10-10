package org.jetbrains.plugins.scala.lang.lexer;

import com.intellij.psi.tree.IElementType;

/**
 * Author: Ilya Sergey
 * Date: 24.09.2006
 * Time: 12:39:38
 */
public interface ScalaTokenTypes {

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////// White spaces in line /////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    IElementType tWHITE_SPACE_IN_LINE = new ScalaElementType("white space in line");

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////// White spaces in line /////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    IElementType tWHITE_SPACE_LINE_TERMINATE = new ScalaElementType("white space line terminate");

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////// Stub /////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    IElementType tSTUB = new ScalaElementType("stub");

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////// Comments /////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    IElementType tCOMMENT = new ScalaElementType("comment");

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////// Strings & chars //////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    IElementType tSTRING = new ScalaElementType("string content");
    IElementType tSTRING_BEGIN = new ScalaElementType("begin of string");
    IElementType tSTRING_END = new ScalaElementType("end of string");
                                                        
    IElementType tCHAR = new ScalaElementType("Character");

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////// integer and float literals ///////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    IElementType tINTEGER = new ScalaElementType("integer");
    IElementType tFLOAT = new ScalaElementType("float");

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////// Operators ////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    IElementType tEQUAL = new ScalaElementType("==");
    IElementType tNOTEQUAL = new ScalaElementType("!=");
    IElementType tLESS = new ScalaElementType("<");
    IElementType tLESSOREQUAL = new ScalaElementType("<=");
    IElementType tGREATER = new ScalaElementType(">");
    IElementType tGREATEROREQUAL = new ScalaElementType(">=");

    IElementType tASSGN = new ScalaElementType("=");
    IElementType tPLUS = new ScalaElementType("+");
    IElementType tMINUS = new ScalaElementType("-");
    IElementType tSTAR = new ScalaElementType("*");
    IElementType tDIV = new ScalaElementType("/");

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////// Braces ///////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    IElementType tLSQBRACKET = new ScalaElementType("[");
    IElementType tRSQBRACKET = new ScalaElementType("]");
    IElementType tLBRACE = new ScalaElementType("{");
    IElementType tRBRACE = new ScalaElementType("}");
    IElementType tLPARENTHIS = new ScalaElementType("(");
    IElementType tRPARENTHIS = new ScalaElementType(")");

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////// keywords /////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    IElementType kABSTRACT = new ScalaElementType("abstract");
    IElementType kCASE = new ScalaElementType("case");
    IElementType kCATCH = new ScalaElementType("catch");
    IElementType kCLASS = new ScalaElementType("class");
    IElementType kDEF = new ScalaElementType("def");
    IElementType kDO = new ScalaElementType("do");
    IElementType kELSE = new ScalaElementType("else");
    IElementType kEXTENDS = new ScalaElementType("extends");
    IElementType kFALSE = new ScalaElementType("false");
    IElementType kFINAL = new ScalaElementType("final");
    IElementType kFINALLY = new ScalaElementType("finally");
    IElementType kFOR = new ScalaElementType("for");
    IElementType kIF = new ScalaElementType("if");
    IElementType kIMPLICIT = new ScalaElementType("implicit");
    IElementType kIMPORT = new ScalaElementType("import");
    IElementType kMATCH = new ScalaElementType("match");
    IElementType kNEW = new ScalaElementType("new");
    IElementType kNULL = new ScalaElementType("null");
    IElementType kOBJECT = new ScalaElementType("object");
    IElementType kOVERRIDE = new ScalaElementType("override");
    IElementType kPACKAGE = new ScalaElementType("package");
    IElementType kPRIVATE = new ScalaElementType("private");
    IElementType kPROTECTED = new ScalaElementType("protected");
    IElementType kREQUIRES = new ScalaElementType("requires");
    IElementType kRETURN = new ScalaElementType("return");
    IElementType kSEALED = new ScalaElementType("sealed");
    IElementType kSUPER = new ScalaElementType("super");
    IElementType kTHIS = new ScalaElementType("this");
    IElementType kTHROW = new ScalaElementType("throw");
    IElementType kTRAIT = new ScalaElementType("trait");
    IElementType kTRY = new ScalaElementType("try");
    IElementType kTRUE = new ScalaElementType("true");
    IElementType kTYPE = new ScalaElementType("type");
    IElementType kVAL = new ScalaElementType("val");
    IElementType kVAR = new ScalaElementType("var");
    IElementType kWHILE = new ScalaElementType("while");
    IElementType kWHITH = new ScalaElementType("whith");
    IElementType kYIELD = new ScalaElementType("yield");
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////// variables and constants //////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    IElementType tIDENTIFIER = new ScalaElementType("identifier");

    ////////////////////////// xml tag /////////////////////////////////////////////////////////////////////////////////////
    IElementType tOPENXMLTAG = new ScalaElementType("opened xml tag");
    IElementType tCLOSEXMLTAG = new ScalaElementType("closed xml tag");
    IElementType tBEGINSCALAEXPR = new ScalaElementType("begin of scala expression");
    IElementType tENDSCALAEXPR = new ScalaElementType("end of scala expression");


    IElementType tDOT = new ScalaElementType(".");
    IElementType tCOMMA = new ScalaElementType(",");
    IElementType tSEMICOLON = new ScalaElementType(";");


    IElementType kUNDER = new ScalaElementType("_");
    IElementType kCOLON = new ScalaElementType(":");
    IElementType kASSIGN = new ScalaElementType("=");
    IElementType kFUNTYPE = new ScalaElementType("=>");
    IElementType kFUNTYPE_ASCII = new ScalaElementType(Character.toString('\u21D2'));
    IElementType kCHOOSE = new ScalaElementType("<%");
    IElementType kLOWER_BOUND = new ScalaElementType(">:");
    IElementType kUPPER_BOUND = new ScalaElementType("<:");
    IElementType kINNER_CLASS = new ScalaElementType("#");
    IElementType kAT = new ScalaElementType("@");
    

}