package com.string;

/**
 * URLParser
 *
 * Assignment 5.1
 *
 * @author Kurchblete
 *
 */
public class URLParser {

    public static void main(String[] args) {
        String str = new String("https://github.com/syssrc/21-ip-assignment");
        // str = encode(str);
        // str = decode(str);
        // System.out.println(str);
        System.out.println(str.codePointAt(5));
    }

    /**
     * Encode rawURL into percent-encoding format
     *
     * @param rawURL the URL to be encoded
     * @return string of encoded URL
     */
    public static String encode(String rawURL) {
        String str = rawURL;
        String[] character = { "%", "$", "&", "+", ",", "/", ":", ";", "=", "?", "@", " ", "\"", "<", ">", "#", "{",
                "}", "\\", "^", "~", "[", "]", "`" };
        String[] hex = { "%25", "%24", "%26", "%2b", "%2c", "%2f", "%3a", "%3b", "%3d", "%3f", "%40", "%20", "%22",
                "%3c", "%3e", "%23", "%7b", "%7d", "%5c", "%5e", "%7e", "%5b", "%5d", "%60" };
        
        for (int i = 0; i < character.length; i++) {
            if (str.contains(character[i])) {
                String hexa = "%x", character[i];
                str = str.replaceAll(character[i], ("%x", character[i]));
            }
        }
        return str;
    }

    /**
     * Decode percent-encoding URL into raw URL
     *
     * @param encodedURL the percent-encoding URL to be decoded
     * @return string of decoded URL
     */
    public static String decode(String encodedURL) {
        String str = encodedURL;
        String[] character = { "%", "$", "&", "+", ",", "/", ":", ";", "=", "?", "@", " ", "\"", "<", ">", "#", "{",
                "}", "\\", "^", "~", "[", "]", "`" };
        String[] hex = { "%25", "%24", "%26", "%2b", "%2c", "%2f", "%3a", "%3b", "%3d", "%3f", "%40", "%20", "%22",
                "%3c", "%3e", "%23", "%7b", "%7d", "%5c", "%5e", "%7e", "%5b", "%5d", "%60" };
        for (int i = 0; i < character.length; i++) {
            if (str.contains(hex[i])) {
                str = str.replaceAll(hex[i], character[i].toUpperCase());
            }
        }
        return str;
    }
}