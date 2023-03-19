public class Hero2 {
    public String name;
    protected float hp;

    public void attackHero(Hero2 h) throws EnemyHeroIsDeadException{
        if(h.hp == 0){
            throw new EnemyHeroIsDeadException(h.name + " 已经挂了,不需要施放技能" );
        }
    }

    public String toString(){
        return name;
    }

    class EnemyHeroIsDeadException extends Exception{

        public EnemyHeroIsDeadException(){

        }
        public EnemyHeroIsDeadException(String msg){
            super(msg);
        }
    }

    public static void main(String[] args) {

        Hero2 garen =  new Hero2();
        garen.name = "盖伦";
        garen.hp = 616;

        Hero2 teemo =  new Hero2();
        teemo.name = "提莫";
        teemo.hp = 0;

        try {
            garen.attackHero(teemo);

        } catch (EnemyHeroIsDeadException e) {
            // TODO Auto-generated catch block
            System.out.println("异常的具体原因:"+e.getMessage());
            e.printStackTrace();
        }

    }
}
