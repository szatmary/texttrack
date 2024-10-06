/*
 * The MIT License
 *
 * Copyright 2016-2017 Twitch Interactive, Inc. or its affiliates. All Rights Reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package ph.extremelogic.libcaption.eia608;

/**
 * eia608_charmap.c
 */
public class eia608_charmap_c {
    public static final String[] eia608_char_map = new String[]{
            eia608_charmap_header.EIA608_CHAR_NULL,
            eia608_charmap_header.EIA608_CHAR_SPACE,
            eia608_charmap_header.EIA608_CHAR_EXCLAMATION_MARK,
            eia608_charmap_header.EIA608_CHAR_QUOTATION_MARK,
            eia608_charmap_header.EIA608_CHAR_NUMBER_SIGN,
            eia608_charmap_header.EIA608_CHAR_DOLLAR_SIGN,
            eia608_charmap_header.EIA608_CHAR_PERCENT_SIGN,
            eia608_charmap_header.EIA608_CHAR_AMPERSAND,
            eia608_charmap_header.EIA608_CHAR_LEFT_SINGLE_QUOTATION_MARK,
            eia608_charmap_header.EIA608_CHAR_LEFT_PARENTHESIS,
            eia608_charmap_header.EIA608_CHAR_RIGHT_PARENTHESIS,
            eia608_charmap_header.EIA608_CHAR_LATIN_SMALL_LETTER_A_WITH_ACUTE,
            eia608_charmap_header.EIA608_CHAR_PLUS_SIGN,
            eia608_charmap_header.EIA608_CHAR_COMMA,
            eia608_charmap_header.EIA608_CHAR_HYPHEN_MINUS,
            eia608_charmap_header.EIA608_CHAR_FULL_STOP,
            eia608_charmap_header.EIA608_CHAR_SOLIDUS,
            eia608_charmap_header.EIA608_CHAR_DIGIT_ZERO,
            eia608_charmap_header.EIA608_CHAR_DIGIT_ONE,
            eia608_charmap_header.EIA608_CHAR_DIGIT_TWO,
            eia608_charmap_header.EIA608_CHAR_DIGIT_THREE,
            eia608_charmap_header.EIA608_CHAR_DIGIT_FOUR,
            eia608_charmap_header.EIA608_CHAR_DIGIT_FIVE,
            eia608_charmap_header.EIA608_CHAR_DIGIT_SIX,
            eia608_charmap_header.EIA608_CHAR_DIGIT_SEVEN,
            eia608_charmap_header.EIA608_CHAR_DIGIT_EIGHT,
            eia608_charmap_header.EIA608_CHAR_DIGIT_NINE,
            eia608_charmap_header.EIA608_CHAR_COLON,
            eia608_charmap_header.EIA608_CHAR_SEMICOLON,
            eia608_charmap_header.EIA608_CHAR_LESS_THAN_SIGN,
            eia608_charmap_header.EIA608_CHAR_EQUALS_SIGN,
            eia608_charmap_header.EIA608_CHAR_GREATER_THAN_SIGN,
            eia608_charmap_header.EIA608_CHAR_QUESTION_MARK,
            eia608_charmap_header.EIA608_CHAR_COMMERCIAL_AT,
            eia608_charmap_header.EIA608_CHAR_LATIN_CAPITAL_LETTER_A,
            eia608_charmap_header.EIA608_CHAR_LATIN_CAPITAL_LETTER_B,
            eia608_charmap_header.EIA608_CHAR_LATIN_CAPITAL_LETTER_C,
            eia608_charmap_header.EIA608_CHAR_LATIN_CAPITAL_LETTER_D,
            eia608_charmap_header.EIA608_CHAR_LATIN_CAPITAL_LETTER_E,
            eia608_charmap_header.EIA608_CHAR_LATIN_CAPITAL_LETTER_F,
            eia608_charmap_header.EIA608_CHAR_LATIN_CAPITAL_LETTER_G,
            eia608_charmap_header.EIA608_CHAR_LATIN_CAPITAL_LETTER_H,
            eia608_charmap_header.EIA608_CHAR_LATIN_CAPITAL_LETTER_I,
            eia608_charmap_header.EIA608_CHAR_LATIN_CAPITAL_LETTER_J,
            eia608_charmap_header.EIA608_CHAR_LATIN_CAPITAL_LETTER_K,
            eia608_charmap_header.EIA608_CHAR_LATIN_CAPITAL_LETTER_L,
            eia608_charmap_header.EIA608_CHAR_LATIN_CAPITAL_LETTER_M,
            eia608_charmap_header.EIA608_CHAR_LATIN_CAPITAL_LETTER_N,
            eia608_charmap_header.EIA608_CHAR_LATIN_CAPITAL_LETTER_O,
            eia608_charmap_header.EIA608_CHAR_LATIN_CAPITAL_LETTER_P,
            eia608_charmap_header.EIA608_CHAR_LATIN_CAPITAL_LETTER_Q,
            eia608_charmap_header.EIA608_CHAR_LATIN_CAPITAL_LETTER_R,
            eia608_charmap_header.EIA608_CHAR_LATIN_CAPITAL_LETTER_S,
            eia608_charmap_header.EIA608_CHAR_LATIN_CAPITAL_LETTER_T,
            eia608_charmap_header.EIA608_CHAR_LATIN_CAPITAL_LETTER_U,
            eia608_charmap_header.EIA608_CHAR_LATIN_CAPITAL_LETTER_V,
            eia608_charmap_header.EIA608_CHAR_LATIN_CAPITAL_LETTER_W,
            eia608_charmap_header.EIA608_CHAR_LATIN_CAPITAL_LETTER_X,
            eia608_charmap_header.EIA608_CHAR_LATIN_CAPITAL_LETTER_Y,
            eia608_charmap_header.EIA608_CHAR_LATIN_CAPITAL_LETTER_Z,
            eia608_charmap_header.EIA608_CHAR_LEFT_SQUARE_BRACKET,
            eia608_charmap_header.EIA608_CHAR_LATIN_SMALL_LETTER_E_WITH_ACUTE,
            eia608_charmap_header.EIA608_CHAR_RIGHT_SQUARE_BRACKET,
            eia608_charmap_header.EIA608_CHAR_LATIN_SMALL_LETTER_I_WITH_ACUTE,
            eia608_charmap_header.EIA608_CHAR_LATIN_SMALL_LETTER_O_WITH_ACUTE,
            eia608_charmap_header.EIA608_CHAR_LATIN_SMALL_LETTER_U_WITH_ACUTE,
            eia608_charmap_header.EIA608_CHAR_LATIN_SMALL_LETTER_A,
            eia608_charmap_header.EIA608_CHAR_LATIN_SMALL_LETTER_B,
            eia608_charmap_header.EIA608_CHAR_LATIN_SMALL_LETTER_C,
            eia608_charmap_header.EIA608_CHAR_LATIN_SMALL_LETTER_D,
            eia608_charmap_header.EIA608_CHAR_LATIN_SMALL_LETTER_E,
            eia608_charmap_header.EIA608_CHAR_LATIN_SMALL_LETTER_F,
            eia608_charmap_header.EIA608_CHAR_LATIN_SMALL_LETTER_G,
            eia608_charmap_header.EIA608_CHAR_LATIN_SMALL_LETTER_H,
            eia608_charmap_header.EIA608_CHAR_LATIN_SMALL_LETTER_I,
            eia608_charmap_header.EIA608_CHAR_LATIN_SMALL_LETTER_J,
            eia608_charmap_header.EIA608_CHAR_LATIN_SMALL_LETTER_K,
            eia608_charmap_header.EIA608_CHAR_LATIN_SMALL_LETTER_L,
            eia608_charmap_header.EIA608_CHAR_LATIN_SMALL_LETTER_M,
            eia608_charmap_header.EIA608_CHAR_LATIN_SMALL_LETTER_N,
            eia608_charmap_header.EIA608_CHAR_LATIN_SMALL_LETTER_O,
            eia608_charmap_header.EIA608_CHAR_LATIN_SMALL_LETTER_P,
            eia608_charmap_header.EIA608_CHAR_LATIN_SMALL_LETTER_Q,
            eia608_charmap_header.EIA608_CHAR_LATIN_SMALL_LETTER_R,
            eia608_charmap_header.EIA608_CHAR_LATIN_SMALL_LETTER_S,
            eia608_charmap_header.EIA608_CHAR_LATIN_SMALL_LETTER_T,
            eia608_charmap_header.EIA608_CHAR_LATIN_SMALL_LETTER_U,
            eia608_charmap_header.EIA608_CHAR_LATIN_SMALL_LETTER_V,
            eia608_charmap_header.EIA608_CHAR_LATIN_SMALL_LETTER_W,
            eia608_charmap_header.EIA608_CHAR_LATIN_SMALL_LETTER_X,
            eia608_charmap_header.EIA608_CHAR_LATIN_SMALL_LETTER_Y,
            eia608_charmap_header.EIA608_CHAR_LATIN_SMALL_LETTER_Z,
            eia608_charmap_header.EIA608_CHAR_LATIN_SMALL_LETTER_C_WITH_CEDILLA,
            eia608_charmap_header.EIA608_CHAR_DIVISION_SIGN,
            eia608_charmap_header.EIA608_CHAR_LATIN_CAPITAL_LETTER_N_WITH_TILDE,
            eia608_charmap_header.EIA608_CHAR_LATIN_SMALL_LETTER_N_WITH_TILDE,
            eia608_charmap_header.EIA608_CHAR_FULL_BLOCK,
            eia608_charmap_header.EIA608_CHAR_REGISTERED_SIGN,
            eia608_charmap_header.EIA608_CHAR_DEGREE_SIGN,
            eia608_charmap_header.EIA608_CHAR_VULGAR_FRACTION_ONE_HALF,
            eia608_charmap_header.EIA608_CHAR_INVERTED_QUESTION_MARK,
            eia608_charmap_header.EIA608_CHAR_TRADE_MARK_SIGN,
            eia608_charmap_header.EIA608_CHAR_CENT_SIGN,
            eia608_charmap_header.EIA608_CHAR_POUND_SIGN,
            eia608_charmap_header.EIA608_CHAR_EIGHTH_NOTE,
            eia608_charmap_header.EIA608_CHAR_LATIN_SMALL_LETTER_A_WITH_GRAVE,
            eia608_charmap_header.EIA608_CHAR_NO_BREAK_SPACE,
            eia608_charmap_header.EIA608_CHAR_LATIN_SMALL_LETTER_E_WITH_GRAVE,
            eia608_charmap_header.EIA608_CHAR_LATIN_SMALL_LETTER_A_WITH_CIRCUMFLEX,
            eia608_charmap_header.EIA608_CHAR_LATIN_SMALL_LETTER_E_WITH_CIRCUMFLEX,
            eia608_charmap_header.EIA608_CHAR_LATIN_SMALL_LETTER_I_WITH_CIRCUMFLEX,
            eia608_charmap_header.EIA608_CHAR_LATIN_SMALL_LETTER_O_WITH_CIRCUMFLEX,
            eia608_charmap_header.EIA608_CHAR_LATIN_SMALL_LETTER_U_WITH_CIRCUMFLEX,
            eia608_charmap_header.EIA608_CHAR_LATIN_CAPITAL_LETTER_A_WITH_ACUTE,
            eia608_charmap_header.EIA608_CHAR_LATIN_CAPITAL_LETTER_E_WITH_ACUTE,
            eia608_charmap_header.EIA608_CHAR_LATIN_CAPITAL_LETTER_O_WITH_ACUTE,
            eia608_charmap_header.EIA608_CHAR_LATIN_CAPITAL_LETTER_U_WITH_ACUTE,
            eia608_charmap_header.EIA608_CHAR_LATIN_CAPITAL_LETTER_U_WITH_DIAERESIS,
            eia608_charmap_header.EIA608_CHAR_LATIN_SMALL_LETTER_U_WITH_DIAERESIS,
            eia608_charmap_header.EIA608_CHAR_RIGHT_SINGLE_QUOTATION_MARK,
            eia608_charmap_header.EIA608_CHAR_INVERTED_EXCLAMATION_MARK,
            eia608_charmap_header.EIA608_CHAR_ASTERISK,
            eia608_charmap_header.EIA608_CHAR_APOSTROPHE,
            eia608_charmap_header.EIA608_CHAR_EM_DASH,
            eia608_charmap_header.EIA608_CHAR_COPYRIGHT_SIGN,
            eia608_charmap_header.EIA608_CHAR_SERVICE_MARK,
            eia608_charmap_header.EIA608_CHAR_BULLET,
            eia608_charmap_header.EIA608_CHAR_LEFT_DOUBLE_QUOTATION_MARK,
            eia608_charmap_header.EIA608_CHAR_RIGHT_DOUBLE_QUOTATION_MARK,
            eia608_charmap_header.EIA608_CHAR_LATIN_CAPITAL_LETTER_A_WITH_GRAVE,
            eia608_charmap_header.EIA608_CHAR_LATIN_CAPITAL_LETTER_A_WITH_CIRCUMFLEX,
            eia608_charmap_header.EIA608_CHAR_LATIN_CAPITAL_LETTER_C_WITH_CEDILLA,
            eia608_charmap_header.EIA608_CHAR_LATIN_CAPITAL_LETTER_E_WITH_GRAVE,
            eia608_charmap_header.EIA608_CHAR_LATIN_CAPITAL_LETTER_E_WITH_CIRCUMFLEX,
            eia608_charmap_header.EIA608_CHAR_LATIN_CAPITAL_LETTER_E_WITH_DIAERESIS,
            eia608_charmap_header.EIA608_CHAR_LATIN_SMALL_LETTER_E_WITH_DIAERESIS,
            eia608_charmap_header.EIA608_CHAR_LATIN_CAPITAL_LETTER_I_WITH_CIRCUMFLEX,
            eia608_charmap_header.EIA608_CHAR_LATIN_CAPITAL_LETTER_I_WITH_DIAERESIS,
            eia608_charmap_header.EIA608_CHAR_LATIN_SMALL_LETTER_I_WITH_DIAERESIS,
            eia608_charmap_header.EIA608_CHAR_LATIN_CAPITAL_LETTER_O_WITH_CIRCUMFLEX,
            eia608_charmap_header.EIA608_CHAR_LATIN_CAPITAL_LETTER_U_WITH_GRAVE,
            eia608_charmap_header.EIA608_CHAR_LATIN_SMALL_LETTER_U_WITH_GRAVE,
            eia608_charmap_header.EIA608_CHAR_LATIN_CAPITAL_LETTER_U_WITH_CIRCUMFLEX,
            eia608_charmap_header.EIA608_CHAR_LEFT_POINTING_DOUBLE_ANGLE_QUOTATION_MARK,
            eia608_charmap_header.EIA608_CHAR_RIGHT_POINTING_DOUBLE_ANGLE_QUOTATION_MARK,
            eia608_charmap_header.EIA608_CHAR_LATIN_CAPITAL_LETTER_A_WITH_TILDE,
            eia608_charmap_header.EIA608_CHAR_LATIN_SMALL_LETTER_A_WITH_TILDE,
            eia608_charmap_header.EIA608_CHAR_LATIN_CAPITAL_LETTER_I_WITH_ACUTE,
            eia608_charmap_header.EIA608_CHAR_LATIN_CAPITAL_LETTER_I_WITH_GRAVE,
            eia608_charmap_header.EIA608_CHAR_LATIN_SMALL_LETTER_I_WITH_GRAVE,
            eia608_charmap_header.EIA608_CHAR_LATIN_CAPITAL_LETTER_O_WITH_GRAVE,
            eia608_charmap_header.EIA608_CHAR_LATIN_SMALL_LETTER_O_WITH_GRAVE,
            eia608_charmap_header.EIA608_CHAR_LATIN_CAPITAL_LETTER_O_WITH_TILDE,
            eia608_charmap_header.EIA608_CHAR_LATIN_SMALL_LETTER_O_WITH_TILDE,
            eia608_charmap_header.EIA608_CHAR_LEFT_CURLY_BRACKET,
            eia608_charmap_header.EIA608_CHAR_RIGHT_CURLY_BRACKET,
            eia608_charmap_header.EIA608_CHAR_REVERSE_SOLIDUS,
            eia608_charmap_header.EIA608_CHAR_CIRCUMFLEX_ACCENT,
            eia608_charmap_header.EIA608_CHAR_LOW_LINE,
            eia608_charmap_header.EIA608_CHAR_VERTICAL_LINE,
            eia608_charmap_header.EIA608_CHAR_TILDE,
            eia608_charmap_header.EIA608_CHAR_LATIN_CAPITAL_LETTER_A_WITH_DIAERESIS,
            eia608_charmap_header.EIA608_CHAR_LATIN_SMALL_LETTER_A_WITH_DIAERESIS,
            eia608_charmap_header.EIA608_CHAR_LATIN_CAPITAL_LETTER_O_WITH_DIAERESIS,
            eia608_charmap_header.EIA608_CHAR_LATIN_SMALL_LETTER_O_WITH_DIAERESIS,
            eia608_charmap_header.EIA608_CHAR_LATIN_SMALL_LETTER_SHARP_S,
            eia608_charmap_header.EIA608_CHAR_YEN_SIGN,
            eia608_charmap_header.EIA608_CHAR_CURRENCY_SIGN,
            eia608_charmap_header.EIA608_CHAR_BROKEN_BAR,
            eia608_charmap_header.EIA608_CHAR_LATIN_CAPITAL_LETTER_A_WITH_RING_ABOVE,
            eia608_charmap_header.EIA608_CHAR_LATIN_SMALL_LETTER_A_WITH_RING_ABOVE,
            eia608_charmap_header.EIA608_CHAR_LATIN_CAPITAL_LETTER_O_WITH_STROKE,
            eia608_charmap_header.EIA608_CHAR_LATIN_SMALL_LETTER_O_WITH_STROKE,
            eia608_charmap_header.EIA608_CHAR_BOX_DRAWINGS_LIGHT_DOWN_AND_RIGHT,
            eia608_charmap_header.EIA608_CHAR_BOX_DRAWINGS_LIGHT_DOWN_AND_LEFT,
            eia608_charmap_header.EIA608_CHAR_BOX_DRAWINGS_LIGHT_UP_AND_RIGHT,
            eia608_charmap_header.EIA608_CHAR_BOX_DRAWINGS_LIGHT_UP_AND_LEFT,
    };
}