import javax.management.PersistentMBean;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;

public class Cat {
    private String name;  //имя
    private int age;  //возраст
    private double weight;  //вес
    private String breed; //порода
    private String color;
    private double length;  //длина
    private double height;  //высота

    public Cat(String name) {
        this.name = name;
        this.age = 0;
    }


    public Cat(String name, int age, double weight, String breed, String color, double length, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.breed = breed;
        this.color = color;
        this.length = length;
        this.height = height;
    }

    public Cat() {
        this.name = "Nero";
        this.age = 2;
        this.weight = 5.3;
        this.breed = "Oriental";
        this.color = "Siam";
        this.length = 50;
        this.height = 30;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;

    }

    public void setAge(int age) {
        if ((age >= 0) && (age < 30)) {
            this.age = age;
            System.out.println("мяу верно: " + this.age);
        } else {
            System.out.print("хех ");
            System.out.println("неверно ");
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if ((weight < 20) && (weight >= 0))
            this.weight = weight;
        else System.out.println("друг ты не прав");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void meow() {
        int min = 0; // Min value
        int max = 1; // Max value
        String musicFile = "";
        int randomInt = (int) Math.floor(Math.random() * (max - min + 1) + min);
        switch (randomInt) {
            case 0:
                musicFile = "meow1.mp3";
                break;
            case 1:
                musicFile = "meow4.mp3";
                break;

        }

        com.sun.javafx.application.PlatformImpl.startup(() -> {
        });


        Media sound = new Media(new File(musicFile).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();

        ;
    }
}
