package polymorphism_override;

public class OverrrideDemo {

	public static void main(String[] args) {
		//Late binding  ,Dynamic binding, runtime ploymorphism
		PLTraining p1=new PLTraining();
		p1.session("Full stack developer");
		//JFS object
		p1=new JFS();
		p1.session("Method overidding");
		//python object
		p1=new Python();
		p1.session("Method overriding");

	}

}