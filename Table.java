package JavaOOP.Lesson2HomeWork;

public class Table {
    private Shape table [] = new Shape[4];

    public Shape[] getTable() {
        return table;
    }

    public void addShape(int number, Shape shape) {
        if (number < this.table.length) {
            this.table[number] = shape;
        } else {
            throw new IllegalArgumentException("Number must be between 0 and 3, but actually is: " + number);
        }
    }

    public void deleteShape(int number) {
        if (number < this.table.length) {
            this.table[number] = null;
        } else {
            throw new IllegalArgumentException("Number must be between 0 and 3, but actually is: " + number);
        }
    }

    public String showAllShapes() {
        return toString();
    }

    @Override
    public String toString() {
        String ret = "Table contains:\n";
        String temp;
        for (int i = 0; i < this.table.length; i++) {
            if (table[i] != null) {
                temp = this.table[i].toString();
                ret = ret + (i + 1) + ". " + temp + "\n";
            } else {
                ret = ret + (i + 1) + ". Empty here! \n";
            }
        }
        return ret;
    }
}
