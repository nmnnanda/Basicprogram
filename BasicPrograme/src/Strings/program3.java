package Strings;
                             //program for making first letter into a capital in a sentence 
public class program3 {
	
    public static void main(String[] args) {
        String sentence = "the quick brown fox jumps over the lazy dog";
        String capitalized = "";
                                                                             // Loop through each word in the input sentence
        for (String word : sentence.split(" ")) {
                                                                                                 // Capitalize the first letter of the current word
            String capitalizedWord = word.substring(0, 1).toUpperCase() + word.substring(1);
                                                                                                 // Add the capitalized word to the output string
            capitalized += capitalizedWord + " ";
        }
        System.out.println("The capitalized sentence is: " + capitalized);
    }
}

//charAt(int index)                                              : Returns the character at the specified index in the string.
//codePointAt(int index)                                         : Returns the Unicode code point value of the character at the specified index.
//codePointBefore(int index)                                     : Returns the Unicode code point value of the character before the specified index.
//codePointCount(int beginIndex, int endIndex)                   : Returns the number of Unicode code points in the specified text range of this string.
//compareTo(String anotherString)                                : Compares two strings lexicographically.
//compareToIgnoreCase(String str)                                : Compares two strings lexicographically, ignoring case differences.
//concat(String str)                                             : Concatenates the specified string to the end of this string.
//contains(CharSequence s)                                       : Returns true if this string contains the specified sequence of char values.
//contentEquals(CharSequence cs)                                 : Returns true if this string contains the same sequence of characters as the specified CharSequence.
//endsWith(String suffix)                                        : Tests if this string ends with the specified suffix.
//equals(Object anObject)                                        : Compares this string to the specified object.
//equalsIgnoreCase(String anotherString)                         : Compares two strings lexicographically, ignoring case differences.
//format(String format, Object... args)                          : Returns a formatted string using the specified format string and arguments.
//getBytes()                                                     : Encodes this string into a sequence of bytes using the platform's default charset.
//getBytes(Charset charset)                                      : Encodes this string into a sequence of bytes using the specified charset.
//getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)   : Copies characters from this string into the destination character array.
//hashCode()                                                     : Returns a hash code for this string.
//indexOf(int ch)                                                : Returns the index within this string of the first occurrence of the specified character.
//indexOf(int ch, int fromIndex)                                 : Returns the index within this string of the first occurrence of the specified character, starting the search at the specified index.
//indexOf(String str)                                            : Returns the index within this string of the first occurrence of the specified substring.
//indexOf(String str, int fromIndex)                             : Returns the index within this string of the first occurrence of the specified substring, starting at the specified index.
//intern()                                                       : Returns a canonical representation for the string object.
//isEmpty()                                                      : Returns true if, and only if, length() is 0.
//join(CharSequence delimiter, CharSequence... elements)         : Returns a new String composed of the elements joined with the specified delimiter.
//lastIndexOf(int ch)                                            : Returns the index within this string of the last occurrence of the specified character.
//lastIndexOf(int ch, int fromIndex)                             : Returns the index within this string of the last occurrence of the specified character, searching backward starting at the specified index.
//lastIndexOf(String str)                                        : Returns the index within this string of the last occurrence of the specified substring.
//lastIndexOf(String str, int fromIndex)                         : Returns the index within this string of the last occurrence of the specified substring, searching backward starting at the specified index.
//length()                                                       : Returns the length of this string.
//matches(String regex)                                          : Tells whether or not this string matches the given regular expression.
//offsetByCodePoints(int index, int codePointOffset)             : Returns the index within this String that is offset from the given index by codePointOffset code