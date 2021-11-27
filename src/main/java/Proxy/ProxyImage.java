package Proxy;

public class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;
    ProxyImage(String filename){
        this.fileName = filename;
        this.realImage = new RealImage(fileName);
    }
    public void display() {
        this.realImage.display();
    }
}
