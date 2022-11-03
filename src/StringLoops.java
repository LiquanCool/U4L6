import java.util.Locale;

public class StringLoops {
    // default constructor; no instance variables
    public StringLoops() {
    }

    public int countCharacters(String character, String searchString) {
        int count = 0;
        for (int i = 0; i < searchString.length(); i++) {
            if (searchString.substring(i, i + 1).equals(character)) {
                count++;
            }
        }
        return count;

    }

    public String reverseString(String origString) {
        String newString = "";
        for (int i = origString.length() - 1; i >= 0; i--) {
            newString = newString + origString.substring(i, i + 1);

        }
        return newString;

    }

    public String reverseString2(String origString) {
        String newString = "";
        for (int i = 0; i < origString.length(); i++) {
            newString = newString + origString.substring(i, i + 1);
        }
        return newString;
    }
    public int countVowels(String origString)
    {
        int count = 0;
        for (int i = 0; i < origString.length(); i++)
        {
            if (origString.substring(i,i+1).equals("a")||origString.substring(i,i+1).equals("e")||origString.substring(i,i+1).equals("i")||origString.substring(i,i+1).equals("o")||origString.substring(i,i+1).equals("u")||origString.substring(i,i+1).equals("A")||origString.substring(i,i+1).equals("E")||origString.substring(i,i+1).equals("I")||origString.substring(i,i+1).equals("O")||origString.substring(i,i+1).equals("U"))
            {
                count++;
            }
        }
        return count;
    }
    public int countString(String searchString, String origString)
    {
        String searchLow = searchString.toLowerCase();
        String origLow = origString.toLowerCase();
        int searchLen = searchLow.length();
        int count = 0;
        for (int i = 0; i < origLow.length()-searchLen+1; i++)
        {
            if (origLow.substring(i,i+searchLen).indexOf(searchLow)!=-1)
            {
                count++;
            }
        }
        return count;
    }
    public String removeString(String searchString, String origString)
    {
        int searchLen = searchString.length();
        int count = 0;
        while(origString.indexOf(searchString) != -1)
        {
            count = origString.indexOf(searchString);
            origString = origString.substring(0, count) + origString.substring(count+searchLen);
        }
        return origString;
    }
    public String replaceCharacter(String searchChar, String origStr, String replaceChar)
    {
        
    }

}