
public class Link extends Character{
	int classSpecial;
	int ultimate;
	
	public Link() {
		this.health = (int) (Math.random()*9)+4;
		
		
		
	}

	public void hasBeenAttacked(int attack) {
		this.health -= attack;
		System.out.println("I'm being attacked " + attack);
		System.out.println("Links health is: " + this.health);
	}

	public int getHealth() {
		
		return health;
	}

}
