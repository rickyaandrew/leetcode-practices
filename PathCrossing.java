import java.util.HashMap;

public class PathCrossing {
    public boolean isPathCrossing(String path) {
        String[] pathing = path.split("");

        int yCoordinate = 0;
        int xCoordinate = 0;

        HashMap<Integer, HashMap<Integer, Boolean>> mappings = new HashMap<>();
        mappings.put(yCoordinate, new HashMap<>());
        mappings.get(yCoordinate).put(xCoordinate, true);

        for (String direction: pathing) {
            System.out.println("(" + xCoordinate + "," + yCoordinate + ")");
            if (direction.equals("N")) {
                yCoordinate++;
            }
            else if (direction.equals("S")) {
                yCoordinate--;
            }
            else if (direction.equals("E")) {
                xCoordinate++;
            } else {
                xCoordinate--;
            }
            if (mappings.containsKey(yCoordinate)) {
                if (mappings.get(yCoordinate).containsKey(xCoordinate)) {
                    //have both
                    return true;
                } else {
                    // does not have x
                    mappings.get(yCoordinate).put(xCoordinate, true);
                }
            } else {
                //does not have y
                mappings.put(yCoordinate, new HashMap<>());
                mappings.get(yCoordinate).put(xCoordinate, true);
            }
        }
        return false;
    }
}
