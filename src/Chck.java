import java.util.Scanner;

public class Chck {
// private fields
	private Double _checkamount ;
	private String _Date;
	private String _payee;
	private String _memo;
	private double  _checknumber;
	private String _Nameofperson;
	Scanner scan = new Scanner ( System.in) ;
	
	// Constructor
	public   Chck( String Nameofperson ,Double checkamount,String Date, String payee , double checknumber ,String memo )
	{_checkamount = checkamount;
		_Date = Date;
			_payee = payee;
					_memo = memo;
							_checknumber = checknumber;
									_Nameofperson= Nameofperson ;
	}

	//Getter
	public Double getcheckamount() { return _checkamount ;}
			
	
			public  Double getchecknumber() { return _checknumber ;}
					
					public String getDate () { return _Date ;}
							
							public String getpayee () { return _payee ;}
								
									public String getmemo () { return _memo;}
	
	
	// Setters 
	
									
						
									
	public void setcheckamount( Double checkamount ) {_checkamount = checkamount; }


	public void setNameofperson(String Nameofperson){_Nameofperson = Nameofperson;}
	
			public void setDate ( String Date ){ _Date = Date;}
			
		
					public void setchecknumber( Double checknumber ){_checknumber = checknumber;}
							
											
			
						public void Setpayee  ( String payee)
					
						{_payee = payee;}
						
							public void Setmemo( String memo){ _memo = memo ;}
							
			public void quitscanner () {		
								scan.close() ;
			}


public String toString() {
return "Chck [_checkamount=" + _checkamount + ", _Date=" + _Date + ", _payee=" + _payee + ", _memo=" + _memo
		+ ", _checknumber=" + _checknumber + ", _Nameofperson=" + _Nameofperson + "]";}


}
							
							
	
											
									
	
	
	
	
	
	
	
	
	
	

