package md.tekwill.jf6.homework;

public class Exercise4 {

    static class Player {
        String name;
        int age;
        int points;

        public int getPoints(){
            return points;
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

        int sumOfPoints = 0;
        for(Player all:players){
            sumOfPoints += all.getPoints();
        }
        System.out.println("The sum of all player's points are: " + sumOfPoints);
        /*
        Print the sum of all player's points
        * */
        // Write your code here
    }
}
