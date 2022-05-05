public class Collection {
    private static final int MIN_CAPACITY = 3;
    private static Object []data = null;
    private static int numObjects = 0;

    public Collection(int initialCapacity) {
        data = new Object[initialCapacity];
    }

    public Collection() {
        data = new Object[MIN_CAPACITY];
    }

    public static void insert(float element, int position) {
        if (numObjects == data.length) {
            Object []aux = data;
            data = new Object[data.length * 2];

            for (int i = 0; i < numObjects; i++) {
                data[i] = aux[i];
            }

            aux = null;
        }

        for (int i = numObjects - 1; i >= position; i--) {
            data[i + 1] = data[i];
        }

        data[position] = element;
        numObjects++;
    }

    public static void add(float element) {
        insert(element, numObjects);
    }

    public float delete(int position) {
        Object aux = data[position];

        for (int i = position; i < numObjects -1; i++) {
            data[i] = data[i + 1];
        }
        data[numObjects - 1] = null;
        numObjects--;
        return (float) aux;
    }

    public float getElement(int position) {
        return (float) data[position];
    }

    public int getNumObjects() {
        return numObjects;
    }

    public static void enqueue(float element) {
        add(element);
    }

    public float dequeue() {
        return (float) delete(0);
    }

}