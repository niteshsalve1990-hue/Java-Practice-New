package Lab011;

public class Salary {
    public static void main(String[] args) {
        double[] max_salary = {80000, 6000, 1923802, 380280, 79234};
        //double max = max_salary[0];
        double max = 20000;

        for (int i = 0; i < max_salary.length; i++) {
            if (max_salary[i] > max) {
                max = max_salary[i];
            }
        }
        System.out.println(max);
    }
}