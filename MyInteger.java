package pkgEmpty;

public class MyInteger {
	
	public int iValue;

	public MyInteger(int iValue) {
		super();
		this.iValue = iValue;
	}

	public int getiValue() {
		return iValue;
	}

	public void setiValue(int iValue) {
		this.iValue = iValue;
	}
	
	public boolean isEven(){
		return (iValue % 2 == 0);
	}
	
	public boolean isOdd(){
		return !isEven();
	}
	
	public boolean isPrime(){
		for(int x = 2; x<iValue; ++x){
			if (iValue % x == 0){
				return false;
			}
		}
		return true;
	}

	public static boolean isEven(int n){
		return (n % 2 == 0);
	}
	
	public static boolean isOdd(int n){
		return !isEven(n);
	}
	
	public static boolean isPrime(int n){
		for(int x = 2; x < n; ++x){
			if (n % x == 0){
				return false;
			}
		}
		return true;
	}
	
	public static boolean isEven(MyInteger n){
		return (n.getiValue() % 2 == 0);
	}
	
	public static boolean isOdd(MyInteger n){
		return !isEven(n);
	}
	
	public static boolean isPrime(MyInteger n){
		for(int x = 2; x < n.getiValue(); ++x){
			if (n.getiValue() % x == 0){
				return false;
			}
		}
		return true;
	}
	
	public boolean equals(int n){
		return (iValue == n);
	}

	public boolean equals(MyInteger n){
		return (iValue == n.getiValue());
	}







}
