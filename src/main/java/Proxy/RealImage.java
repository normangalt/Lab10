package Proxy;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class RealImage implements Image{
    private final String fileName;

    RealImage(String fileName){
        this.fileName = fileName;
    }
    public void display() {
        loadFromDisk();
    }
    public void loadFromDisk(){
        try {
            ImageIO.read(new File(fileName));
        } catch (IOException e) {
            System.out.println("Error.IOException.");
        }
    }
}
