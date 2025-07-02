public class Bar implements Comparable<Bar> {
    private final String name;
    private final String category;
    private final int value;

    // Constructor
    public Bar(String name, int value, String category) {
        this.name = name;
        this.value = value;
        this.category = category;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for value
    public int getValue() {
        return value;
    }

    // Getter for category
    public String getCategory() {
        return category;
    }

    // Compare bars by value
    @Override
    public int compareTo(Bar that) {
        return Integer.compare(this.value, that.value);
    }

    // String representation
    @Override
    public String toString() {
        return name + " " + value + " " + category;
    }
}
