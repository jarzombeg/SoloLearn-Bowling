import java.util.*;

public class Main {
    HashMap<String, Integer> players;

    Main() {
        players = new HashMap<String, Integer>();
    }

    public void addPlayer(String name, int p) {
        players.put(name, p);
    }

    //your code goes here
    public void getWinner() {

        Iterator<Integer> it = players.values().iterator();
        Integer max = it.next();
        for (Integer value : players.values()) {
            if (value > max)
                max = value;
        }


        String[] nameArr = new String[players.size()];
        nameArr = players.keySet().toArray(nameArr);

        int ageLimit = max;

        for (String emp : nameArr) {
            if (players.get(emp) < ageLimit) {
                players.remove(emp);
            }
        }
        Iterator<String> ot = players.keySet().iterator();
        String next  = ot.next();

        System.out.println(next);

    }
}


class Program {
    public static void main(String[] args) {
        Main game = new Main();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            String input = sc.nextLine();
            String[] values = input.split(" ");
            String name = values[0];
            int points = Integer.parseInt(values[1]);
            game.addPlayer(name, points);
        }
        game.getWinner();
    }
}
