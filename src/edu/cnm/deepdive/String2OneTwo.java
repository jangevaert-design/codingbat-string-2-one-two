package edu.cnm.deepdive;

public class String2OneTwo {


//  Given a string, compute a new string by moving the first char to come after the next two chars,
//  so "abc" yields "bca". Repeat this process for each subsequent group of 3 chars,
//  so "abcdef" yields "bcaefd". Ignore any group of fewer than 3 chars at the end.
//
//  oneTwo("abc") → "bca"
//  oneTwo("tca") → "cat"
//  oneTwo("tcagdo") → "catdog"

  public String oneTwo(String str) {
    String result = "";
    int len = str.length();

    for (int i = 0; i < len - 2; i +=3) {
      result += str.substring(i + 1, i + 3) + str.substring(i, i + 1);
    }

    return result;

  }



}
