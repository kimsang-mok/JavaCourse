public class Main {


    public static void main(String[] args) {
        String[] studentNames = {"Kimsang", "Nan", "Light", "Ze il", "Leng"};
        for (int i = 0; i < 5; i++) {
            LPAStudent s = new LPAStudent("S92300" + i, studentNames[i], switch (i) {
                case 0 -> "05/11/1999";
                case 1 -> "06/11/1999";
                case 2 -> "07/11/1999";
                case 3 -> "08/11/1999";
                case 4 -> "09/11/1999";
                default -> "10/11/1999";
            },
                    "Java Master Class");

            System.out.println(s);
            System.out.println(s.name());
        }
    }


}