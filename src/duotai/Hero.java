package duotai;

//ADHero类
class ADHero extends Hero implements AD,Mortal{




    @Override
    public void die() {
        System.out.println(name+"这个物理英雄挂了");
    }
    @Override
    public void physicAttack(){
        System.out.println("进行物理攻击");
    }

}
//---------------------------------------------------------------------------
//APHero类
class APHero extends Hero implements AP, Mortal {
    @Override
    public void die() {
        System.out.println(name+"这个魔法英雄挂了");
    }
    @Override
    public void magicAttack(){
        System.out.println("进行魔法攻击");
    }
}
//---------------------------------------------------------------------------
//ADAPHero类
class ADAPHero extends Hero implements AD, AP ,Mortal{
    @Override
    public void die() {
        System.out.println(name+"这个混合英雄挂了");
    }
    @Override
    public void physicAttack(){
        System.out.println("进行物理攻击");
    }
    @Override
    public void magicAttack(){
        System.out.println("进行魔法攻击");
    }

}
//----------------------------------------------------------------------------
//Mortal接口
interface Mortal {
    public void die();
}
//AD接口
interface AD {
    //物理伤害
    public void physicAttack();
}
//AP接口
interface AP{
    public void magicAttack();
}

//----------------------------------------------------------------------------
//Hero类
public class Hero {
    public String name;
    protected float hp;
    float armor;
    int movespeed;

    public void kill(Mortal m) {
        System.out.println(name + "放了一个大招");
        m.die();
    }

    public static void main(String[] args) {
        Hero garen = new Hero();
        garen.name="盖伦";
        ADHero ace = new ADHero();
        ace.name = "艾希";
        APHero anny = new APHero();
        anny.name = "安妮";
        ADAPHero ez = new ADAPHero();
        ez.name = "探险家";

        garen.kill(ace);
        garen.kill(anny);
        garen.kill(ez);
    }
}
