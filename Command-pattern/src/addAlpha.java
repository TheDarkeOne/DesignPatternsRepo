import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class addAlpha implements Command {

    public void execute(int nl, String absolutePath){
        try(BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(absolutePath))) {
            String fileContent = "abcdefghijklmnopqrstuvwxyz";
            bufferedOutputStream.write(fileContent.getBytes());
        } catch (IOException e) {
            // exception handling
        }
    }
}
