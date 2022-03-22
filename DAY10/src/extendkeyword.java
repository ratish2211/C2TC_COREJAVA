
public class extendkeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abstract class Animals {
		    /** All kind of animals eat food so make this common to all animals. */
		    public void eat() {
		        System.out.println(" Eating ..........");
		    }

		    /** The make different sounds. They will provide their own implementation */
		    abstract void sound();
		}

		class cat extends Animals {
		    @Override
		    void sound() {
		        System.out.println("Meoww Meoww ........");
		    }
		}

		class dog extends Animals {
		    @Override
		    void sound() {
		        System.out.println("Woof Woof ........");
		    }

		}
	}
}


