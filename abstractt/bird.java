package abstractt;

public abstract class bird implements flyable {
    private final String breed;
    public bird(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

}
