import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
    Team team = new Team("De Uovervindelige", 3);
    team.setRank(5);
    Team team2 = new Team("Tistroldene", 1);
    Team team3 = new Team("Vikingerne", 2);
    Team team4 = new Team("Troldmændene", 4);
    Team team5 = new Team("Grankoglerne", 5);

    team.addPlayer("Hans");
    team2.addPlayer("Grete");

    System.out.println(team.toString());
    System.out.println(team2.toString());

    }
}