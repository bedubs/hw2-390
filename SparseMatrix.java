/**
 * Created by william on 9/29/15.
 */
public class SparseMatrix extends Node {

    SparseMatrix sparseMatrix;
    HeadNode rowHeadNode, columnHeadNode;
    private Node head;

    public SparseMatrix () {
        head = new Node();
    }

    public SparseMatrix ( int rows, int cols ) {
        head = new Node();
        setRowHeadNode(rows);
        setColumnHeadNode(cols);
    }

    public boolean isEmpty() {
        if ( head.getNextInColumn() == null && head.getNextInRow() == null)
            return true;
        else
            return false;
    }

    public void addRowHead ( int position ) {
        rowHeadNode = new HeadNode( position );
        Node current = head;
        while ( current.getNextInRow() != null ) {
            current = current.getNextInRow();
        }
        current.setNextInRow(rowHeadNode);
    }

    public void addColumnHead ( int position ) {
        columnHeadNode = new HeadNode( position );
        Node current = head;
        while ( current.getNextInColumn() != null ) {
            current = current.getNextInColumn();
        }
        current.setNextInColumn(columnHeadNode);
    }

    public void setRowHeadNode ( int rows ) {
        Node current = head;
        for( int i=0; i<=rows; i++ ) {
            rowHeadNode = new HeadNode(i);
            current.setNextInRow(rowHeadNode);
            current = rowHeadNode;
        }
    }

    public void setColumnHeadNode ( int cols ) {
        Node current = head;
        for( int i=0; i<=cols; i++ ) {
            columnHeadNode = new HeadNode(i);
            current.setNextInColumn( columnHeadNode );
            current = columnHeadNode;
        }
    }

    void insert(int row, int column, int value){
        ValueNode newValue = new ValueNode( row, column, value );
    }

    //TODO SparseMatrix transpose() { return sparseMatrix; }

    //TODO SparseMatrix product(SparseMatrix sparseMatrix) {}

    //TODO void print(){}

    //TODO HeadNode getRow (int position) { return rowHeadNode;}

    //TODO HeadNode getCol (int position) { return columnHeadNode;}

    //TODO int get(int row, int col) { return 0; }

}
