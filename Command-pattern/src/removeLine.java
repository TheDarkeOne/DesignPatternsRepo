import java.io.*;

public class removeLine implements Command {
    int line = 0;


    public void execute(int line, String absolutePath){
        this.line = line;


        int num = -1;
        String fileContent = null;
        try{
        FileReader reader = new FileReader(absolutePath);
        BufferedReader bufferedReader = new BufferedReader(reader);

        String line1;

        while ((line1 = bufferedReader.readLine()) != null) {


            if(num != this.line){
            fileContent = fileContent + line1 + "\n";
            }
            num++;
        }
        reader.close();

    } catch (IOException e) {
        e.printStackTrace();
    }

        try(BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(absolutePath))) {
            File f = new File(absolutePath);
            if(f.exists()){
                f.delete();
                try {
                    f.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            bufferedOutputStream.write(fileContent.getBytes());
        } catch (IOException e) {

        }

    }
}
