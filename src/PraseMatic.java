public class PraseMatic {
    public static void main(String[] args) {
        String[] wordlistOne = {"круглосуточный", "трех-звенный", "взаимный", "обоюдный выигрыш", "фронтэд", "бэкэнд", "на основе веб технологий", "проникающий", "умный", "метод критического пути, динамичный."};
        String[] wordlistTwo = {"уполномеченный", "чистый продукт", "умный", "ориетированный", "центральный", "распределенный", "кластеризированный", "фирменный" , "не стандартный ум", "сетевой", "сфокусированный", "выровненый", "нацеленный на", "совместный", "ускоренный."};
        int OneLenght = wordlistOne.length;
        int TwoLenght = wordlistTwo.length;
        int rand1 = (int) (Math.random() * OneLenght);
        int rand2 = (int) (Math.random() * TwoLenght);
        String phrase = wordlistOne[rand1] + " " + wordlistTwo[rand2];
        System.out.println("Все что нам нужно это " + phrase);
    }
}
