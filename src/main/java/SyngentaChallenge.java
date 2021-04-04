import assessment.ImageAssessment;
import pattern.Context;
import pattern.SolutionOne;
import pattern.SolutionTwo;

public class SyngentaChallenge {
    public static final String FILE_NAME = "Syngenta.bmp";

    public static void main(String[] args) {
        String result;

        // Image Assessment
        ImageAssessment imageAssessment = new ImageAssessment();
        int numberOfGreens = imageAssessment.countGreens(FILE_NAME);
        System.out.println(numberOfGreens);

        // Solution One
        Context context = new Context(new SolutionOne());
        result = context.executeStrategy(FILE_NAME);
        System.out.println(result);

        // Solution Two
        context = new Context(new SolutionTwo());
        result = context.executeStrategy(FILE_NAME);
        System.out.println(result);

        // Solution Tree
    }
}
