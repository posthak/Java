// Написать метод который приводит сторку к нормальному виду
// строка на вход
// Добрый день Как дела Все хорошо
// выход
// Добрый день. Как дела. Все хорошо.

public class homeWork2_1 {
    public static void main(String[] args) {
        String str = "Добрый день Как дела Все хорошо";
        System.out.println(ArrangeLine(str));

    }

    public static String ArrangeLine(String incomingString) {
        StringBuilder tempString = new StringBuilder();
        tempString.append(incomingString.charAt(0));
        for (int i = 1; i < incomingString.length(); i++) {
            if (Character.isUpperCase(incomingString.charAt(i))) {
                tempString.deleteCharAt(tempString.length() - 1);
                tempString.append(". " + incomingString.charAt(i));
            } else {
                tempString.append(incomingString.charAt(i));
            }
        }
        tempString.append(".");
        return tempString.toString();
    }
}
