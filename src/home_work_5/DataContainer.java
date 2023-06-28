package home_work_5;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;

public class DataContainer<T> implements Iterable<T> {
    private T[] data;
    private int size;
    private boolean isThereNullVar = false;

    public DataContainer(T[] data) {
        this.size = data.length;
        this.data = data;
        isThereNull();
    }

    public int add(T item) {
        if (item == null) {
            return -1;
        } else if (isThereNullVar) {
            int numberElement = getFirstNumberNullElement();
            this.data[numberElement] = item;
            isThereNull();
            return numberElement;
        } else {
            grow();
            int numberElement = size - 1;
            this.data[numberElement] = item;
            return numberElement;
        }
    }

    public T get(int index) {
        if (index >= 0 && index < this.data.length) {
            return this.data[index];
        } else return null;
    }

    public T[] getItems() {
        return this.data;
    }

    public boolean delete(int index) {
        if (index < 0 || index >= this.data.length) {
            return false;
        } else {
            T[] newArrData = Arrays.copyOf(this.data, this.data.length - 1);
            System.arraycopy(this.data, 0, newArrData, 0, index);
            System.arraycopy(this.data, index + 1, newArrData, index, this.data.length - index - 1);
            this.data = newArrData;
            return true;
        }
    }

    public boolean delete(T item) {
        int position = findElement(item);
        if (position >= 0 && position < data.length) {
            return delete(position);
        } else {
            return false;
        }
    }

    public void sort(Comparator<T> comparator) {
        nullGoToEnd();
        T temp = null;
        boolean didSwap = true;
        int left = 0;
        int right = isThereNullVar ? getFirstNumberNullElement() : this.data.length;
        while (didSwap) {
            didSwap = false;
            for (int i = left; i < right - 1; i++) {
                if ((comparator.compare(this.data[i], this.data[i + 1])) > 0) {
                    temp = this.data[i];
                    this.data[i] = this.data[i + 1];
                    this.data[i + 1] = temp;
                    didSwap = true;
                }
            }
            right--;
            for (int i = right; i > left; i--) {
                if ((comparator.compare(this.data[i - 1], this.data[i])) > 0) {
                    temp = this.data[i];
                    this.data[i] = this.data[i - 1];
                    this.data[i - 1] = temp;
                    didSwap = true;
                }
            }
            left++;
        }
    }

    public static <E extends Comparable<E>> void sort(DataContainer<E> container) {
        container.nullGoToEnd();

        E[] containerData = container.getItems();

        E temp = null;
        boolean didSwap = true;
        int left = 0;
        int right = container.isThereNullVar ? container.getFirstNumberNullElement() : containerData.length;

        while (didSwap) {
            didSwap = false;
            for (int i = left; i < right - 1; i++) {

                if (containerData[i].compareTo(containerData[i + 1]) > 0) {
                    temp = containerData[i];
                    containerData[i] = containerData[i + 1];
                    containerData[i + 1] = temp;
                    didSwap = true;
                }
            }
            right--;
            for (int i = right; i > left; i--) {

                if (containerData[i - 1].compareTo(containerData[i]) > 0) {
                    temp = containerData[i];
                    containerData[i] = containerData[i - 1];
                    containerData[i - 1] = temp;
                    didSwap = true;
                }
            }
            left++;
        }
    }

    public static <E> void sort(DataContainer<E> container, Comparator<E> comparator) {
        container.nullGoToEnd();
        E[] containerData = container.getItems();
        E temp = null;
        boolean didSwap = true;
        int left = 0;
        int right = container.isThereNullVar ? container.getFirstNumberNullElement() : containerData.length;
        while (didSwap) {
            didSwap = false;
            for (int i = left; i < right - 1; i++) {
                if ((comparator.compare(containerData[i], containerData[i + 1])) > 0) {
                    temp = containerData[i];
                    containerData[i] = containerData[i + 1];
                    containerData[i + 1] = temp;
                    didSwap = true;
                }
            }
            right--;
            for (int i = right; i > left; i--) {
                if ((comparator.compare(containerData[i - 1], containerData[i])) > 0) {
                    temp = containerData[i];
                    containerData[i] = containerData[i - 1];
                    containerData[i - 1] = temp;
                    didSwap = true;
                }
            }
            left++;
        }
    }

    private void nullGoToEnd() {
        if (isThereNullVar) {
            T temp = null;
            for (int i = 0; i < this.data.length; i++) {
                for (int j = 0; j < this.data.length - i - 1; j++) {
                    if (this.data[j] == null) {
                        temp = this.data[j];
                        this.data[j] = this.data[j + 1];
                        this.data[j + 1] = temp;
                    }
                }
            }
        }
    }

    private int findElement(T item) {
        int position = -1;
        if (item != null) {
            for (int i = 0; i < this.data.length; i++) {
                if (this.data[i].equals(item)) {
                    return i;
                }
            }
        }
        return position;
    }

    private void grow() {
        this.data = Arrays.copyOf(this.data, this.data.length + 1);
        size++;
    }

    private int getFirstNumberNullElement() {
        if (isThereNullVar) {
            for (int i = 0; i < this.data.length; i++) {
                if (data[i] == null) {
                    return i;
                }
            }
            return -1;
        } else return -1;
    }

    private void isThereNull() {
        isThereNullVar = false;
        for (T element : this.data) {
            if (element == null) {
                this.isThereNullVar = true;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[ ");
        for (int i = 0; i < this.data.length; i++) {

            if (this.data[i] != null) {
                if (isThereNullVar) {
                    if ((i != this.data.length - 1)
                            && (hasNextElement(i))) {
                        stringBuilder.append(this.data[i] + ", ");
                    } else {
                        stringBuilder.append(this.data[i]);
                    }

                } else {
                    if (i != this.data.length - 1) {
                        stringBuilder.append(this.data[i] + ", ");
                    } else {
                        stringBuilder.append(this.data[i]);
                    }
                }

            }

        }
        stringBuilder.append(" ]");
        return stringBuilder.toString();
    }

    private boolean hasNextElement(int index) {
        boolean hasElement = false;
        for (int i = index + 1; i < this.data.length; i++) {
            if (this.data[i] != null) {
                hasElement = true;
            }
        }
        return hasElement;
    }

    @Override
    public Iterator<T> iterator() {
        return new DataIterator<>(this.data);
    }

    private class DataIterator<T> implements Iterator<T> {
        T[] data;
        int index;

        public DataIterator(T[] data) {
            this.data = data;
            this.index = 0;
        }

        @Override
        public boolean hasNext() {
            return index < data.length;
        }

        @Override
        public T next() {
            return this.data[index++];
        }
    }


}
