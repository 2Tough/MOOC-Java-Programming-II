

public class Checker {
    private String word;
    
    public Checker() {
        this.word = word;
    }
    
    public boolean isDayOfWeek(String string) {
        if (string.matches("mon|tue|wed|thu|fri|sat|sun")) {
            return true;
        }
        return false;
    }
    
    public boolean allVowels(String string) {
        return string.matches("(a|e|i|o|u)*{1,}");
    }
    
    public boolean timeOfDay(String string) {
        return string.matches("^([0-1][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]$");
    }
}
