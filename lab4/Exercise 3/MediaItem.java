package lab4Assignments;

	public abstract class MediaItem extends Item {
	    private int runTime;
	    MediaItem(int id, String title, int nC, int runTime) {
	        super(id, title, nC);
	        this.runTime = runTime;
	    }


	    public String toString() { return super.toString() + runTime; }

	    public int getRunTime() { return runTime; }
	    public int getIdentificationNumber() { return super.getIdentificationNumber(); }
	    public String getTitle() { return super.getTitle(); }
	    public int getNumberOfCopies() { return super.getNumberOfCopies(); }


	    public boolean equals(Object o) {
	        if (o == null)
	            return false;
	        MediaItem m = (MediaItem) o;
	        return super.equals(m) && runTime == m.runTime;
	    }
	    public void checkIn() { super.checkIn(); }
	    public void checkOut() { super.checkOut(); }
	    public void addItems() { super.addItems(); }
	}

