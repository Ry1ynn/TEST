package task_6;

public class Rectangle {
    private int length;
    private int width;

    public boolean isRectangleSquare(int length, int width) {
        if(length==width) {
            return true;
        } else {
            return false;
        }
    }
}
