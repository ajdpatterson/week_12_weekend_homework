public enum PlaneType {
    BOEING747(100, 100),
    BOEING757(50, 50),
    BOEING123(5,5);

    private final int capacity;
    private final int weight;

    PlaneType(int capacity, int weight) {
        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getWeight(){
        return weight;
    }
}
