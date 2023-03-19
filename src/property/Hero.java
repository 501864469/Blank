package property;

public  class Hero {
  private String name;
  protected float hp;
  static String copyright;
  static{
    System.out.println("初始化copyright");
    copyright="版权由我所有";
  }
  public Hero(String name){
    this.name=name;

  }
  public Hero(){

  }
  public String getName(){
    return name;
  }
  public void setName(String name){
    this.name=name;
  }

  public String toString(){
    return name;
  }

  public static void main(String[] args) {

    Hero h = new Hero("盖伦");

    System.out.println(h.toString());
    //直接打印对象就是打印该对象的toString()返回值
    System.out.println(h);
  }
}
  