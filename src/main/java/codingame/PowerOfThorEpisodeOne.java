package codingame;

public class PowerOfThorEpisodeOne {

    public static void main(String[] args) {

        int lightX = 10; // the X position of the light of power
        int lightY = 20; // the Y position of the light of power
        int initialTx = 0; // Thor's starting X position
        int initialTy = 0;
            String direction = "";

            if (initialTy < lightY)
            {
                initialTy++;
                direction = "S";
            }

            else if (initialTy > lightY)
            {
                initialTy--;
                direction = "N";
            }

            if (initialTx < lightX)
            {
                initialTx++;
                direction += "E";
            }

            else if (initialTx > lightX)
            {
                initialTx--;
                direction += "W";
            }

            System.out.println(direction);
    }
}
