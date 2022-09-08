public class Grades
{
    public static void main(String [] args)
    {
        double dailyAvg=88;
        double quizAvg=74;
        double testAvg=95;
        double sixWeeksAvg=0;

        sixWeeksAvg=(dailyAvg*0.3)+(quizAvg*0.2)+(testAvg*0.5);
        sixWeeksAvg+=0.5;
        int roundedAvg=(int)sixWeeksAvg;

        System.out.println("Daily Average = " + dailyAvg);
        System.out.println("Quiz Average = " + quizAvg);
        System.out.println("Test Average = " + testAvg);
        System.out.println("-------------------------------");
        System.out.println("Six Weeks Average = " + roundedAvg);
    }
}