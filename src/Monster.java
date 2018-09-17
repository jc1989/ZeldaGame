
public class Monster {
int attack;
int health;

public Monster(){ //THIS IS A CONSTRUCTOR. AKA AN INSTANCE OF A CLASS THAT CAN BE USED ANYWHERE.
	this.health = (int) (Math.random()*4);
	this.attack = (int) (Math.random()*2)+1;
	
	if (health == 0) {
	health++;
	if (attack == 0) {
	attack++;
	
	}
	}
}

public int getHealth() {
	
	return this.health;
	//This is a method that is used for monster health
}

public int attack() {
	//This attacks
	return this.attack;
}
}
