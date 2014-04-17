package simpledb;

/** Unique identifier for HeapPage objects. */
public class HeapPageId implements PageId {

    /**
     * Constructor. Create a page id structure for a specific page of a
     * specific table.
     *
     * @param tableId The table that is being referenced
     * @param pgNo The page number in that table.
     */
	
	pageIDStruct firstStruct;
	
	private static class pageIDStruct {
		public int tableID;
		public int pgNumber;

		public pageIDStruct(int tableID, int pgNumber) {
			this.tableID = tableID;
			this.pgNumber = pgNumber;
		}
	}
	
    public HeapPageId(int tableId, int pgNo) {
        // some code goes here
    	firstStruct = new pageIDStruct(tableId, pgNo);
    }

    /** @return the table associated with this PageId */
    public int getTableId() {
        // some code goes here
    	return firstStruct.tableID;
//        return 0;
    }

    /**
     * @return the page number in the table getTableId() associated with
     *   this PageId
     */
    public int pageNumber() {
        // some code goes here
    	return firstStruct.pgNumber;
//        return 0;
    }

    /**
     * @return a hash code for this page, represented by the concatenation of
     *   the table number and the page number (needed if a PageId is used as a
     *   key in a hash table in the BufferPool, for example.)
     * @see BufferPool
     */
    public int hashCode() {
        // some code goes here
        throw new UnsupportedOperationException("implement this");
//        Integer i = firstStruct.tableID;
//        Integer j = firstStruct.pgNumber;
        
//        return firstStruct.tableID.toString() + firstStruct.pgNumber.toString();
    }

    /**
     * Compares one PageId to another.
     *
     * @param o The object to compare against (must be a PageId)
     * @return true if the objects are equal (e.g., page numbers and table
     *   ids are the same)
     */
    public boolean equals(Object o) {
        // some code goes here
        return false;
    }

    /**
     *  Return a representation of this object as an array of
     *  integers, for writing to disk.  Size of returned array must contain
     *  number of integers that corresponds to number of args to one of the
     *  constructors.
     */
    public int[] serialize() {
        int data[] = new int[2];

        data[0] = getTableId();
        data[1] = pageNumber();

        return data;
    }

}
