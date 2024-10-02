import java.util.ArrayList;

public class Team {
    private String teamName;
    private int rank;
    private String names;
    private ArrayList<String> namesOfPlayers = new ArrayList<String>();

    public Team (String teamName, int rank){
        this.teamName = teamName;
        this.rank = rank;
    }

    public int setRank(int rank) {
        return this.rank;
    }

    public String toString() {
        return "Hold: " + teamName + "Rang: " + rank + " Navn til listen: " + namesOfPlayers;
    }

    public void addPlayer(String name) {
        namesOfPlayers.add(name);
    }


}
