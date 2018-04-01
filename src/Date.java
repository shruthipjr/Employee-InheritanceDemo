
public class Date {

	private String month;
	private int day;
	private int year;
	
	public Date(String monthString, int day, int year)
	{
		setDate(monthString,day,year);
	}
	
	//Copy constructor
	public Date(Date aDate)
	{
		if(aDate == null)
		{
			System.out.println("Fatal Error");
			System.exit(0);
		}
		
		month = aDate.month;
		day = aDate.day;
		year = aDate.year;
	}

	public void setDate(String monthString, int day, int year)
	{
		if(dateOK(monthString, day, year))
		{
			this.month = monthString;
			this.day = day;
			this.year = year;
		}
		else
		{
			System.out.println("Fatal Error");
			System.exit(0);
		}
	}
	
	private boolean dateOK(String monthString, int dayInt, int yearInt)
	{
		
		if((dayInt <= 31 && dayInt > 0) && (yearInt >= 1000 && yearInt <= 9999))
			return true;
		else
			return false;
	}
	
	public boolean equals(Date aDate)
	{
		if((this.year == aDate.year) && 
				(this.getMonth(this.month) == aDate.getMonth(aDate.month))
				&& (this.day == aDate.day))
			return true;
		else
			return false;
	}
	
	public boolean precedes(Date aDate)
	{
		if(this.year < aDate.year)
			return true;
		else if(this.year > aDate.year)
			return false;
		else
		{
			if(this.getMonth(month) < aDate.getMonth(month))
				return true;
			else if(this.getMonth(month) > aDate.getMonth(month))
				return false;
			else
			{
				if(this.day < aDate.day)
					return true;
				else
					return false;
			}
		}
	}
	
	public void setDay(int day)
	{
		this.day = day;
	}
	
	public int getMonth(String month)
	{
		int mon = 0;
		switch(month)
		{
		case "Jan":
			mon = 1;
			break;
		case "Feb":
			mon = 2;
			break;
		case "Mar":
			mon = 3;
			break;
		case "Apr":
			mon = 4;
			break;
		case "May":
			mon = 5;
			break;
		case "Jun":
			mon = 6;
			break;	
		case "Jul":
			mon = 7;
			break;
		case "Aug":
			mon = 8;
			break;
		case "Sep":
			mon = 9;
			break;
		case "Oct":
			mon = 10;
			break;
		case "Nov":
			mon = 11;
			break;
		case "Dec":
			mon = 12;
			break;
		}
		return mon;
	}
	
	public String toString()
	{	
		return (month + "/" + day + "/" + year);
	}
	
	public void setYear(int year)
	{
		if( year >= 1000 && year <= 9999)
			this.year = year;
		else
		{
			System.out.println("Fatal Error");
			System.exit(0);
		}
	}
	
	
}

