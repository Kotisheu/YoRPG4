public class Boss extends Character {

    private String _name;

    public Boss(Character c) {
    		_name= "Boss";	
	    _hp = 75*_level;
	    _defense = _level * 15;
	    _attack = .95;
	    _strength = (int) (_level + (65 * Math.random()));
	    _speed= 50;
	    _level = c.getLevel+(int)(Math.random()*4);
	    _exp=_level*2;
	    _accuracy=.90;
    }	   

 public String getName(){
 	return _name;
 }
  public String getName(){
  	return _name;
  }
    public void normalize(){
    	
    }
    public  void skill(){
    	
    }
    public String about(){
    	String desc = "The big, bad boss.";
    	return desc;
    }
    
    public void statsUp(){
    	
    }
}
