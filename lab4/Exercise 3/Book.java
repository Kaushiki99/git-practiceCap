package lab4Assignments;

	public class Book extends WrittenItem {
	     public Book (int id, String title, int nC, String author) {
	        super(id, title, nC, author);
	    }




		public int getIdentificationNumber() { return super.getIdentificationNumber(); }
	    public String getTitle() { return super.getTitle(); }
	    public int getNumberOfCopies() { return super.getNumberOfCopies(); }

	    public void print() {
	        System.out.println("Display information about book:");
	        super.print();
	        System.out.println("Author of the book: " + super.getAuthor());
	    }
	    public void checkIn() { 
	    	super.checkIn(); 
	    	}
	    public void checkOut() { 
	    	super.checkOut(); 
	    }
	    public void addItems() { 
	    	super.addItems();
	    	}
	}

