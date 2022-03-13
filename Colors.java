
public class Colors {
    public static final String RESET = "\u001B[0m";
    public static final String RED_BRIGHT = "\u001B[091m";
    public static final String YELLOW_BRIGHT = "\u001B[093m";
    public static final String GREEN_BRIGHT = "\u001B[092m";
    public static final String CYAN_BRIGHT = "\u001B[096m";
    public static final String BLUE_BRIGHT = "\u001B[094m";
    public static final String MAGENTA_BRIGHT = "\u001B[095m";
    public static final String ORANGE = "\u001B[38;5;208m";

    public static String colorFromInt(int i) {
        switch (i % 7) {
            case 0:
                return  RED_BRIGHT;
            case 1:
                return YELLOW_BRIGHT;
            case 2:
                return GREEN_BRIGHT;
            case 3:
                return CYAN_BRIGHT;
            case 4:
                return BLUE_BRIGHT;
            case 5:
                return MAGENTA_BRIGHT;
            default:
                return ORANGE;
        }
    }

    public static String Rainbow(String input) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' ') {
                res.append(colorFromInt(i));
                res.append(input.charAt(i));
            }
            else{
                res.append("\s");
            }

        }

        return res + RESET;
    }

}
