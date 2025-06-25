package ex_06_TernaryOperator;

public class Lab067_Real_Age_Classificaton {
    public static void main(String[] args) {
        // age = 23
        // age < 18 -> minor
        // 18 < age > 65 - adult
        // age > 65 -> senior citizen;

        int age = 45;
        String result = age < 18 ? "minor" : ( age < 65 ) ? "Adult" : "Senior citizen";
        System.out.println(result);
    }
}
