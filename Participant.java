public class Participant {
    int fieldChoice;


    public Participant() {
        fieldChoice = (int) (Math.random() * 3) + 1;
    }


    public int getFieldChoice() {
        return fieldChoice;
    }

    public int participantChangesTheChoice(int emptyBox) {
        boolean[] test = new boolean[3];
        test[emptyBox - 1] = true;
        test[fieldChoice - 1] = true;
        for (int i = 0; i < test.length; i++) {
            if (test[i] == false) fieldChoice = i + 1;
        }
        return fieldChoice;
    }
}
