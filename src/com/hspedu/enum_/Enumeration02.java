package com.hspedu.enum_;

/**
 * @author 李安福
 * @version 1.0
 */
public class Enumeration02 {
    public static void main(String[] args) {
        System.out.println(Season01.AUTUMN);
        System.out.println(Season01.SPRING);
    }
}
class Season01{
    private String name;
    private String desc;
    public static final Season01 SPRING = new Season01("春天","温暖");
    public static final Season01 WINTER = new Season01("冬天","寒冷");
    public static final Season01 SUMMER = new Season01("夏天","炎热");
    public static final Season01 AUTUMN = new Season01("秋天","凉爽");
    //构造器私有化，防止直接被new 出来,去掉set方法，防止被修改，只读，在season01内部创建固定的对象。
    private Season01(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season01{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}