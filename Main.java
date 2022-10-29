public class Main {
    public static void main(String[] args) {
        Participant [] participant = new Participant [10000000];
        TvShow tvShow = new TvShow();
        for (int i = 0; i < participant.length; i++) {
            participant[i]=new Participant();
            tvShow.newShow();
            var emptyBox = tvShow.openEmptyBox(participant[i].getFieldChoice());
            tvShow.resultsOfTheShow(participant[i].participantChangesTheChoice(emptyBox));
        }
        System.out.println("Total Game: " + tvShow.getTotalGame());
        System.out.println("Total Win: " + tvShow.getTotalWins());
        System.out.println("Percentage of wins: " + (tvShow.getTotalWins()*100)/tvShow.getTotalGame());


    }
}
