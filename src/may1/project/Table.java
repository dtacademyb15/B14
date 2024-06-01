package may1.project;

import java.util.Objects;

public abstract class Table implements Reservable{

    private int capacity;
    private boolean isReserved;

    public Table(int capacity) {
        this.capacity = capacity;
        this.isReserved = false;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public void setReserved(boolean reserved) {
        isReserved = reserved;
    }

    @Override
    public String toString() {
        return "Table{" +
                "capacity=" + capacity +
                ", isReserved=" + isReserved +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Table table = (Table) o;
        return capacity == table.capacity && isReserved == table.isReserved;
    }

    @Override
    public int hashCode() {
        return Objects.hash(capacity, isReserved);
    }
}
