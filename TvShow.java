public class TvShow {
    int boxWithACar;
    int totalGame;
    int totalWins;


    public TvShow() {
        boxWithACar = (int) (Math.random() * 3) + 1;
        totalGame = 0;
        totalWins = 0;
    }

    public void newShow() {
        boxWithACar = (int) (Math.random() * 3) + 1;
    }

    public int openEmptyBox(int participantSelect) {
        int openedBox;
        do {
            openedBox = (int) (Math.random() * 3) + 1;
        } while (openedBox == participantSelect || openedBox == boxWithACar);
        return openedBox;
    }

    public void resultsOfTheShow(int finalChoice) {
        if (finalChoice == boxWithACar) {
            totalWins++;
        }
        totalGame++;
    }

    public int getTotalGame() {
        return totalGame;
    }

    public int getTotalWins() {
        return totalWins;
    }
}
