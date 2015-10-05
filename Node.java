/**
 * Created by william on 9/29/15.
 */
public class Node {
    Node nextInRow;
    Node nextInColumn;

    public void setNextInColumn(Node nextInColumn) {
        this.nextInColumn = nextInColumn;
    }

    public void setNextInRow(Node nextInRow) {
        this.nextInRow = nextInRow;
    }

    public Node getNextInColumn() {
        return nextInColumn;
    }

    public Node getNextInRow() {
        return nextInRow;
    }

}
