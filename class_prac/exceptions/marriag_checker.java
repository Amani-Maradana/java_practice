package exceptions;

public class marriag_checker {
	public void checkeligibility(int age) throws tooyoungException , toooldexception{
		if(age<18) {
			throw new tooyoungException("marriage cannot be approved age is less than 18 years");
		}
		else {
			if(age>60) {
				throw new toooldexception("marriage cannot be approved age is more than 60 years");
			}
			else {
				System.out.println("marrriage is approved details will be processed soon");
			}
		}
	}

	public static void main(String[] args) {
		marriag_checker check = new marriag_checker();
		try {
			check.checkeligibility(47);
		}catch(tooyoungException|toooldexception e) {
			e.printStackTrace();
		}

	}

}
