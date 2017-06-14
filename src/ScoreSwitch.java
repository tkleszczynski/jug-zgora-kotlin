public class ScoreSwitch {
    String getScore(int score) {
        String grade;
        switch (score) {
        case 10:
        case 9:
            grade = "Excellent";
            break;
        case 8:
        case 7:
        case 6:
            grade = "Good";
            break;
        case 5:
        case 4:
            grade = "Ok";
            break;
        case 3:
        case 2:
        case 1:
            grade = "Fail";
            break;
        default:
            grade = "Fail";
        }
        return grade;
    }
}
