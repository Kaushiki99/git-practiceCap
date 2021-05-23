package lab4Assignments;

	public class Item {
	    private int identificationNumber;
	    private String title;
	    private int numberOfCopies;


	    Item(int id, String tt, int nC) {
	        this.identificationNumber = id;
	        this.title = tt;
	        this.numberOfCopies = nC;
	    }

	    public int getIdentificationNumber() { return identificationNumber; }
	    public String getTitle() { return title; }
	    public int getNumberOfCopies() { return numberOfCopies; }


	    public void setIdentificationNumber(int id) { this.identificationNumber = id; }
	    public void setTitle(String tt) { this.title = tt; }
	    public void setNumberOfCopies(int nC) { this.numberOfCopies = nC; }


	    public void addItems() { numberOfCopies += 1; }
	    public void checkIn() { numberOfCopies += 1; }
	    public void checkOut() { numberOfCopies -= 1; }
	    public void print() { System.out.println("Identification number: " + identificationNumber + "\nTitle: " + title + "\nNumber of copies: " + numberOfCopies); }

	}

