package at.bas.projects.camera;

import java.util.Random;

public class Camera {
    private int pixels;
    private int weight;
    private int pictureSize;
    private SD sd;
    private Random random = new Random();

    public Camera(int pixels, int weight, int pictureSize, SD sd) {
        this.pixels = pixels;
        this.weight = weight;
        this.pictureSize = pictureSize;
        this.sd = sd;
    }

    public void takePicture() {
        Picture newPicture = new Picture(pictureSize, "" + random.nextInt() + ".jpg");
        System.out.println("Picture Taken: " + newPicture.getName());
        sd.SavePicture(newPicture);
    }

    public void printAllPictures() {
        for (Picture picture : sd.GetAllFiles()) {
            System.out.println(picture.getName());
        }
    }
}