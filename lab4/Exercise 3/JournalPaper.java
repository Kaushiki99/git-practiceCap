package lab4Assignments;

	public class JournalPaper extends WrittenItem {
	    private int publicationYear;
	    JournalPaper(int id, String title, int nC, String author, int publicationYear) {
	        super(id, title, nC, author);
	        this.publicationYear = publicationYear;
	    }


	    public String toString() { return super.toString() + publicationYear; }


	    public int getYear() { 
	    	return publicationYear; 
	    	}
	    public int getIdentificationYear() { 
	    	return super.getIdentificationNumber(); 
	    	}
	}

