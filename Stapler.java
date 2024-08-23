//Edit only code in this file

class Stapler{
    //Data
    private int staples;
    private boolean isOpen;
		private int capacity;
    
    //Methods (Behaviors)
    public Stapler(){
        staples = 0;
        isOpen = false;
    }
    
    public void loadStaples(int s){
        //Update staples variable to be s more, but no more than the total capacity (default is 500).
        //If s is not positive, ignore the value
        
        
    }
    
    public boolean staple(){
        //1.  If the stapler is closed and not out of staples, staple!
        //2.  Reduce the number of staples by 1 & return true.
        //If there was a problem stapling (not closed, out of staples) return false;
        
        return false;
    }
    
    public void open(){
        //Open the stapler
        
    }
    
    public void close(){
        //Close the stapler;
        
    }
    
    public int getStaples(){
        return staples;
    }
    
    public boolean isClosed(){
        return !isOpen;
    }
		/** Method to get print information about the Stapler
	@return returns a phrase like "This stapler has room for x staples" where x is the remaining capacity after accounting for staples in the Stapler
	**/
		public String toString(){
			return "";
		}
}
