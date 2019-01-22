/*******************************************************************************
 * Copyright (c) 2000, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.aspectj.org.eclipse.jdt.internal.compiler.parser;

/**
 * IMPORTANT NOTE: These constants are dedicated to the internal Scanner implementation. 
 * It is mirrored in org.aspectj.org.eclipse.jdt.core.compiler public package where it is API. 
 * The mirror implementation is using the backward compatible ITerminalSymbols constant 
 * definitions (stable with 2.0), whereas the internal implementation uses TerminalTokens 
 * which constant values reflect the latest parser generation state.
 */
/**
 * Maps each terminal symbol in the java-grammar into a unique integer. 
 * This integer is used to represent the terminal when computing a parsing action. 
 * 
 * Disclaimer : These constant values are generated automatically using a Java 
 * grammar, therefore their actual values are subject to change if new keywords 
 * were added to the language (for instance, 'assert' is a keyword in 1.4).
 */
public interface TerminalTokens {

	// special tokens not part of grammar - not autogenerated
	int TokenNameWHITESPACE = 1000,
		TokenNameCOMMENT_LINE = 1001,
		TokenNameCOMMENT_BLOCK = 1002,
		TokenNameCOMMENT_JAVADOC = 1003;
	


    public final static int
      TokenNameIdentifier = 21,
      TokenNameabstract = 54,
      TokenNameassert = 80,
      TokenNameboolean = 39,
      TokenNamebreak = 81,
      TokenNamebyte = 40,
      TokenNamecase = 105,
      TokenNamecatch = 106,
      TokenNamechar = 41,
      TokenNameclass = 91,
      TokenNamecontinue = 82,
      TokenNameconst = 115,
      TokenNamedefault = 114,
      TokenNamedo = 83,
      TokenNamedouble = 42,
      TokenNameelse = 107,
      TokenNameenum = 111,
      TokenNameextends = 92,
      TokenNamefalse = 55,
      TokenNamefinal = 56,
      TokenNamefinally = 108,
      TokenNamefloat = 43,
      TokenNamefor = 84,
      TokenNamegoto = 116,
      TokenNameif = 85,
      TokenNameimplements = 112,
      TokenNameimport = 93,
      TokenNameinstanceof = 14,
      TokenNameint = 44,
      TokenNameinterface = 109,
      TokenNamelong = 45,
      TokenNamenative = 57,
      TokenNamenew = 48,
      TokenNamenull = 58,
      TokenNamepackage = 90,
      TokenNameprivate = 59,
      TokenNameprotected = 60,
      TokenNamepublic = 61,
      TokenNamereturn = 86,
      TokenNameshort = 46,
      TokenNamestatic = 52,
      TokenNamestrictfp = 62,
      TokenNamesuper = 49,
      TokenNameswitch = 87,
      TokenNamesynchronized = 53,
      TokenNamethis = 51,
      TokenNamethrow = 88,
      TokenNamethrows = 110,
      TokenNametransient = 63,
      TokenNametrue = 64,
      TokenNametry = 89,
      TokenNamevoid = 47,
      TokenNamevolatile = 65,
      TokenNamewhile = 79,
      TokenNameaspect = 29,
      TokenNamepointcut = 31,
      TokenNamearound = 32,
      TokenNamebefore = 33,
      TokenNameafter = 34,
      TokenNamedeclare = 35,
      TokenNameprivileged = 30,
      TokenNameIntegerLiteral = 66,
      TokenNameLongLiteral = 67,
      TokenNameFloatingPointLiteral = 68,
      TokenNameDoubleLiteral = 69,
      TokenNameCharacterLiteral = 70,
      TokenNameStringLiteral = 71,
      TokenNamePLUS_PLUS = 10,
      TokenNameMINUS_MINUS = 11,
      TokenNameEQUAL_EQUAL = 19,
      TokenNameLESS_EQUAL = 16,
      TokenNameGREATER_EQUAL = 17,
      TokenNameNOT_EQUAL = 20,
      TokenNameLEFT_SHIFT = 15,
      TokenNameRIGHT_SHIFT = 9,
      TokenNameUNSIGNED_RIGHT_SHIFT = 12,
      TokenNamePLUS_EQUAL = 94,
      TokenNameMINUS_EQUAL = 95,
      TokenNameMULTIPLY_EQUAL = 96,
      TokenNameDIVIDE_EQUAL = 97,
      TokenNameAND_EQUAL = 98,
      TokenNameOR_EQUAL = 99,
      TokenNameXOR_EQUAL = 100,
      TokenNameREMAINDER_EQUAL = 101,
      TokenNameLEFT_SHIFT_EQUAL = 102,
      TokenNameRIGHT_SHIFT_EQUAL = 103,
      TokenNameUNSIGNED_RIGHT_SHIFT_EQUAL = 104,
      TokenNameOR_OR = 26,
      TokenNameAND_AND = 25,
      TokenNamePLUS = 2,
      TokenNameMINUS = 3,
      TokenNameNOT = 73,
      TokenNameREMAINDER = 7,
      TokenNameXOR = 23,
      TokenNameAND = 18,
      TokenNameMULTIPLY = 5,
      TokenNameOR = 27,
      TokenNameTWIDDLE = 76,
      TokenNameDIVIDE = 8,
      TokenNameGREATER = 13,
      TokenNameLESS = 4,
      TokenNameLPAREN = 22,
      TokenNameRPAREN = 36,
      TokenNameLBRACE = 77,
      TokenNameRBRACE = 38,
      TokenNameLBRACKET = 6,
      TokenNameRBRACKET = 75,
      TokenNameSEMICOLON = 28,
      TokenNameQUESTION = 24,
      TokenNameCOLON = 72,
      TokenNameCOMMA = 37,
      TokenNameDOT = 1,
      TokenNameEQUAL = 78,
      TokenNameAT = 50,
      TokenNameELLIPSIS = 113,
      TokenNameEOF = 74,
      TokenNameERROR = 117;

}
