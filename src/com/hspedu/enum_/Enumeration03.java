package com.hspedu.enum_;

/**
 * @author 李安福
 * @version 1.0
 */
public class Enumeration03 {
    public static void main(String[] args) {

//        Season boy = Season.SPRING;
//        System.out.println(boy.name());
//        System.out.println(boy.ordinal());
//        System.out.println(Season.AUTUMN);
//        System.out.println(Season.SPRING);
//        System.out.println(Season.SUMMER);
//        System.out.println(Season.WINTER);
        Season[] seasons = Season.values();
        for(Season season:seasons){
            System.out.println(season.name());
        }
    }
}

enum Season{
    SPRING("春天","温暖"),
    SUMMER("夏天","炎热"),
    AUTUMN("秋天","凉爽"),
    WINTER("冬天","寒冷");
    private String name;
    private String desc;

    private Season(String name, String desc) {
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
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}' + getName();
    }
}