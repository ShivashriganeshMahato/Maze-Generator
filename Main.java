import gen.Maze;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Shivashriganesh Mahato
 */
public class Main {
    private static final String FileName = "mazes.txt";

    public static void main(String[] args) {
        BufferedWriter bw = null;
        FileWriter fw = null;

        StringBuilder content = new StringBuilder();

        for (int i = 0; i < 1; i++) {
            Maze maze = new Maze(20, 20);
            maze.generate();
            content.append(maze.printMazeToString());
            content.append("\n\n\n");
        }

        try {
            fw = new FileWriter(FileName);
            bw = new BufferedWriter(fw);
            bw.write(content.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null)
                    bw.close();
                if (fw != null)
                    fw.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
