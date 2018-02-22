package md.tekwill.jf6.homework;

public class Exercise1 {

    static class Player {
        String name;
        int age;
        int points;

        @Override
        public String toString() {
            return "Player{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", points=" + points +
                    '}';
        }
    }

        public static void main(String[] args) {
        Player[] players = new Player[5];

        // Adding John
        players[0] = new Player();
        players[0].name = "John";
        players[0].age = 17;
        players[0].points = 200;

        // Adding Steven
        players[1] = new Player();
        players[1].name = "Steven";
        players[1].age = 14;
        players[1].points = 150;

        // Adding Maria
        players[2] = new Player();
        players[2].name = "Maria";
        players[2].age = 16;
        players[2].points = 250;

        // Adding Anna
        players[3] = new Player();
        players[3].name = "Anna";
        players[3].age = 15;
        players[3].points = 180;

        // Adding Igor
        players[4] = new Player();
        players[4].name = "Igor";
        players[4].age = 19;
        players[4].points = 270;

        /*
        Print all players, one on every line in the following format:
        Player{name='John', age=17, points=200}
        * */
        for(Player player : players) {
            System.out.println(player);
        }
    }
}
