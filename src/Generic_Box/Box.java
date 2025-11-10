package Generic_Box;

class Box<T> {
    private T value;  // This can store any type

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}

