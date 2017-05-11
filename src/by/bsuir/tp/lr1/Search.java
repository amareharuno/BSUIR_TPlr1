package by.bsuir.tp.lr1;

public class Search {

    public static void findSubstringInString(String substring, String string) {
        char[] substringMass = substring.toCharArray();
        char[] stringMass = string.toCharArray();

        if (substringMass.length == 0 || stringMass.length == 0) {
            System.out.println("Строка или подстрока пусты");
        }
        else {
            int occursCount = 0;

            for (int i = 0; i <= stringMass.length - substringMass.length; i++) {
                int iter = 0;
                for (int j = 0; j < substringMass.length; j++) {
                    if (stringMass[i + j] == substringMass[j]) {
                        iter++;
                    }
                }
                if (iter == substringMass.length) {
                    occursCount++;
                }
            }

            System.out.println("Подстрока " + substring + " найдена в строке " + string + " " + occursCount + " раз(а).");
        }
    }
}
