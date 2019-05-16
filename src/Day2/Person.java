package Day2;

public class Person {
    private String name = "John";

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    private String hairColor = "black";
    private String eyeColor = "brown";
    private String skinColor = "white";
    private Double height = 6.5;
    private Double weight = 60.0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person() {

    }

    public Person(String name, String hairColor, String eyeColor, String skinColor, Double height, Double weight) {
        this.name = name;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
        this.skinColor = skinColor;
        this.height = height;
        this.weight = weight;
    }

    public void Eat(String fruit) {
        System.out.println("Eating " + fruit);
    }

    public void Sleep(int time) {
        System.out.println("Sleep for" + time + "minutes");
    }

    public void Walk() {
        System.out.println("Walking");
    }

    public void Play() {
        System.out.println("Playing");
    }

    public void Study() {
        System.out.println("Studying");
    }
}
